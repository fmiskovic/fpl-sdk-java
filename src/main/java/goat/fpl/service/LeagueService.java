package goat.fpl.service;

import java.io.IOException;
import java.util.Optional;

import goat.fpl.model.League;
import goat.fpl.model.LeagueStandings;

public interface LeagueService {

    /**
     * Returns specified details of a classic league
     * 
     * @param leagueId
     *            The id of the league
     */
    Optional<League> findLeague(long leagueId) throws IOException;

    /**
     * Returns specified standings of a classic league
     * 
     * @param leagueId
     *            The id of the league
     * @param page
     *            The page number of the standings (50 results per page)
     */
    Optional<LeagueStandings> findLeagueStandings(long leagueId, int page) throws IOException;
}
