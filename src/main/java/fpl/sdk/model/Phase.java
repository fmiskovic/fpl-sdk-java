package fpl.sdk.model;

public class Phase {

    private long id;

    private String name;

    private long start_event;

    private long stop_event;

    public Phase() {

    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getStart_event() {
        return start_event;
    }

    public long getStop_event() {
        return stop_event;
    }
}
