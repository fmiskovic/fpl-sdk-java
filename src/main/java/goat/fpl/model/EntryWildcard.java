package goat.fpl.model;

import java.util.Date;

public class EntryWildcard {

    private int chip;
    private long entry;
    private int event;
    private String name;
    private String played_time_formatted;
    private String status;
    private Date time;

    public EntryWildcard() {
    }

    public int getChip() {

	return chip;
    }

    public long getEntry() {
	return entry;
    }

    public int getEvent() {
	return event;
    }

    public String getName() {
	return name;
    }

    public String getPlayed_time_formatted() {
	return played_time_formatted;
    }

    public String getStatus() {
	return status;
    }

    public Date getTime() {
	return time;
    }

    public void setChip(int chip) {
	this.chip = chip;
    }

    public void setEntry(long entry) {
	this.entry = entry;
    }

    public void setEvent(int event) {
	this.event = event;
    }

    public void setName(String name) {
	this.name = name;
    }

    public void setPlayed_time_formatted(String played_time_formatted) {
	this.played_time_formatted = played_time_formatted;
    }

    public void setStatus(String status) {
	this.status = status;
    }

    public void setTime(Date time) {
	this.time = time;
    }
}
