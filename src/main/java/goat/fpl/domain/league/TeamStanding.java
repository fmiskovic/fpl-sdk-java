package goat.fpl.domain.league;

public class TeamStanding {

    private String activeChip;

    private String captain;

    private String fplPlayerName;

    private String fplTeamName;

    private long totalScore;

    private String viceCaptain;

    public String getActiveChip() {
        return activeChip;
    }

    public String getCaptain() {
        return captain;
    }

    public String getFplPlayerName() {
        return fplPlayerName;
    }

    public String getFplTeamName() {
        return fplTeamName;
    }

    public long getTotalScore() {
        return totalScore;
    }

    public String getViceCaptain() {
        return viceCaptain;
    }

    public void setActiveChip(String activeChip) {
        this.activeChip = activeChip;
    }

    public void setCaptain(String captain) {
        this.captain = captain;
    }

    public void setFplPlayerName(String fplPlayerName) {
        this.fplPlayerName = fplPlayerName;
    }

    public void setFplTeamName(String fplTeamName) {
        this.fplTeamName = fplTeamName;
    }

    public void setTotalScore(long totalScore) {
        this.totalScore = totalScore;
    }

    public void setViceCaptain(String viceCaptain) {
        this.viceCaptain = viceCaptain;
    }
}
