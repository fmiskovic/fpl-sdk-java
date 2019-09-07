package goat.fpl.model;

import java.util.Date;

public class EntryChip {

    private int chip;
    private long entry;
    private long event;
    private String name;
    private String played_time_formatted;
    private String status;
    private Date time;

    public EntryChip() {

    }

    public int getChip() {
        return chip;
    }

    public void setChip(int chip) {
        this.chip = chip;
    }

    public long getEntry() {
        return entry;
    }

    public void setEntry(long entry) {
        this.entry = entry;
    }

    public long getEvent() {
        return event;
    }

    public void setEvent(long event) {
        this.event = event;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlayed_time_formatted() {
        return played_time_formatted;
    }

    public void setPlayed_time_formatted(String played_time_formatted) {
        this.played_time_formatted = played_time_formatted;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
