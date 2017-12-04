package goat.fpl.api.tests;

import goat.fpl.api.LeagueService;
import goat.fpl.api.impl.JsonUtils;
import goat.fpl.api.impl.LeagueServiceImpl;
import goat.fpl.domain.league.League;
import goat.fpl.domain.league.LeagueHolder;
import goat.fpl.domain.league.Standings;
import goat.fpl.domain.league.Team;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Optional;

public class LeagueServiceTest {

    private static final long LEAGUE_ID = 44740l; //Cubasti Kakadu

    private LeagueService leagueService;

    @Test
    public void getLeagueLiveStandingsTest() {

    }

    public LeagueService getLeagueService() {
        return leagueService;
    }

    @Test
    public void getLeagueStandingsTest() throws Exception {
        Optional<String> op = getLeagueService().getClassicLeagueStandingsData(LEAGUE_ID, 1, 1);
        Assert.assertTrue(op.isPresent());

        LeagueHolder leagueHolder = JsonUtils.readValue(op.get(), LeagueHolder.class);

        League league = leagueHolder.getLeague();
        Assert.assertNotNull(league.getId());
        Assert.assertNotNull(league.getName());

        Standings standings = leagueHolder.getStandings();
        Assert.assertNotNull(standings);

        List<Team> teams = standings.getResults();
        Assert.assertNotNull(teams);
        Assert.assertTrue(!teams.isEmpty());

        teams.forEach(t -> {
            Assert.assertNotNull(t.getEntry_name());
            Assert.assertNotNull(t.getPlayer_name());
        });
    }

    @Before
    public void init() {
        leagueService = new LeagueServiceImpl();
    }
}
