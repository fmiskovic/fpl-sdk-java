package goat.fpl.service;

import java.io.IOException;
import java.util.Optional;
import java.util.stream.Stream;

import goat.fpl.model.Entry;
import goat.fpl.model.EntryChip;
import goat.fpl.model.EntryEvent;
import goat.fpl.model.EntryPick;
import goat.fpl.model.EntryTransferHistory;

public interface EntryService {

    /**
     * Returns entry summary / details.
     *
     * @param entryId
     *            The id of entry
     */
    Optional<Entry> findEntry(long entryId) throws IOException;

    /**
     * Returns chip details of a specified entry
     *
     * @param entryId
     *            The id of entry
     * @param eventNumber
     *            The event number
     */
    Stream<EntryChip> findEntryChips(long entryId, int eventNumber) throws IOException;

    /**
     * Returns a details of a specified event
     *
     * @param entryId
     *            The id of entry
     * @param eventNumber
     *            The event number
     */
    Stream<EntryEvent> findEntryEvent(long entryId, int eventNumber) throws IOException;

    /**
     * Returns a collection of completed or ongoing events
     *
     * @param entryId
     *            The id of entry
     */
    Stream<EntryEvent> findEntryEvents(long entryId) throws IOException;

    /**
     * Returns a collection of picks for a specified event
     *
     * @param entryId
     *            The id of entry
     * @param event
     *            The event number
     */
    Stream<EntryPick> findEntryPicksByEvent(long entryId, int event) throws IOException;

    /**
     * Returns transfer history of an entry
     *
     * @param entryId
     *            The id of entry
     */
    Stream<EntryTransferHistory> findEntryTransferHistory(long entryId) throws IOException;

    /**
     * Returns the total number of entries
     */
    int getTotalNumberOfEntries() throws IOException;
}
