package goat.fpl.domain.player;

import java.util.List;

public class PlayerSummaryHolder {

    private List<PlayerSummary> history;

    public List<PlayerSummary> getHistory() {
        return history;
    }

    public void setHistory(List<PlayerSummary> history) {
        this.history = history;
    }
}
