package goat.fpl.service.impl;

import java.io.IOException;
import java.util.Optional;
import java.util.stream.Stream;

import goat.fpl.model.BootstrappedData;
import goat.fpl.model.Entry;
import goat.fpl.model.EntryChip;
import goat.fpl.model.EntryEvent;
import goat.fpl.model.EntryPick;
import goat.fpl.model.EntryPicksRoot;
import goat.fpl.model.EntryRoot;
import goat.fpl.model.EntryTransferHistory;
import goat.fpl.model.EntryTransfers;
import goat.fpl.service.DataService;
import goat.fpl.service.EntryService;

public class EntryServiceImpl implements EntryService {

    public static final EntryService INSTANCE = new EntryServiceImpl();

    private DataService dataService = DataServiceImpl.INSTANCE;

    private EntryServiceImpl() {

    }

    @Override
    public Optional<Entry> findEntry(long entryId) throws IOException {
	Optional<EntryRoot> opt = getDataService().findEntryRoot(entryId);
	return opt.isPresent() ? Optional.of(opt.get().getEntry()) : Optional.empty();
    }

    @Override
    public Stream<EntryChip> findEntryChips(long entryId, int eventNumber) throws IOException {
	Optional<EntryRoot> opt = getDataService().findEntryRoot(entryId);
	return opt.isPresent() ? Stream.of(opt.get().getChips()) : Stream.empty();
    }

    @Override
    public Stream<EntryEvent> findEntryEvent(long entryId, int eventNumber) throws IOException {
	Optional<EntryPicksRoot> opt = getDataService().findEntryEventPicksRoot(entryId, eventNumber);
	return opt.isPresent() ? Stream.of(opt.get().getEntry_history()) : Stream.empty();
    }

    @Override
    public Stream<EntryEvent> findEntryEvents(long entryId) throws IOException {
	Optional<EntryRoot> opt = getDataService().findEntryRoot(entryId);
	return opt.isPresent() ? Stream.of(opt.get().getHistory()) : Stream.empty();
    }

    @Override
    public Stream<EntryPick> findEntryPicksByEvent(long entryId, int event) throws IOException {
	Optional<EntryPicksRoot> opt = getDataService().findEntryEventPicksRoot(entryId, event);
	return opt.isPresent() ? Stream.of(opt.get().getPicks()) : Stream.empty();
    }

    @Override
    public Stream<EntryTransferHistory> findEntryTransferHistory(long entryId) throws IOException {
	Optional<EntryTransfers> opt = getDataService().findEntryTransfers(entryId);
	return opt.isPresent() ? Stream.of(opt.get().getHistory()) : Stream.empty();
    }

    @Override
    public long getTotalNumberOfEntries() throws IOException {
	Optional<BootstrappedData> opt = getDataService().getBootstrapData();
	return opt.isPresent() ? opt.get().getTotal_players() : 0;
    }

    private DataService getDataService() {
	return dataService;
    }
}
