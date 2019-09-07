package goat.fpl.adapters;

import goat.fpl.model.Team;

import java.io.IOException;
import java.util.stream.Stream;

public interface TeamAdapter {

    /**
     * Returns a collection of all teams
     */
    Stream<Team> getTeams() throws IOException;
}
