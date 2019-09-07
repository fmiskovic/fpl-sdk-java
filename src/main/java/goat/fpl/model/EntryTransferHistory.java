package goat.fpl.model;

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

    public void setElement_in(long element_in) {
        this.element_in = element_in;
    }

    public float getElement_in_cost() {
        return element_in_cost;
    }

    public void setElement_in_cost(float element_in_cost) {
        this.element_in_cost = element_in_cost;
    }

    public long getElement_out() {
        return element_out;
    }

    public void setElement_out(long element_out) {
        this.element_out = element_out;
    }

    public float getElement_out_cost() {
        return element_out_cost;
    }

    public void setElement_out_cost(float element_out_cost) {
        this.element_out_cost = element_out_cost;
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

    public long getId() {

        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getTime_formatted() {
        return time_formatted;
    }

    public void setTime_formatted(String time_formatted) {
        this.time_formatted = time_formatted;
    }
}
