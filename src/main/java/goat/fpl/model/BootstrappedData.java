package goat.fpl.model;

public class BootstrappedData {

    private int current_event;
    private ElementType[] element_types;
    private Element[] elements;
    private Event[] events;
    private int last_entry_event;
    private int next_event;
    private Phase[] phases;
    private Team[] teams;
    private long total_players;

    public BootstrappedData() {
    }

    public int getCurrent_event() {
        return current_event;
    }

    public void setCurrent_event(int current_event) {
        this.current_event = current_event;
    }

    public ElementType[] getElement_types() {
        return element_types;
    }

    public void setElement_types(ElementType[] element_types) {
        this.element_types = element_types;
    }

    public Element[] getElements() {
        return elements;
    }

    public void setElements(Element[] elements) {
        this.elements = elements;
    }

    public Event[] getEvents() {
        return events;
    }

    public void setEvents(Event[] events) {
        this.events = events;
    }

    public int getLast_entry_event() {
        return last_entry_event;
    }

    public void setLast_entry_event(int last_entry_event) {
        this.last_entry_event = last_entry_event;
    }

    public int getNext_event() {
        return next_event;
    }

    public void setNext_event(int next_event) {
        this.next_event = next_event;
    }

    public Phase[] getPhases() {
        return phases;
    }

    public void setPhases(Phase[] phases) {
        this.phases = phases;
    }

    public Team[] getTeams() {
        return teams;
    }

    public void setTeams(Team[] teams) {
        this.teams = teams;
    }

    public long getTotal_players() {
        return total_players;
    }

    public void setTotal_players(long total_players) {
        this.total_players = total_players;
    }
}
