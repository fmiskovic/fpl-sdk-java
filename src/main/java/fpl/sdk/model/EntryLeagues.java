package fpl.sdk.model;

import java.util.List;

public class EntryLeagues {

    private List<EntryLeague> classic;

    private List<EntryLeague> cup;

    private List<EntryLeague> h2h;

    public EntryLeagues() {

    }

    public List<EntryLeague> getClassic() {
        return classic;
    }

    public List<EntryLeague> getCup() {
        return cup;
    }

    public List<EntryLeague> getH2h() {
        return h2h;
    }
}
