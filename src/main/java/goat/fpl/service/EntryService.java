package goat.fpl.service;

import java.io.IOException;
import java.util.Optional;
import java.util.stream.Stream;

import goat.fpl.model.Entry;
import goat.fpl.model.EntryChip;
import goat.fpl.model.EntryEvent;
import goat.fpl.model.EntryPick;
import goat.fpl.model.EntryTransferHistory;

/**
 * Use this service to get data about specific Entry(FPL team).
 *
 * @Author Filip Miskovic
 */
public interface EntryService {

    /**
     * Returns Entry(FPL team) summary / details like form, goal scored, yellow
     * cards, red cards, transfer out/in etc.
     *
     * @param entryId
     *            ID of fantasy team.
     * @return POJO Entry parsed from json data.
     * @throws IOException
     */
    Optional<Entry> findEntry(long entryId) throws IOException;

    /**
     * Returns chip(Wild Card, Free Hit, Bench Boost etc) details of a specified
     * Entry(FPL team).
     *
     * @param entryId
     *            ID of fantasy team.
     * @param eventNumber
     *            The event number (Game Week number).
     * @return POJO Stream of Entry parsed from json data.
     * @throws IOException
     */
    Stream<EntryChip> findEntryChips(long entryId, int eventNumber) throws IOException;

    /**
     * Returns a details of a specified event for specific entry (FPL team). For
     * example you can get total points and points of specified event (Game Week),
     * bank, ranking, transfer cost etc.
     *
     * @param entryId
     *            ID of fantasy team.
     * @param eventNumber
     *            The event number (Game Week number).
     * @return POJO Stream of EntryEvent parsed from json data.
     * @throws IOException
     */
    Stream<EntryEvent> findEntryEvent(long entryId, int eventNumber) throws IOException;

    /**
     * Returns a collection of completed or ongoing events. For example you can get
     * total points and points of specified event(Game Week), bank, ranking,
     * transfer cost etc for all completed events.
     *
     * @param entryId
     *            ID of fantasy team.
     * @return POJO Stream of EntryEvent parsed from json data.
     * @throws IOException
     */
    Stream<EntryEvent> findEntryEvents(long entryId) throws IOException;

    /**
     * Returns a collection of picks for a specified event for specific entry(FPL
     * team). By calling this method you can find what is particular entry pick for
     * players.
     *
     * @param entryId
     *            ID of fantasy team.
     * @param event
     *            The event number (Game Week number).
     * @return POJO Stream of EntryPick parsed from json data.
     * @throws IOException
     */
    Stream<EntryPick> findEntryPicksByEvent(long entryId, int event) throws IOException;

    /**
     * Returns transfer history of an entry. You can find what player is transfered
     * in/out, cost etc for each played GW for specified entry(FPL team).
     *
     * @param entryId
     *            ID of fantasy team.
     * @return POJO Stream of EntryTransferHistory parsed from json data.
     * @throws IOException
     */
    Stream<EntryTransferHistory> findEntryTransferHistory(long entryId) throws IOException;

    /**
     * Returns the total number of entries(FPL teams). For some reason, when Game
     * Week is not active, it will return 0.
     */
    long getTotalNumberOfEntries() throws IOException;
}
