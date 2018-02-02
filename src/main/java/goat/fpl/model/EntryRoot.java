package goat.fpl.model;

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

    public void setChips(List<EntryChip> chips) {
	this.chips = chips;
    }

    public void setEntry(Entry entry) {
	this.entry = entry;
    }

    public void setHistory(List<EntryEvent> history) {
	this.history = history;
    }

    public void setLeagues(EntryLeagues leagues) {
	this.leagues = leagues;
    }

    public void setSeason(List<EntrySeason> season) {
	this.season = season;
    }
}
