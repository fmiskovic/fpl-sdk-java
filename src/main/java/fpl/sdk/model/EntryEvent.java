package fpl.sdk.model;

public class EntryEvent {

    private float bank;

    private long entry;

    private int event;

    private int event_transfers;

    private float event_transfers_cost;

    private long id;

    private String movement;

    private long overall_rank;

    private int points;

    private int points_on_bench;

    private long rank;

    private long rank_sort;

    private Object targets;

    private long total_points;

    private long value;

    public EntryEvent() {

    }

    public float getBank() {
        return bank;
    }

    public long getEntry() {
        return entry;
    }

    public int getEvent() {
        return event;
    }

    public int getEvent_transfers() {
        return event_transfers;
    }

    public float getEvent_transfers_cost() {
        return event_transfers_cost;
    }

    public long getId() {
        return id;
    }

    public String getMovement() {
        return movement;
    }

    public long getOverall_rank() {
        return overall_rank;
    }

    public int getPoints() {
        return points;
    }

    public int getPoints_on_bench() {
        return points_on_bench;
    }

    public long getRank() {
        return rank;
    }

    public long getRank_sort() {
        return rank_sort;
    }

    public Object getTargets() {
        return targets;
    }

    public long getTotal_points() {
        return total_points;
    }

    public long getValue() {
        return value;
    }
}
