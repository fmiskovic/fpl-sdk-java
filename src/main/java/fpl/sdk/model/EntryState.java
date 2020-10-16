package fpl.sdk.model;

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
}
