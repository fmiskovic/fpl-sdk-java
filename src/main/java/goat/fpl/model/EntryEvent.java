package goat.fpl.model;

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

    public void setBank(float bank) {
	this.bank = bank;
    }

    public void setEntry(long entry) {
	this.entry = entry;
    }

    public void setEvent(int event) {
	this.event = event;
    }

    public void setEvent_transfers(int event_transfers) {
	this.event_transfers = event_transfers;
    }

    public void setEvent_transfers_cost(float event_transfers_cost) {
	this.event_transfers_cost = event_transfers_cost;
    }

    public void setId(long id) {
	this.id = id;
    }

    public void setMovement(String movement) {
	this.movement = movement;
    }

    public void setOverall_rank(long overall_rank) {
	this.overall_rank = overall_rank;
    }

    public void setPoints(int points) {
	this.points = points;
    }

    public void setPoints_on_bench(int points_on_bench) {
	this.points_on_bench = points_on_bench;
    }

    public void setRank(long rank) {
	this.rank = rank;
    }

    public void setRank_sort(long rank_sort) {
	this.rank_sort = rank_sort;
    }

    public void setTargets(Object targets) {
	this.targets = targets;
    }

    public void setTotal_points(long total_points) {
	this.total_points = total_points;
    }

    public void setValue(long value) {
	this.value = value;
    }
}
