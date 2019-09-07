package goat.fpl.model;

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

    public void setLeague(League league) {
        this.league = league;
    }

    public LeagueStandings getNew_entries() {
        return new_entries;
    }

    public void setNew_entries(LeagueStandings new_entries) {
        this.new_entries = new_entries;
    }

    public LeagueStandings getStandings() {
        return standings;
    }

    public void setStandings(LeagueStandings standings) {
        this.standings = standings;
    }

    public int getUpdate_status() {
        return update_status;
    }

    public void setUpdate_status(int update_status) {
        this.update_status = update_status;
    }
}
