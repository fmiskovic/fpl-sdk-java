package goat.fpl.service.impl;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.logging.Logger;

import goat.fpl.model.BootstrappedData;
import goat.fpl.model.EntryPicksRoot;
import goat.fpl.model.EntryRoot;
import goat.fpl.model.EntryTransfers;
import goat.fpl.model.LeagueRoot;
import goat.fpl.model.LiveEvent;
import goat.fpl.service.DataService;
import goat.fpl.utils.JsonParserHelper;
import goat.fpl.utils.URLS;
import goat.fpl.utils.UrlHelper;

public class DataServiceImpl implements DataService {

    public static final DataService INSTANCE = new DataServiceImpl();

    private final static Logger LOGGER = Logger.getLogger(DataServiceImpl.class.getName());

    private Map<String, Optional<byte[]>> cache = null;

    private DataServiceImpl() {
	// init cache
	if (Objects.isNull(cache)) {
	    cache = new HashMap<>();
	}
    }

    public Optional<EntryPicksRoot> findEntryEventPicksRoot(long entryId, int eventNumber) throws IOException {
	String path = String.format(URLS.ENTRY_EVENT_PICKS, entryId, eventNumber);
	Optional<byte[]> data = fetchData(path);
	return data.isPresent() ? Optional.of(JsonParserHelper.readValue(data.get(), EntryPicksRoot.class))
		: Optional.empty();
    }

    public Optional<EntryRoot> findEntryRoot(long entryId) throws IOException {
	String path = String.format(URLS.ENTRY_HISTORY, entryId);
	Optional<byte[]> data = fetchData(path);
	return data.isPresent() ? Optional.of(JsonParserHelper.readValue(data.get(), EntryRoot.class))
		: Optional.empty();
    }

    public Optional<EntryTransfers> findEntryTransfers(long entryId) throws IOException {
	String path = String.format(URLS.ENTRY_TRANSFERS, entryId);
	Optional<byte[]> data = fetchData(path);
	return data.isPresent() ? Optional.of(JsonParserHelper.readValue(data.get(), EntryTransfers.class))
		: Optional.empty();
    }

    public Optional<LeagueRoot> findLeagueRoot(long leagueId, long page, int phase) throws IOException {
	String path = String.format(URLS.LEAGUE, leagueId, phase, page, page);
	Optional<byte[]> data = fetchData(path);
	return data.isPresent() ? Optional.of(JsonParserHelper.readValue(data.get(), LeagueRoot.class))
		: Optional.empty();
    }

    public Optional<LiveEvent> findLiveEvent(long eventNumber) throws IOException {
	// TODO:implement
	return null;
    }

    public Optional<BootstrappedData> getBootstrapData() throws IOException {
	Optional<byte[]> data = fetchData(URLS.BOOTSTRAP);
	return data.isPresent() ? Optional.of(JsonParserHelper.readValue(data.get(), BootstrappedData.class))
		: Optional.empty();
    }

    protected Optional<byte[]> fetchData(String path) throws IOException {
	Optional<byte[]> data = cache.computeIfAbsent(path, k -> Optional.empty());
	if (data.isPresent()) {
	    return data;
	}

	String url = UrlHelper.getURL(path);

	URL obj = new URL(url);

	HttpURLConnection conn = (HttpURLConnection) obj.openConnection();

	conn.setRequestMethod("GET");

	LOGGER.info(String.format("Sending 'GET' request to URL : %s", url));

	int responseCode = conn.getResponseCode();

	LOGGER.info(String.format("Response Code : %s", responseCode));

	if (200 == responseCode) {
	    try (InputStream in = conn.getInputStream(); ByteArrayOutputStream out = new ByteArrayOutputStream()) {
		int read = in.read();
		while (read != -1) {
		    out.write(read);
		    read = in.read();
		}
		byte[] rawData = out.toByteArray();
		Optional<byte[]> optional = Optional.of(rawData);
		cache.putIfAbsent(path, optional);
		return optional;
	    } catch (IOException e) {
		throw new IOException(e.getMessage(), e);
	    }
	}

	return Optional.empty();
    }
}
