package goat.fpl.model;

import java.util.List;

public class LeagueStandings {

    private boolean has_next;
    private int number;
    private List<LeagueResult> results;

    public LeagueStandings() {

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<LeagueResult> getResults() {
        return results;
    }

    public void setResults(List<LeagueResult> results) {
        this.results = results;
    }

    public boolean isHas_next() {
        return has_next;
    }

    public void setHas_next(boolean has_next) {
        this.has_next = has_next;
    }
}
