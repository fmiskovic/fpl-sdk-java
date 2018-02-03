package goat.fpl.service;

import goat.fpl.model.BootstrappedData;
import goat.fpl.model.EntryPicksRoot;
import goat.fpl.model.EntryRoot;
import goat.fpl.model.EntryTransfers;
import goat.fpl.model.LeagueRoot;
import goat.fpl.model.LiveEvent;

import java.io.IOException;
import java.util.Optional;

public interface DataService {

    /**
     * By calling this method you can get data for single fpl team in single game week.
     * Data could be active chips, points, player picks etc.
     * This is useful to get live data for some fpl team.
     *
     * @param entryId     ID of fantasy team.
     * @param eventNumber Game week number.
     * @return POJO EntryPicksRoot parsed from json data.
     * @throws IOException
     */
    Optional<EntryPicksRoot> findEntryEventPicksRoot(long entryId, int eventNumber) throws IOException;

    /**
     * By calling this method you can get data for single fpl team data.
     * Data could be chips, entry name, origin, bank, leagues of that fpl team, cup,
     * history for all played game weeks etc.
     *
     * @param entryId ID of fantasy team.
     * @return POJO EntryRoot parsed from json data.
     * @throws IOException
     */
    Optional<EntryRoot> findEntryRoot(long entryId) throws IOException;

    /**
     * By calling this method you can get all transfer history for specified fpl team.
     * Also wild card info, leagues etc.
     *
     * @param entryId ID of fantasy team.
     * @return POJO EntryTransfers parsed from json data.
     * @throws IOException
     */
    Optional<EntryTransfers> findEntryTransfers(long entryId) throws IOException;

    /**
     * By calling this method you can get data for specified league.
     * Usually it is classic league, but i think it can be Overall.
     * Available data is for example league name, league id,
     * standings which is entry ranking for that league, etc.
     *
     * @param leagueId
     * @param page     Single page of 50 entries.
     *                 Some leagues can have more than 50 teams, so you must use pagination.
     * @param phase    Phase could be by month (August, September etc) or Overall.
     *                 1 = Overall, 2 = August, 3 = September etc.
     * @return POJO LeagueRoot parsed from json data.
     * @throws IOException
     */
    Optional<LeagueRoot> findLeagueRoot(long leagueId, long page, int phase) throws IOException;

    Optional<LiveEvent> findLiveEvent(long eventNumber) throws IOException;

    /**
     * Retrieve data from bootstrap-static. Here you can find all kind-a useful
     * data like elements(players), events(game weeks), teams(PL teams), phases(Overall, August, September...)
     */
    Optional<BootstrappedData> getBootstrapData() throws IOException;
}
