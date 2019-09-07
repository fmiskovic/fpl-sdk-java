package goat.fpl.model;

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

    public void setClassic(List<EntryLeague> classic) {
        this.classic = classic;
    }

    public List<EntryLeague> getCup() {
        return cup;
    }

    public void setCup(List<EntryLeague> cup) {
        this.cup = cup;
    }

    public List<EntryLeague> getH2h() {
        return h2h;
    }

    public void setH2h(List<EntryLeague> h2h) {
        this.h2h = h2h;
    }
}
