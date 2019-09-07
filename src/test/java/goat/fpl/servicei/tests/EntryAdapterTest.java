package goat.fpl.servicei.tests;

import goat.fpl.adapters.EntryAdapter;
import goat.fpl.adapters.impl.EntryAdapterImpl;
import goat.fpl.model.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;
import java.util.Optional;
import java.util.stream.Stream;

public class EntryAdapterTest {

    private static final int ENTRY_ID = 236927; // Kavovina

    private EntryAdapter entryAdapter;

    @Test
    public void findEntryChips() throws IOException, InterruptedException {
        Stream<EntryChip> stream = getEntryAdapter().findEntryChips(ENTRY_ID, 20);
        Assert.assertNotNull(stream);

        stream.forEach(e -> {
            Assert.assertNotNull(e.getName());
            Assert.assertNotNull(e.getStatus());
        });
    }

    @Test
    public void findEntryEventTest() throws IOException, InterruptedException {
        Stream<EntryEvent> stream = getEntryAdapter().findEntryEvent(ENTRY_ID, 20);
        Assert.assertNotNull(stream);

        stream.forEach(e -> {
            Assert.assertNotNull(e.getMovement());
            Assert.assertTrue(e.getPoints() > 0);
        });
    }

    @Test
    public void findEntryEventsTest() throws IOException, InterruptedException {
        Stream<EntryEvent> stream = getEntryAdapter().findEntryEvents(ENTRY_ID);
        Assert.assertNotNull(stream);

        stream.forEach(e -> {
            Assert.assertNotNull(e.getMovement());
            Assert.assertTrue(e.getPoints() > 0);
            Assert.assertTrue(e.getTotal_points() > 0);
        });
    }

    @Test
    public void findEntryPicksByEventTest() throws IOException, InterruptedException {
        Stream<EntryPick> stream = getEntryAdapter().findEntryPicksByEvent(ENTRY_ID, 20);
        Assert.assertNotNull(stream);

        stream.forEach(e -> {
            Assert.assertTrue(e.getElement() > 0);
            Assert.assertTrue(e.getPosition() > 0);
        });
    }

    @Test
    public void findEntryTest() throws IOException, InterruptedException {
        Optional<Entry> opt = getEntryAdapter().findEntry(ENTRY_ID);
        Assert.assertTrue(opt.isPresent());

        Entry entry = opt.get();

        Assert.assertNotNull(entry.getPlayer_first_name());
        Assert.assertNotNull(entry.getPlayer_last_name());
    }

    @Test
    public void findEntryTransferHistoryTest() throws IOException, InterruptedException {
        Stream<EntryTransferHistory> stream = getEntryAdapter().findEntryTransferHistory(ENTRY_ID);
        Assert.assertNotNull(stream);

        stream.forEach(e -> {
            Assert.assertTrue(e.getElement_in() > 0);
            Assert.assertTrue(e.getElement_out() > 0);
        });
    }

    @Ignore
    @Test
    public void getTotalNumberOfEntriesTest() throws IOException, InterruptedException {
        long num = getEntryAdapter().getTotalNumberOfEntries();
        Assert.assertTrue(num > 0);
    }

    @Before
    public void init() {
        entryAdapter = EntryAdapterImpl.INSTANCE;
    }

    private EntryAdapter getEntryAdapter() {
        return entryAdapter;
    }
}
