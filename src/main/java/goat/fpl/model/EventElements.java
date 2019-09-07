package goat.fpl.model;

import java.util.Map;

//https://jsoneditoronline.org/?id=f8d7d65e52b09321ab707eedc1a73031
public class EventElements {

    private Map<Long, ElementStats> stats;

    public Map<Long, ElementStats> getStats() {
        return stats;
    }

    public void setStats(Map<Long, ElementStats> stats) {
        this.stats = stats;
    }
}
