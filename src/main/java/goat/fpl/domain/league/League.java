package goat.fpl.domain.league;

public class League {

    private long id;

    private String name;

    //private List<Team> teams;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

//    public List<Team> getTeams() {
//        return teams;
//    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public void setTeams(List<Team> teams) {
//        this.teams = teams;
//    }
}
