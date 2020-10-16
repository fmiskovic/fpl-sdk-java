package fpl.sdk.model;

public class EntrySeason {

    private long id;
    private long player;
    private long rank;
    private long season;
    private String season_name;
    private long total_points;

    public EntrySeason() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPlayer() {
        return player;
    }

    public void setPlayer(long player) {
        this.player = player;
    }

    public long getRank() {
        return rank;
    }

    public void setRank(long rank) {
        this.rank = rank;
    }

    public long getSeason() {
        return season;
    }

    public void setSeason(long season) {
        this.season = season;
    }

    public String getSeason_name() {
        return season_name;
    }

    public void setSeason_name(String season_name) {
        this.season_name = season_name;
    }

    public long getTotal_points() {
        return total_points;
    }

    public void setTotal_points(long total_points) {
        this.total_points = total_points;
    }
}
