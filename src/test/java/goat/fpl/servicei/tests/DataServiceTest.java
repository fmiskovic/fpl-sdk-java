package goat.fpl.servicei.tests;

import goat.fpl.model.BootstrappedData;
import goat.fpl.model.Element;
import goat.fpl.model.EntryPick;
import goat.fpl.model.EntryPicksRoot;
import goat.fpl.model.Team;
import goat.fpl.service.DataService;
import goat.fpl.service.impl.DataServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class DataServiceTest {

    private DataService dataService;

    @Test
    public void findEntryEventPicksRootTest() throws IOException {
        Optional<EntryPicksRoot> opt = getDataService().findEntryEventPicksRoot(1538570, 2);
        Assert.assertTrue(opt.isPresent());

        EntryPicksRoot data = opt.get();

        List<EntryPick> picks = data.getPicks();
        Assert.assertNotNull(picks);
        Assert.assertTrue(!picks.isEmpty());

        Assert.assertNotNull(data.getEntry_history());
        Assert.assertNotNull(data.getAutomatic_subs());
        Assert.assertNotNull(data.getEvent());
    }

    @Test
    public void findEntryRootTest() throws IOException {

    }

    @Test
    public void findEntryTransfersTest() throws IOException {

    }

    @Test
    public void findLeagueRootTest() throws IOException {

    }

    @Test
    public void findLiveEventTest() throws IOException {

    }

    @Test
    public void getBootstrapDataTest() throws IOException {
        Optional<BootstrappedData> opt = getDataService().getBootstrapData();
        Assert.assertTrue(opt.isPresent());

        BootstrappedData data = opt.get();

        List<Element> elements = data.getElements();
        Assert.assertNotNull(elements);
        Assert.assertTrue(!elements.isEmpty());

        List<Team> teams = data.getTeams();
        Assert.assertNotNull(teams);
        Assert.assertTrue(!teams.isEmpty());
    }

    public DataService getDataService() {
        return dataService;
    }

    @Before
    public void init() {
        dataService = DataServiceImpl.INSTANCE;
    }
}
