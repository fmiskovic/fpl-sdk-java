package fpl.sdk.model;

public class LeagueResult {

    private long entry;

    private String entry_name;

    private int event_total;

    private long id;

    private long last_rank;

    private long league;

    private String movement;

    private boolean own_entry;

    private String player_name;

    private long rank;

    private long rank_sort;

    private int start_event;

    private int stop_event;

    private long total;

    public LeagueResult() {

    }

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

    public long getLast_rank() {
        return last_rank;
    }

    public long getLeague() {
        return league;
    }

    public String getMovement() {
        return movement;
    }

    public boolean isOwn_entry() {
        return own_entry;
    }

    public String getPlayer_name() {
        return player_name;
    }

    public long getRank() {
        return rank;
    }

    public long getRank_sort() {
        return rank_sort;
    }

    public int getStart_event() {
        return start_event;
    }

    public int getStop_event() {
        return stop_event;
    }

    public long getTotal() {
        return total;
    }
}
