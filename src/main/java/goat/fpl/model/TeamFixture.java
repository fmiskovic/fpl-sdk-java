package goat.fpl.model;

public class TeamFixture {

    private int day;
    private int event_day;
    private long id;
    private boolean is_home;
    private int month;
    private long opponent;

    public TeamFixture() {
    }

    public int getDay() {
	return day;
    }

    public int getEvent_day() {
	return event_day;
    }

    public long getId() {
	return id;
    }

    public int getMonth() {
	return month;
    }

    public long getOpponent() {
	return opponent;
    }

    public boolean isIs_home() {
	return is_home;
    }

    public void setDay(int day) {
	this.day = day;
    }

    public void setEvent_day(int event_day) {
	this.event_day = event_day;
    }

    public void setId(long id) {
	this.id = id;
    }

    public void setIs_home(boolean is_home) {
	this.is_home = is_home;
    }

    public void setMonth(int month) {
	this.month = month;
    }

    public void setOpponent(long opponent) {
	this.opponent = opponent;
    }

    @Override
    public String toString() {
	return "TeamFixture{" + "day=" + day + ", event_day=" + event_day + ", id=" + id + ", is_home=" + is_home
		+ ", month=" + month + ", opponent=" + opponent + '}';
    }
}
