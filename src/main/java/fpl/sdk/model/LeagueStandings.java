package fpl.sdk.model;

import java.util.List;

public class LeagueStandings {

    private boolean has_next;

    private int number;

    private List<LeagueResult> results;

    public LeagueStandings() {

    }

    public boolean isHas_next() {
        return has_next;
    }

    public int getNumber() {
        return number;
    }

    public List<LeagueResult> getResults() {
        return results;
    }
}
