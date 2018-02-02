package goat.fpl.model;

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

    public void setCurrent_event(int current_event) {
	this.current_event = current_event;
    }

    public void setElement_types(List<ElementType> element_types) {
	this.element_types = element_types;
    }

    public void setElements(List<Element> elements) {
	this.elements = elements;
    }

    public void setEvents(List<Event> events) {
	this.events = events;
    }

    public void setLast_entry_event(int last_entry_event) {
	this.last_entry_event = last_entry_event;
    }

    public void setNext_event(int next_event) {
	this.next_event = next_event;
    }

    public void setPhases(List<Phase> phases) {
	this.phases = phases;
    }

    public void setTeams(List<Team> teams) {
	this.teams = teams;
    }

    public void setTotal_players(long total_players) {
	this.total_players = total_players;
    }
}
