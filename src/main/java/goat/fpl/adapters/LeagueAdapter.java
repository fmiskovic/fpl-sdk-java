package goat.fpl.adapters;

import goat.fpl.model.League;
import goat.fpl.model.LeagueStandings;

import java.io.IOException;
import java.util.Optional;

public interface LeagueAdapter {

    /**
     * Returns specified details of a classic league
     *
     * @param leagueId The id of the league
     */
    Optional<League> findLeague(long leagueId) throws IOException;

    /**
     * Returns specified standings of a classic league
     *
     * @param leagueId The id of the league
     * @param page     The page number of the standings (50 results per page)
     */
    Optional<LeagueStandings> findLeagueStandings(long leagueId, int page) throws IOException;
}
