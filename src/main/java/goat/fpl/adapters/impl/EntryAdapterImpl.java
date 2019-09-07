package goat.fpl.adapters.impl;

import goat.fpl.adapters.DataAdapter;
import goat.fpl.adapters.EntryAdapter;
import goat.fpl.model.*;

import java.io.IOException;
import java.util.Optional;
import java.util.stream.Stream;

public class EntryAdapterImpl implements EntryAdapter {

    public static final EntryAdapter INSTANCE = new EntryAdapterImpl();

    private final DataAdapter dataAdapter = DataAdapterImpl.INSTANCE;

    private EntryAdapterImpl() {

    }

    @Override
    public Optional<Entry> findEntry(long entryId) throws IOException, InterruptedException {
        Optional<EntryRoot> opt = getDataAdapter().findEntryRoot(entryId);
        return opt.map(EntryRoot::getEntry);
    }

    @Override
    public Stream<EntryChip> findEntryChips(long entryId, int eventNumber) throws IOException, InterruptedException {
        Optional<EntryRoot> opt = getDataAdapter().findEntryRoot(entryId);
        return opt.map(entryRoot -> Stream.of(entryRoot.getChips())).orElseGet(Stream::empty);
    }

    @Override
    public Stream<EntryEvent> findEntryEvent(long entryId, int eventNumber) throws IOException, InterruptedException {
        Optional<EntryPicksRoot> opt = getDataAdapter().findEntryEventPicksRoot(entryId, eventNumber);
        return opt.map(entryPicksRoot -> Stream.of(entryPicksRoot.getEntry_history())).orElseGet(Stream::empty);
    }

    @Override
    public Stream<EntryEvent> findEntryEvents(long entryId) throws IOException, InterruptedException {
        Optional<EntryRoot> opt = getDataAdapter().findEntryRoot(entryId);
        return opt.map(entryRoot -> Stream.of(entryRoot.getHistory())).orElseGet(Stream::empty);
    }

    @Override
    public Stream<EntryPick> findEntryPicksByEvent(long entryId, int event) throws IOException, InterruptedException {
        Optional<EntryPicksRoot> opt = getDataAdapter().findEntryEventPicksRoot(entryId, event);
        return opt.map(entryPicksRoot -> Stream.of(entryPicksRoot.getPicks())).orElseGet(Stream::empty);
    }

    @Override
    public Stream<EntryTransferHistory> findEntryTransferHistory(long entryId) throws IOException, InterruptedException {
        Optional<EntryTransfers> opt = getDataAdapter().findEntryTransfers(entryId);
        return opt.map(entryTransfers -> Stream.of(entryTransfers.getHistory())).orElseGet(Stream::empty);
    }

    @Override
    public long getTotalNumberOfEntries() throws IOException, InterruptedException {
        Optional<BootstrappedData> opt = getDataAdapter().getBootstrapData();
        return opt.map(BootstrappedData::getTotal_players).orElse(0L);
    }

    private DataAdapter getDataAdapter() {
        return dataAdapter;
    }
}
