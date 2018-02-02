package goat.fpl.service;

import java.io.IOException;
import java.util.stream.Stream;

import goat.fpl.model.Team;

public interface TeamService {

    /**
     * Returns a collection of all teams
     */
    Stream<Team> getTeams() throws IOException;
}
