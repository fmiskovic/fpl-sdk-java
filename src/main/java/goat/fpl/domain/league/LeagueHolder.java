package goat.fpl.domain.league;

public class LeagueHolder {

    private League league;

    private Standings standings;

    public League getLeague() {
        return league;
    }

    public Standings getStandings() {
        return standings;
    }

    public void setLeague(League league) {
        this.league = league;
    }

    public void setStandings(Standings standings) {
        this.standings = standings;
    }
}
