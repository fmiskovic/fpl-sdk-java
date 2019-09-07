package goat.fpl.model;

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

    public void setEntry(long entry) {
        this.entry = entry;
    }

    public String getEntry_name() {
        return entry_name;
    }

    public void setEntry_name(String entry_name) {
        this.entry_name = entry_name;
    }

    public int getEvent_total() {
        return event_total;
    }

    public void setEvent_total(int event_total) {
        this.event_total = event_total;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getLast_rank() {
        return last_rank;
    }

    public void setLast_rank(long last_rank) {
        this.last_rank = last_rank;
    }

    public long getLeague() {
        return league;
    }

    public void setLeague(long league) {
        this.league = league;
    }

    public String getMovement() {
        return movement;
    }

    public void setMovement(String movement) {
        this.movement = movement;
    }

    public String getPlayer_name() {
        return player_name;
    }

    public void setPlayer_name(String player_name) {
        this.player_name = player_name;
    }

    public long getRank() {
        return rank;
    }

    public void setRank(long rank) {
        this.rank = rank;
    }

    public long getRank_sort() {
        return rank_sort;
    }

    public void setRank_sort(long rank_sort) {
        this.rank_sort = rank_sort;
    }

    public int getStart_event() {
        return start_event;
    }

    public void setStart_event(int start_event) {
        this.start_event = start_event;
    }

    public int getStop_event() {
        return stop_event;
    }

    public void setStop_event(int stop_event) {
        this.stop_event = stop_event;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public boolean isOwn_entry() {
        return own_entry;
    }

    public void setOwn_entry(boolean own_entry) {
        this.own_entry = own_entry;
    }

    @Override
    public String toString() {
        return "LeagueResult{" + "entry=" + entry + ", entry_name='" + entry_name + '\'' + ", event_total="
                + event_total + ", id=" + id + ", total=" + total + '}';
    }
}
