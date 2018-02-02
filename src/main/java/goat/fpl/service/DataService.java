package goat.fpl.service;

import java.io.IOException;
import java.util.Optional;

import goat.fpl.model.BootstrappedData;
import goat.fpl.model.EntryPicksRoot;
import goat.fpl.model.EntryRoot;
import goat.fpl.model.EntryTransfers;
import goat.fpl.model.LeagueRoot;
import goat.fpl.model.LiveEvent;

public interface DataService {

    Optional<EntryPicksRoot> findEntryEventPicksRoot(long entryId, int eventNumber) throws IOException;

    Optional<EntryRoot> findEntryRoot(long entryId) throws IOException;

    Optional<EntryTransfers> findEntryTransfers(long entryId) throws IOException;

    Optional<LeagueRoot> findLeagueRoot(long leagueId, long page, int phase) throws IOException;

    Optional<LiveEvent> findLiveEvent(long eventNumber) throws IOException;

    /**
     * Retrieve data from bootstrap-static. Here you can find all kind-a useful
     * data.
     */
    Optional<BootstrappedData> getBootstrapData() throws IOException;
}
