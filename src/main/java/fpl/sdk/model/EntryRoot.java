package fpl.sdk.model;

import java.util.List;

public class EntryRoot {

    private List<EntryChip> chips;

    private Entry entry;

    private List<EntryEvent> history;

    private EntryLeagues leagues;

    private List<EntrySeason> season;

    public EntryRoot() {

    }

    public List<EntryChip> getChips() {
        return chips;
    }

    public Entry getEntry() {
        return entry;
    }

    public List<EntryEvent> getHistory() {
        return history;
    }

    public EntryLeagues getLeagues() {
        return leagues;
    }

    public List<EntrySeason> getSeason() {
        return season;
    }
}
