package goat.fpl.domain.league;

import java.util.List;

public class TeamPicks {

    private String active_chip;

    private List<Pick> picks;

    public String getActive_chip() {
        return active_chip;
    }

    public List<Pick> getPicks() {
        return picks;
    }

    public void setActive_chip(String active_chip) {
        this.active_chip = active_chip;
    }

    public void setPicks(List<Pick> picks) {
        this.picks = picks;
    }
}
