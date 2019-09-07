package goat.fpl.model;

public class EntryPicksRoot {

    private String active_chip;
    private EntryAutomaticSub[] automatic_subs;
    private EntryEvent entry_history;
    private Event event;
    private EntryPick[] picks;

    public EntryPicksRoot() {

    }

    public String getActive_chip() {
        return active_chip;
    }

    public void setActive_chip(String active_chip) {
        this.active_chip = active_chip;
    }

    public EntryAutomaticSub[] getAutomatic_subs() {
        return automatic_subs;
    }

    public void setAutomatic_subs(EntryAutomaticSub[] automatic_subs) {
        this.automatic_subs = automatic_subs;
    }

    public EntryEvent getEntry_history() {
        return entry_history;
    }

    public void setEntry_history(EntryEvent entry_history) {
        this.entry_history = entry_history;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public EntryPick[] getPicks() {
        return picks;
    }

    public void setPicks(EntryPick[] picks) {
        this.picks = picks;
    }
}
