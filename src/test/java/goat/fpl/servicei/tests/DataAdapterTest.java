package goat.fpl.servicei.tests;

import goat.fpl.adapters.DataAdapter;
import goat.fpl.adapters.impl.DataAdapterImpl;
import goat.fpl.model.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class DataAdapterTest {

    private static final int ENTRY_ID = 236927; // Kavovina

    private static final int LEAGUE_ID = 44740; // Cubasti Kakadu

    private DataAdapter dataAdapter;

    @Test
    public void findEntryEventPicksRootTest() throws IOException, InterruptedException {
        Optional<EntryPicksRoot> opt = getDataAdapter().findEntryEventPicksRoot(ENTRY_ID, 26);
        Assert.assertTrue(opt.isPresent());

        EntryPicksRoot data = opt.get();

        EntryPick[] picks = data.getPicks();
        Assert.assertNotNull(picks);
        Assert.assertTrue(picks.length > 0);

        Assert.assertNotNull(data.getEntry_history());
        Assert.assertNotNull(data.getAutomatic_subs());
        Assert.assertNotNull(data.getEvent());
    }

    @Test
    public void findEntryRootTest() throws IOException, InterruptedException {
        Optional<EntryRoot> opt = getDataAdapter().findEntryRoot(ENTRY_ID);
        Assert.assertTrue(opt.isPresent());

        EntryRoot data = opt.get();

        Entry entry = data.getEntry();
        Assert.assertNotNull(entry);

        EntryEvent[] history = data.getHistory();
        Assert.assertNotNull(history);
        Assert.assertTrue(history.length > 0);

        EntryLeagues leagues = data.getLeagues();
        Assert.assertNotNull(leagues);

        EntrySeason[] season = data.getSeason();
        Assert.assertNotNull(season);
    }

    @Test
    public void findEntryTransfersTest() throws IOException, InterruptedException {
        Optional<EntryTransfers> opt = getDataAdapter().findEntryTransfers(ENTRY_ID);
        Assert.assertTrue(opt.isPresent());

        EntryTransfers data = opt.get();

        Entry entry = data.getEntry();
        Assert.assertNotNull(entry);

        EntryTransferHistory[] history = data.getHistory();
        Assert.assertNotNull(history);
        Assert.assertTrue(history.length > 0);

        EntryLeagues leagues = data.getLeagues();
        Assert.assertNotNull(leagues);

        EntryWildcard[] wildcards = data.getWildcards();
        Assert.assertNotNull(wildcards);
        Assert.assertTrue(wildcards.length > 0);
    }

    @Test
    public void findLeagueRootTest() throws IOException, InterruptedException {
        Optional<LeagueRoot> opt = getDataAdapter().findLeagueRoot(LEAGUE_ID, 1, 1);
        Assert.assertTrue(opt.isPresent());

        LeagueRoot data = opt.get();

        League league = data.getLeague();
        Assert.assertNotNull(league);
        Assert.assertNotNull(league.getName());

        LeagueStandings standings = data.getStandings();
        Assert.assertNotNull(standings);

        List<LeagueResult> results = standings.getResults();
        Assert.assertNotNull(results);
        Assert.assertTrue(!results.isEmpty());
    }

    @Test
    public void findLiveEventTest() throws IOException {
        // TODO: add test case
    }

    @Test
    public void getBootstrapDataTest() throws IOException, InterruptedException {
        Optional<BootstrappedData> opt = getDataAdapter().getBootstrapData();
        Assert.assertTrue(opt.isPresent());

        BootstrappedData data = opt.get();

        Element[] elements = data.getElements();
        Assert.assertNotNull(elements);
        Assert.assertTrue(elements.length > 0);

        Team[] teams = data.getTeams();
        Assert.assertNotNull(teams);
        Assert.assertTrue(teams.length > 0);
    }

    @Before
    public void init() {
        dataAdapter = DataAdapterImpl.INSTANCE;
    }

    private DataAdapter getDataAdapter() {
        return dataAdapter;
    }
}
