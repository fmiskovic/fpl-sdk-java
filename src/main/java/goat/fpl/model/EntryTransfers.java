package goat.fpl.model;

import java.util.List;

public class EntryTransfers {

    private Entry entry;
    private List<EntryTransferHistory> history;
    private EntryLeagues leagues;
    private List<EntryWildcard> wildcards;

    public EntryTransfers() {

    }

    public Entry getEntry() {
	return entry;
    }

    public List<EntryTransferHistory> getHistory() {
	return history;
    }

    public EntryLeagues getLeagues() {
	return leagues;
    }

    public List<EntryWildcard> getWildcards() {
	return wildcards;
    }

    public void setEntry(Entry entry) {
	this.entry = entry;
    }

    public void setHistory(List<EntryTransferHistory> history) {
	this.history = history;
    }

    public void setLeagues(EntryLeagues leagues) {
	this.leagues = leagues;
    }

    public void setWildcards(List<EntryWildcard> wildcards) {
	this.wildcards = wildcards;
    }
}
