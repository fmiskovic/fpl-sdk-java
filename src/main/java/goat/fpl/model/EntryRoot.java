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

    public Entry getEntry() {
	return entry;
    }

    public EntryEvent[] getHistory() {
	return history;
    }

    public EntryLeagues getLeagues() {
	return leagues;
    }

    public EntrySeason[] getSeason() {
	return season;
    }

    public void setChips(EntryChip[] chips) {
	this.chips = chips;
    }

    public void setEntry(Entry entry) {
	this.entry = entry;
    }

    public void setHistory(EntryEvent[] history) {
	this.history = history;
    }

    public void setLeagues(EntryLeagues leagues) {
	this.leagues = leagues;
    }

    public void setSeason(EntrySeason[] season) {
	this.season = season;
    }
}
