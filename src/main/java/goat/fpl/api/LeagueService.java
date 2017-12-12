package goat.fpl.api;

import goat.fpl.domain.league.Team;

import java.util.List;
import java.util.Optional;

public interface LeagueService {

    List<Team> getClassicLeagueLiveStandingsData(long leagueId, int phase, int page, int event) throws Exception;

    Optional<String> getClassicLeagueStandingsData(long leagueId, int phase, int page) throws Exception;
}

