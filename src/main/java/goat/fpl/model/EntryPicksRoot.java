package goat.fpl.model;

import java.util.List;

public class EntryPicksRoot {

    private String active_chip;
    private List<EntryAutomaticSub> automatic_subs;
    private EntryEvent entry_history;
    private Event event;
    private List<EntryPick> picks;

    public EntryPicksRoot() {

    }

    public String getActive_chip() {
	return active_chip;
    }

    public List<EntryAutomaticSub> getAutomatic_subs() {
	return automatic_subs;
    }

    public EntryEvent getEntry_history() {
	return entry_history;
    }

    public Event getEvent() {
	return event;
    }

    public List<EntryPick> getPicks() {
	return picks;
    }

    public void setActive_chip(String active_chip) {
	this.active_chip = active_chip;
    }

    public void setAutomatic_subs(List<EntryAutomaticSub> automatic_subs) {
	this.automatic_subs = automatic_subs;
    }

    public void setEntry_history(EntryEvent entry_history) {
	this.entry_history = entry_history;
    }

    public void setEvent(Event event) {
	this.event = event;
    }

    public void setPicks(List<EntryPick> picks) {
	this.picks = picks;
    }
}
