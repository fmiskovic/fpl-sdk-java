package fpl.sdk.model;

public class LeagueRoot {

    private League league;

    private LeagueStandings new_entries;

    private LeagueStandings standings;

    private int update_status;

    public LeagueRoot() {
    }

    public League getLeague() {
        return league;
    }

    public LeagueStandings getNew_entries() {
        return new_entries;
    }

    public LeagueStandings getStandings() {
        return standings;
    }

    public int getUpdate_status() {
        return update_status;
    }
}
