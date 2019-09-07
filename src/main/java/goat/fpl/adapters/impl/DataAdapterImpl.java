package goat.fpl.adapters.impl;

import goat.fpl.model.*;
import goat.fpl.adapters.DataAdapter;
import goat.fpl.utils.JsonParserHelper;
import goat.fpl.utils.URLS;
import goat.fpl.utils.UrlHelper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.logging.Logger;

public class DataAdapterImpl implements DataAdapter {

    public static final DataAdapter INSTANCE = new DataAdapterImpl();

    private final static Logger LOGGER = Logger.getLogger(DataAdapterImpl.class.getName());

    private final Map<String, Optional<String>> cache;

    private final HttpClient httpClient;

    private DataAdapterImpl() {
        cache = new HashMap<>();
        httpClient = HttpClient.newBuilder().build();
    }

    public Optional<EntryPicksRoot> findEntryEventPicksRoot(long entryId, int eventNumber) throws IOException, InterruptedException {
        String path = String.format(URLS.ENTRY_EVENT_PICKS, entryId, eventNumber);
        Optional<String> data = fetchData(path);
        return data.map(s -> JsonParserHelper.readValue(s, EntryPicksRoot.class));
    }

    public Optional<EntryRoot> findEntryRoot(long entryId) throws IOException, InterruptedException {
        String path = String.format(URLS.ENTRY_HISTORY, entryId);
        Optional<String> data = fetchData(path);
        return data.map(s -> JsonParserHelper.readValue(s, EntryRoot.class));
    }

    public Optional<EntryTransfers> findEntryTransfers(long entryId) throws IOException, InterruptedException {
        String path = String.format(URLS.ENTRY_TRANSFERS, entryId);
        Optional<String> data = fetchData(path);
        return data.map(s -> JsonParserHelper.readValue(s, EntryTransfers.class));
    }

    public Optional<LeagueRoot> findLeagueRoot(long leagueId, long page, int phase) throws IOException, InterruptedException {
        String path = String.format(URLS.LEAGUE, leagueId, phase, page, page);
        Optional<String> data = fetchData(path);
        return data.map(s -> JsonParserHelper.readValue(s, LeagueRoot.class));
    }

    public Optional<LiveEvent> findLiveEvent(long eventNumber) throws IOException, InterruptedException {
        String path = String.format(URLS.EVENT_LIVE, eventNumber);
        Optional<String> data = fetchData(path);
        return data.map(s -> JsonParserHelper.readValue(s, LiveEvent.class));
    }

    public Optional<BootstrappedData> getBootstrapData() throws IOException, InterruptedException {
        Optional<String> data = fetchData(URLS.BOOTSTRAP);
        return data.map(s -> JsonParserHelper.readValue(s, BootstrappedData.class));
    }

    private Optional<String> fetchData(String path) throws InterruptedException, IOException {
        Optional<String> data = cache.computeIfAbsent(path, k -> Optional.empty());
        if (data.isPresent()) {
            return data;
        }

        String url = UrlHelper.getURL(path);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        LOGGER.info(String.format("Sending 'GET' request to URL : %s", url));

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        return 200 == response.statusCode() ? Optional.of(response.body()) : Optional.empty();
    }
}
