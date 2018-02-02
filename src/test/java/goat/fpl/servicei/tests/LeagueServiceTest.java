package goat.fpl.servicei.tests;

import org.junit.Before;
import org.junit.Test;

import goat.fpl.service.LeagueService;

public class LeagueServiceTest {

    private static final long LEAGUE_ID = 44740l; // Cubasti Kakadu

    private static final String TEAM = "https://fantasy.premierleague.com/a/team/236927/event/24";

    private LeagueService leagueService;

    @Test
    public void getLeagueLiveStandingsTest() throws Exception {

    }

    @Test
    public void getLeagueStandingsTest() throws Exception {

    }

    @Before
    public void init() {
	leagueService = null;
    }

    private LeagueService getLeagueService() {
	return leagueService;
    }
}
