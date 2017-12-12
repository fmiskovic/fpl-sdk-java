package goat.fpl.api.impl;

import goat.fpl.api.LeagueService;
import goat.fpl.config.URLS;
import goat.fpl.domain.league.LeagueHolder;
import goat.fpl.domain.league.Standings;
import goat.fpl.domain.league.Team;
import goat.fpl.domain.league.TeamPicks;

import java.util.List;
import java.util.Optional;

public class LeagueServiceImpl extends BaseService implements LeagueService {

    @Override
    public List<Team> getClassicLeagueLiveStandingsData(long leagueId, int phase, int page, int event) throws Exception {

        String leagueHolderJson = httpGetDataAsString(String.format(URLS.LEAGUE, leagueId, phase, page, page));

        LeagueHolder leagueHolder = JsonParserHelper.readValue(leagueHolderJson, LeagueHolder.class);

        Standings standings = leagueHolder.getStandings();

        List<Team> teams = standings.getResults();

        teams.forEach(t -> {
            long teamId = t.getId();
            try {
                String teamEventInfoJson = httpGetDataAsString(String.format(URLS.TEAM_EVENT_INFO, teamId, event));
                TeamPicks teamPicks = JsonParserHelper.readValue(teamEventInfoJson, TeamPicks.class);
                t.setTeamPicks(teamPicks);
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage(), e);
            }
        });

        return teams;
    }

    @Override
    public Optional<String> getClassicLeagueStandingsData(long leagueId, int phase, int page) throws Exception {
        return Optional.of(httpGetDataAsString(String.format(URLS.LEAGUE, leagueId, phase, page, page)));
    }
}
