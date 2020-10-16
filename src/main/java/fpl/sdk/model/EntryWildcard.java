package fpl.sdk.model;

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
}
