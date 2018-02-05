package goat.fpl.servicei.tests;

import java.io.IOException;
import java.util.Optional;
import java.util.stream.Stream;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import goat.fpl.model.Entry;
import goat.fpl.model.EntryChip;
import goat.fpl.model.EntryEvent;
import goat.fpl.model.EntryPick;
import goat.fpl.model.EntryTransferHistory;
import goat.fpl.service.EntryService;
import goat.fpl.service.impl.EntryServiceImpl;

public class EntryServiceTest {

    public static final int ENTRY_ID = 236927; // Kavovina

    private EntryService entryService;

    @Test
    public void findEntryChips() throws IOException {
	Stream<EntryChip> stream = getEntryService().findEntryChips(ENTRY_ID, 20);
	Assert.assertNotNull(stream);

	stream.forEach(e -> {
	    Assert.assertNotNull(e.getName());
	    Assert.assertNotNull(e.getStatus());
	});
    }

    @Test
    public void findEntryEventTest() throws IOException {
	Stream<EntryEvent> stream = getEntryService().findEntryEvent(ENTRY_ID, 20);
	Assert.assertNotNull(stream);

	stream.forEach(e -> {
	    Assert.assertNotNull(e.getMovement());
	    Assert.assertTrue(e.getPoints() > 0);
	});
    }

    @Test
    public void findEntryEventsTest() throws IOException {
	Stream<EntryEvent> stream = getEntryService().findEntryEvents(ENTRY_ID);
	Assert.assertNotNull(stream);

	stream.forEach(e -> {
	    Assert.assertNotNull(e.getMovement());
	    Assert.assertTrue(e.getPoints() > 0);
	    Assert.assertTrue(e.getTotal_points() > 0);
	});
    }

    @Test
    public void findEntryPicksByEventTest() throws IOException {
	Stream<EntryPick> stream = getEntryService().findEntryPicksByEvent(ENTRY_ID, 20);
	Assert.assertNotNull(stream);

	stream.forEach(e -> {
	    Assert.assertTrue(e.getElement() > 0);
	    Assert.assertTrue(e.getPosition() > 0);
	});
    }

    @Test
    public void findEntryTest() throws IOException {
	Optional<Entry> opt = getEntryService().findEntry(ENTRY_ID);
	Assert.assertTrue(opt.isPresent());

	Entry entry = opt.get();

	Assert.assertNotNull(entry.getPlayer_first_name());
	Assert.assertNotNull(entry.getPlayer_last_name());
    }

    @Test
    public void findEntryTransferHistoryTest() throws IOException {
	Stream<EntryTransferHistory> stream = getEntryService().findEntryTransferHistory(ENTRY_ID);
	Assert.assertNotNull(stream);

	stream.forEach(e -> {
	    Assert.assertTrue(e.getElement_in() > 0);
	    Assert.assertTrue(e.getElement_out() > 0);
	});
    }

    @Ignore
    @Test
    public void getTotalNumberOfEntriesTest() throws IOException {
	long num = getEntryService().getTotalNumberOfEntries();
	Assert.assertTrue(num > 0);
    }

    @Before
    public void init() {
	entryService = EntryServiceImpl.INSTANCE;
    }

    private EntryService getEntryService() {
	return entryService;
    }
}
