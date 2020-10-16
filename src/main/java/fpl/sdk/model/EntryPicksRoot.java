package fpl.sdk.model;

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
}
