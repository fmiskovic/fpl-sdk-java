package goat.fpl.api.impl;

import java.util.Optional;

import goat.fpl.api.LeagueService;
import goat.fpl.config.URLS;

public class LeagueServiceImpl extends BaseService implements LeagueService {

    @Override
    public Optional<String> getClassicLeagueStandingsData(long leagueId, int phase, int page) throws Exception {
	return Optional.of(httpGetDataAsString(String.format(URLS.LEAGUE, leagueId, phase, page, page)));
    }
}
