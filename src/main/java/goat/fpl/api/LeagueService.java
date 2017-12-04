package goat.fpl.api;

import java.util.Optional;

public interface LeagueService {

    Optional<String> getClassicLeagueStandingsData(long leagueId, int phase, int page) throws Exception;
}

