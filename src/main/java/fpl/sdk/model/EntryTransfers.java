package fpl.sdk.model;

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
}
