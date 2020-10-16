package fpl.sdk.model;

import java.util.List;

public class BootstrappedData {

    private int current_event;

    private List<ElementType> element_types;

    private List<Element> elements;

    private List<Event> events;

    private int last_entry_event;

    private int next_event;

    private List<Phase> phases;

    private List<Team> teams;

    private long total_players;

    public BootstrappedData() {
    }

    public int getCurrent_event() {
        return current_event;
    }

    public List<ElementType> getElement_types() {
        return element_types;
    }

    public List<Element> getElements() {
        return elements;
    }

    public List<Event> getEvents() {
        return events;
    }

    public int getLast_entry_event() {
        return last_entry_event;
    }

    public int getNext_event() {
        return next_event;
    }

    public List<Phase> getPhases() {
        return phases;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public long getTotal_players() {
        return total_players;
    }
}
