package goat.fpl.model;

public class EntryRoot {

    private EntryChip[] chips;
    private Entry entry;
    private EntryEvent[] history;
    private EntryLeagues leagues;
    private EntrySeason[] season;

    public EntryRoot() {

    }

    public EntryChip[] getChips() {
        return chips;
    }

    public void setChips(EntryChip[] chips) {
        this.chips = chips;
    }

    public Entry getEntry() {
        return entry;
    }

    public void setEntry(Entry entry) {
        this.entry = entry;
    }

    public EntryEvent[] getHistory() {
        return history;
    }

    public void setHistory(EntryEvent[] history) {
        this.history = history;
    }

    public EntryLeagues getLeagues() {
        return leagues;
    }

    public void setLeagues(EntryLeagues leagues) {
        this.leagues = leagues;
    }

    public EntrySeason[] getSeason() {
        return season;
    }

    public void setSeason(EntrySeason[] season) {
        this.season = season;
    }
}
