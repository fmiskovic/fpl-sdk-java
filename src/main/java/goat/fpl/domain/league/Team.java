package goat.fpl.domain.league;

public class Team {

    private long entry;

    private String entry_name;

    private int event_total;

    private long id;

    private int last_rank;

    private String movement;

    private String player_name;

    private int rank;

    private TeamPicks teamPicks;

    private int total;

    public long getEntry() {
        return entry;
    }

    public String getEntry_name() {
        return entry_name;
    }

    public int getEvent_total() {
        return event_total;
    }

    public long getId() {
        return id;
    }

    public int getLast_rank() {
        return last_rank;
    }

    public String getMovement() {
        return movement;
    }

    public String getPlayer_name() {
        return player_name;
    }

    public int getRank() {
        return rank;
    }

    public TeamPicks getTeamPicks() {
        return teamPicks;
    }

    public int getTotal() {
        return total;
    }

    public void setEntry(long entry) {
        this.entry = entry;
    }

    public void setEntry_name(String entry_name) {
        this.entry_name = entry_name;
    }

    public void setEvent_total(int event_total) {
        this.event_total = event_total;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setLast_rank(int last_rank) {
        this.last_rank = last_rank;
    }

    public void setMovement(String movement) {
        this.movement = movement;
    }

    public void setPlayer_name(String player_name) {
        this.player_name = player_name;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setTeamPicks(TeamPicks teamPicks) {
        this.teamPicks = teamPicks;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
