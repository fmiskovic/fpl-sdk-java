package fpl.sdk;

import fpl.sdk.model.*;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class FplClientTest {

    private static final int ENTRY_ID = 1865345;

    private static final int LEAGUE_ID = 588962;

    private static final int EVENT = 1;

    private FplClient fplClient;

    @Before
    public void init() {
        fplClient = new FplClient();
    }

    @Test
    public void testGetBootstrapData() {
        Optional<BootstrappedData> data = fplClient.getBootstrapData();
        assertTrue(data.isPresent());

        BootstrappedData bootstrapped = data.get();
        List<Element> elements = bootstrapped.getElements();
        long totalPlayers = bootstrapped.getTotal_players();

        assertFalse(elements.isEmpty());
        assertTrue(totalPlayers > 0);
    }

    @Test
    public void testFindEntryEventPicksRoot() {
        Optional<EntryPicksRoot> opt = fplClient.findEntryEventPicksRoot(ENTRY_ID, 1);
        assertTrue(opt.isPresent());

        EntryPicksRoot data = opt.get();

        assertFalse(data.getPicks().isEmpty());

        assertNotNull(data.getEntry_history());
        assertNotNull(data.getAutomatic_subs());
    }

    @Ignore
    @Test
    public void testFindEntryRoot() {
        Optional<EntryRoot> opt = fplClient.findEntryRoot(ENTRY_ID);
        assertTrue(opt.isPresent());

        EntryRoot data = opt.get();

        assertFalse(data.getHistory().isEmpty());
        assertNotNull(data.getLeagues());
        assertFalse(data.getSeason().isEmpty());
    }

    @Ignore
    @Test
    public void testFindEntryTransfers() {
        Optional<EntryTransfers> opt = fplClient.findEntryTransfers(ENTRY_ID);
        assertTrue(opt.isPresent());

        EntryTransfers data = opt.get();
        assertNotNull(data.getEntry());
        assertFalse(data.getHistory().isEmpty());
        assertNotNull(data.getLeagues());
        assertFalse(data.getWildcards().isEmpty());
    }

    @Ignore
    @Test
    public void testFindLeagueRoot() {
        Optional<LeagueRoot> opt = fplClient.findLeagueRoot(LEAGUE_ID, 1, 1);
        assertTrue(opt.isPresent());

        LeagueRoot data = opt.get();

        League league = data.getLeague();
        assertNotNull(league);
        assertNotNull(league.getName());

        LeagueStandings standings = data.getStandings();
        assertNotNull(standings);
        assertFalse(standings.getResults().isEmpty());
    }

    @Test
    public void testGetElementTypes() {
        Stream<ElementType> stream = fplClient.getElementTypes();
        assertNotNull(stream);
        stream.forEach(et -> assertNotNull(et.getPlural_name()));
    }

    @Test
    public void testGetElements() {
        Stream<Element> stream = fplClient.getElements();
        assertNotNull(stream);

        stream.forEach(e -> {
            assertNotNull(e.getFirst_name());
            assertNotNull(e.getSecond_name());
        });
    }

    @Test
    public void testFindEntryChips() {
        Stream<EntryChip> stream = fplClient.findEntryChips(ENTRY_ID);
        assertNotNull(stream);

        stream.forEach(e -> {
            assertNotNull(e.getName());
            assertNotNull(e.getStatus());
        });
    }

    @Ignore
    @Test
    public void testFindEntryEvent() {
        Stream<EntryEvent> stream = fplClient.findEntryEvent(ENTRY_ID, 20);
        assertNotNull(stream);

        stream.forEach(e -> {
            assertNotNull(e.getMovement());
            assertTrue(e.getPoints() > 0);
        });
    }

    @Ignore
    @Test
    public void testFindEntryEvents() {
        Stream<EntryEvent> stream = fplClient.findEntryEvents(ENTRY_ID);
        assertNotNull(stream);

        stream.forEach(e -> {
            assertNotNull(e.getMovement());
            assertTrue(e.getPoints() > 0);
            assertTrue(e.getTotal_points() > 0);
        });
    }

    @Ignore
    @Test
    public void testFindEntryPicksByEvent() {
        Stream<EntryPick> stream = fplClient.findEntryPicksByEvent(ENTRY_ID, 20);
        assertNotNull(stream);

        stream.forEach(e -> {
            assertTrue(e.getElement() > 0);
            assertTrue(e.getPosition() > 0);
        });
    }

    @Ignore
    @Test
    public void testFindEntry() {
        Optional<Entry> opt = fplClient.findEntry(ENTRY_ID);
        assertTrue(opt.isPresent());

        Entry entry = opt.get();

        assertNotNull(entry.getPlayer_first_name());
        assertNotNull(entry.getPlayer_last_name());
    }

    @Ignore
    @Test
    public void testFindEntryTransferHistory() {
        Stream<EntryTransferHistory> stream = fplClient.findEntryTransferHistory(ENTRY_ID);
        assertNotNull(stream);

        stream.forEach(e -> {
            assertTrue(e.getElement_in() > 0);
            assertTrue(e.getElement_out() > 0);
        });
    }

    @Ignore
    @Test
    public void testGetTotalNumberOfEntries() {
        long num = fplClient.getTotalNumberOfEntries();
        assertTrue(num > 0);
    }

    @Test
    public void testFindElementsByEvent() {
        Stream<EventElements> eventElements = fplClient.findElementsByEvent(EVENT);
        assertNotNull(eventElements);

        eventElements.forEach(e -> {
            ElementStats stats = e.getStats();
            assertNotNull(stats);
        });
    }
}
