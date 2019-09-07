package goat.fpl.model;

public class EntryTransfers {

    private Entry entry;
    private EntryTransferHistory[] history;
    private EntryLeagues leagues;
    private EntryWildcard[] wildcards;

    public EntryTransfers() {

    }

    public Entry getEntry() {
        return entry;
    }

    public void setEntry(Entry entry) {
        this.entry = entry;
    }

    public EntryTransferHistory[] getHistory() {
        return history;
    }

    public void setHistory(EntryTransferHistory[] history) {
        this.history = history;
    }

    public EntryLeagues getLeagues() {
        return leagues;
    }

    public void setLeagues(EntryLeagues leagues) {
        this.leagues = leagues;
    }

    public EntryWildcard[] getWildcards() {
        return wildcards;
    }

    public void setWildcards(EntryWildcard[] wildcards) {
        this.wildcards = wildcards;
    }
}
