package goat.fpl.model;

import java.util.Date;

public class EntryState {

    private Date deadline_time;
    private String deadline_time_formatted;
    private int event;
    private int event_day;
    private String sub_state;

    public EntryState() {
    }

    public Date getDeadline_time() {
	return deadline_time;
    }

    public String getDeadline_time_formatted() {
	return deadline_time_formatted;
    }

    public int getEvent() {
	return event;
    }

    public int getEvent_day() {
	return event_day;
    }

    public String getSub_state() {
	return sub_state;
    }

    public void setDeadline_time(Date deadline_time) {
	this.deadline_time = deadline_time;
    }

    public void setDeadline_time_formatted(String deadline_time_formatted) {
	this.deadline_time_formatted = deadline_time_formatted;
    }

    public void setEvent(int event) {
	this.event = event;
    }

    public void setEvent_day(int event_day) {
	this.event_day = event_day;
    }

    public void setSub_state(String sub_state) {
	this.sub_state = sub_state;
    }
}
