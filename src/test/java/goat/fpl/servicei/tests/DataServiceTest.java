package goat.fpl.servicei.tests;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import goat.fpl.model.BootstrappedData;
import goat.fpl.model.Element;
import goat.fpl.model.Entry;
import goat.fpl.model.EntryEvent;
import goat.fpl.model.EntryLeagues;
import goat.fpl.model.EntryPick;
import goat.fpl.model.EntryPicksRoot;
import goat.fpl.model.EntryRoot;
import goat.fpl.model.EntrySeason;
import goat.fpl.model.EntryTransferHistory;
import goat.fpl.model.EntryTransfers;
import goat.fpl.model.EntryWildcard;
import goat.fpl.model.League;
import goat.fpl.model.LeagueResult;
import goat.fpl.model.LeagueRoot;
import goat.fpl.model.LeagueStandings;
import goat.fpl.model.Team;
import goat.fpl.service.DataService;
import goat.fpl.service.impl.DataServiceImpl;

public class DataServiceTest {

    public static final int ENTRY_ID = 236927; // Kavovina

    private static final int LEAGUE_ID = 44740; // Cubasti Kakadu

    private DataService dataService;

    @Test
    public void findEntryEventPicksRootTest() throws IOException {
	Optional<EntryPicksRoot> opt = getDataService().findEntryEventPicksRoot(ENTRY_ID, 26);
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
    public void findEntryRootTest() throws IOException {
	Optional<EntryRoot> opt = getDataService().findEntryRoot(ENTRY_ID);
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
    public void findEntryTransfersTest() throws IOException {
	Optional<EntryTransfers> opt = getDataService().findEntryTransfers(ENTRY_ID);
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
    public void findLeagueRootTest() throws IOException {
	Optional<LeagueRoot> opt = getDataService().findLeagueRoot(LEAGUE_ID, 1, 1);
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
    public void getBootstrapDataTest() throws IOException {
	Optional<BootstrappedData> opt = getDataService().getBootstrapData();
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
	dataService = DataServiceImpl.INSTANCE;
    }

    private DataService getDataService() {
	return dataService;
    }
}
