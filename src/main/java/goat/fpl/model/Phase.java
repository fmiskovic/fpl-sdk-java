package goat.fpl.model;

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

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getStart_event() {
        return start_event;
    }

    public void setStart_event(long start_event) {
        this.start_event = start_event;
    }

    public long getStop_event() {
        return stop_event;
    }

    public void setStop_event(long stop_event) {
        this.stop_event = stop_event;
    }

    @Override
    public String toString() {
        return "Phase{" + "id=" + id + ", name='" + name + '\'' + '}';
    }
}
