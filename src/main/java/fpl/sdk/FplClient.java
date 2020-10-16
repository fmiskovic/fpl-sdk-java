package fpl.sdk;

import com.fasterxml.jackson.core.JsonProcessingException;
import fpl.sdk.http.DefaultHttpClientProvider;
import fpl.sdk.http.HttpClientProvider;
import fpl.sdk.model.*;
import fpl.sdk.utils.JsonUtils;
import fpl.sdk.utils.URLS;
import fpl.sdk.utils.UrlBuilder;
import io.vavr.control.Try;

import java.net.http.HttpResponse;
import java.util.Optional;
import java.util.stream.Stream;

public class FplClient {

    private final String baseUrl;

    private final HttpClientProvider<HttpResponse<String>> provider;

    public FplClient() {
        this(URLS.BASE);
    }

    public FplClient(String baseUrl) {
        this(baseUrl, new DefaultHttpClientProvider());
    }

    public FplClient(String baseUrl, HttpClientProvider<HttpResponse<String>> provider) {
        this.baseUrl = baseUrl;
        this.provider = provider;
    }

    /**
     * Retrieve data from bootstrap-static. Here you can find all kind-a useful
     * data like elements(players), events(game weeks), teams(PL teams), phases(Overall, August, September...)
     *
     * @return POJO {@link BootstrappedData} parsed from json data.
     */
    public Optional<BootstrappedData> getBootstrapData() {
        return Optional.of(executeRequest(URLS.BOOTSTRAP, BootstrappedData.class));
    }

    /**
     * Returns a collection of all element types in the game. Element types could be
     * Goalkeeper(GKP) Defender(DEF), Midfielder(MID) and FORWARD(FWD).
     *
     * @return Stream of {@link ElementType} parsed from json data.
     */
    public Stream<ElementType> getElementTypes() {
        return getBootstrapData().stream().flatMap(d -> d.getElement_types().stream());
    }

    /**
     * Returns a collection of all elements. By calling this method, you can find
     * useful information about PL players, like player price, form, transfer
     * in/out, goal scored, yellow cards etc.
     *
     * @return Stream of {@link Element} parsed from json data.
     */
    public Stream<Element> getElements() {
        return getBootstrapData().stream().flatMap(data -> data.getElements().stream());
    }

    /**
     * Returns Entry(FPL team) summary / details like form, goal scored, yellow
     * cards, red cards, transfer out/in etc.
     *
     * @param entryId ID of fantasy team.
     * @return POJO {@link Entry} parsed from json data.
     */
    public Optional<Entry> findEntry(long entryId) {
        return findEntryRoot(entryId).map(EntryRoot::getEntry);
    }

    /**
     * Returns chip(Wild Card, Free Hit, Bench Boost etc) details of a specified
     * Entry(FPL team).
     *
     * @param entryId ID of fantasy team.
     * @return Stream of {@link EntryChip} parsed from json data.
     */
    public Stream<EntryChip> findEntryChips(long entryId) {
        return findEntryRoot(entryId).stream().flatMap(root -> root.getChips().stream());
    }

    /**
     * Returns a details of a specified event for specific entry (FPL team). For
     * example you can get total points and points of specified event (Game Week),
     * bank, ranking, transfer cost etc.
     *
     * @param entryId     ID of fantasy team.
     * @param eventNumber The event number (Game Week number).
     * @return Stream of {@link EntryEvent} parsed from json data.
     */
    public Stream<EntryEvent> findEntryEvent(long entryId, int eventNumber) {
        return findEntryEventPicksRoot(entryId, eventNumber).stream().map(EntryPicksRoot::getEntry_history);
    }

    /**
     * Returns a collection of completed or ongoing events. For example you can get
     * total points and points of specified event(Game Week), bank, ranking,
     * transfer cost etc for all completed events.
     *
     * @param entryId ID of fantasy team.
     * @return Stream of {@link EntryEvent} parsed from json data.
     */
    public Stream<EntryEvent> findEntryEvents(long entryId) {
        return findEntryRoot(entryId).stream().flatMap(root -> root.getHistory().stream());
    }

    /**
     * Returns a collection of picks for a specified event for specific entry(FPL
     * team). By calling this method you can find what is particular entry pick for
     * players.
     *
     * @param entryId ID of fantasy team.
     * @param event   The event number (Game Week number).
     * @return Stream of {@link EntryPick} parsed from json data.
     */
    public Stream<EntryPick> findEntryPicksByEvent(long entryId, int event) {
        return findEntryEventPicksRoot(entryId, event).stream().flatMap(picks -> picks.getPicks().stream());
    }

    /**
     * Returns transfer history of an entry. You can find what player is transfered
     * in/out, cost etc for each played GW for specified entry(FPL team).
     *
     * @param entryId ID of fantasy team.
     * @return Stream of {@link EntryTransferHistory} parsed from json data.
     */
    public Stream<EntryTransferHistory> findEntryTransferHistory(long entryId) {
        return findEntryTransfers(entryId).stream().flatMap(transfers -> transfers.getHistory().stream());
    }

    /**
     * Returns the total number of entries(FPL teams). For some reason, when Game
     * Week is not active, it will return 0.
     *
     * @return total number of entries.
     */
    public long getTotalNumberOfEntries() {
        return getBootstrapData().map(BootstrappedData::getTotal_players).orElse(0L);
    }

    /**
     * By calling this method you can get data for single fpl team in single game
     * week. Data could be active chips, points, player picks etc. This is useful to
     * get live data for some fpl team.
     *
     * @param entryId     ID of fantasy team.
     * @param eventNumber Game week number.
     * @return POJO {@link EntryPicksRoot} parsed from json data.
     */
    public Optional<EntryPicksRoot> findEntryEventPicksRoot(long entryId, int eventNumber) {
        String path = String.format(URLS.ENTRY_EVENT_PICKS, entryId, eventNumber);
        return Optional.of(executeRequest(path, EntryPicksRoot.class));
    }

    /**
     * By calling this method you can get data for single fpl team data.
     * Data could be chips, entry name, origin, bank, leagues of that fpl team, cup,
     * history for all played game weeks etc.
     *
     * @param entryId ID of fantasy team.
     * @return POJO {@link EntryRoot} parsed from json data.
     */
    public Optional<EntryRoot> findEntryRoot(long entryId) {
        String path = String.format(URLS.ENTRY_HISTORY, entryId);
        return Optional.of(executeRequest(path, EntryRoot.class));
    }

    /**
     * By calling this method you can get all transfer history for specified fpl team.
     * Also wild card info, leagues etc.
     *
     * @param entryId ID of fantasy team.
     * @return POJO {@link EntryTransfers} parsed from json data.
     */
    public Optional<EntryTransfers> findEntryTransfers(long entryId) {
        String path = String.format(URLS.ENTRY_TRANSFERS, entryId);
        return Optional.of(executeRequest(path, EntryTransfers.class));
    }

    /**
     * By calling this method you can get data for specified league. Usually it is
     * classic league, but i think it can be Overall. Available data is for example
     * league name, league id, standings which is entry ranking for that league,
     * etc.
     *
     * @param leagueId ID of fpl league.
     * @param page     Single page of 50 entries. Some leagues can have more than 50
     *                 teams, so you must use pagination.
     * @param phase    Phase could be by month (August, September etc) or Overall. 1 =
     *                 Overall, 2 = August, 3 = September etc.
     * @return POJO {@link LeagueRoot} parsed from json data.
     */
    public Optional<LeagueRoot> findLeagueRoot(long leagueId, long page, int phase) {
        String path = String.format(URLS.LEAGUE, leagueId, phase, page, page);
        return Optional.of(executeRequest(path, LeagueRoot.class));
    }

    /**
     * Returns specified details of a classic league.
     *
     * @param leagueId The id of the league
     * @return POJO {@link League} parsed from json data.
     */
    Optional<League> findLeague(long leagueId) {
        //TODO: implement
        return Optional.empty();
    }

    /**
     * Returns specified standings of a classic league.
     *
     * @param leagueId The id of the league
     * @param page     The page number of the standings (50 results per page)
     * @return POJO {@link LeagueStandings} parsed from json data.
     */
    Optional<LeagueStandings> findLeagueStandings(long leagueId, int page) {
        //TODO: implement
        return Optional.empty();
    }

    /**
     * Returns a stream of all teams.
     */
    Stream<Team> getTeams() {
        //TODO: implement
        return Stream.empty();
    }

    public Optional<LiveEvent> findLiveEvent(long eventNumber) {
        String path = String.format(URLS.EVENT_LIVE, eventNumber);
        return Optional.of(executeRequest(path, LiveEvent.class));
    }

    /**
     * Returns all element data for a specified event.
     *
     * @param event The event number
     * @return POJO {@link EventElements} parsed from json data.
     */
    public Stream<EventElements> findElementsByEvent(int event) {
        Optional<LiveEvent> liveEvent = findLiveEvent(event);
        return liveEvent.stream().flatMap(live->live.getElements().stream());
    }

    /**
     * Returns the current event number.
     */
    int getCurrentEventNumber() {
        //TODO: implement
        return 0;
    }

    /**
     * Returns a stream of all events.
     */
    Stream<Event> getEvents() {
        //TODO: implement
        return Stream.empty();
    }

    private <T> T executeRequest(String relativePath, Class<T> returnType) {
        return Try.of(() -> {
            String url = new UrlBuilder()
                    .baseUrl(this.baseUrl)
                    .relativePath(relativePath)
                    .build();
            return handleResponse(provider.executeGET(url), returnType);
        }).onFailure(RuntimeException::new).get();
    }

    private <T> T handleResponse(HttpResponse<String> response, Class<T> returnType) throws JsonProcessingException {
        if (response.statusCode() >= 400) {
            // TODO: Customize exception
            throw new RuntimeException(response.body());
        }
        return JsonUtils.fromJson(response.body(), returnType);
    }
}
