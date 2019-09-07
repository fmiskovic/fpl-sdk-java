package goat.fpl.adapters;

import goat.fpl.model.*;

import java.io.IOException;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Use this adapter to get data about specific Entry(FPL team).
 *
 * @Author Filip Miskovic
 * @Email fmiskovic@yandex.com
 */
public interface EntryAdapter {

    /**
     * Returns Entry(FPL team) summary / details like form, goal scored, yellow
     * cards, red cards, transfer out/in etc.
     *
     * @param entryId ID of fantasy team.
     * @return POJO Entry parsed from json data.
     * @throws IOException
     * @throws InterruptedException
     */
    Optional<Entry> findEntry(long entryId) throws IOException, InterruptedException;

    /**
     * Returns chip(Wild Card, Free Hit, Bench Boost etc) details of a specified
     * Entry(FPL team).
     *
     * @param entryId     ID of fantasy team.
     * @param eventNumber The event number (Game Week number).
     * @return POJO Stream of Entry parsed from json data.
     * @throws IOException
     * @throws InterruptedException
     */
    Stream<EntryChip> findEntryChips(long entryId, int eventNumber) throws IOException, InterruptedException;

    /**
     * Returns a details of a specified event for specific entry (FPL team). For
     * example you can get total points and points of specified event (Game Week),
     * bank, ranking, transfer cost etc.
     *
     * @param entryId     ID of fantasy team.
     * @param eventNumber The event number (Game Week number).
     * @return POJO Stream of EntryEvent parsed from json data.
     * @throws IOException
     * @throws InterruptedException
     */
    Stream<EntryEvent> findEntryEvent(long entryId, int eventNumber) throws IOException, InterruptedException;

    /**
     * Returns a collection of completed or ongoing events. For example you can get
     * total points and points of specified event(Game Week), bank, ranking,
     * transfer cost etc for all completed events.
     *
     * @param entryId ID of fantasy team.
     * @return POJO Stream of EntryEvent parsed from json data.
     * @throws IOException
     * @throws InterruptedException
     */
    Stream<EntryEvent> findEntryEvents(long entryId) throws IOException, InterruptedException;

    /**
     * Returns a collection of picks for a specified event for specific entry(FPL
     * team). By calling this method you can find what is particular entry pick for
     * players.
     *
     * @param entryId ID of fantasy team.
     * @param event   The event number (Game Week number).
     * @return POJO Stream of EntryPick parsed from json data.
     * @throws IOException
     * @throws InterruptedException
     */
    Stream<EntryPick> findEntryPicksByEvent(long entryId, int event) throws IOException, InterruptedException;

    /**
     * Returns transfer history of an entry. You can find what player is transfered
     * in/out, cost etc for each played GW for specified entry(FPL team).
     *
     * @param entryId ID of fantasy team.
     * @return POJO Stream of EntryTransferHistory parsed from json data.
     * @throws IOException
     * @throws InterruptedException
     */
    Stream<EntryTransferHistory> findEntryTransferHistory(long entryId) throws IOException, InterruptedException;

    /**
     * Returns the total number of entries(FPL teams). For some reason, when Game
     * Week is not active, it will return 0.
     *
     * @throws IOException
     * @throws InterruptedException
     */
    long getTotalNumberOfEntries() throws IOException, InterruptedException;
}
