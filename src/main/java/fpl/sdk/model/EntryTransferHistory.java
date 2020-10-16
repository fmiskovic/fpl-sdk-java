package fpl.sdk.model;

import java.util.Date;

public class EntryTransferHistory {

    private long element_in;

    private float element_in_cost;

    private long element_out;

    private float element_out_cost;

    private long entry;

    private long event;

    private long id;

    private Date time;

    private String time_formatted;

    public EntryTransferHistory() {
    }

    public long getElement_in() {
        return element_in;
    }

    public float getElement_in_cost() {
        return element_in_cost;
    }

    public long getElement_out() {
        return element_out;
    }

    public float getElement_out_cost() {
        return element_out_cost;
    }

    public long getEntry() {
        return entry;
    }

    public long getEvent() {
        return event;
    }

    public long getId() {
        return id;
    }

    public Date getTime() {
        return time;
    }

    public String getTime_formatted() {
        return time_formatted;
    }
}
