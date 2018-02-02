package goat.fpl.model;

public class FixtureStats {

    private FixtureStatHomeAndAway assists;
    private FixtureStatHomeAndAway bonus;
    private FixtureStatHomeAndAway bps;
    private FixtureStatHomeAndAway goals_scored;
    private FixtureStatHomeAndAway own_goals;
    private FixtureStatHomeAndAway penalties_missed;
    private FixtureStatHomeAndAway penalties_saved;
    private FixtureStatHomeAndAway red_cards;
    private FixtureStatHomeAndAway saves;
    private FixtureStatHomeAndAway yellow_cards;

    public FixtureStats() {
    }

    public FixtureStatHomeAndAway getAssists() {
	return assists;
    }

    public FixtureStatHomeAndAway getBonus() {
	return bonus;
    }

    public FixtureStatHomeAndAway getBps() {
	return bps;
    }

    public FixtureStatHomeAndAway getGoals_scored() {

	return goals_scored;
    }

    public FixtureStatHomeAndAway getOwn_goals() {
	return own_goals;
    }

    public FixtureStatHomeAndAway getPenalties_missed() {
	return penalties_missed;
    }

    public FixtureStatHomeAndAway getPenalties_saved() {
	return penalties_saved;
    }

    public FixtureStatHomeAndAway getRed_cards() {
	return red_cards;
    }

    public FixtureStatHomeAndAway getSaves() {
	return saves;
    }

    public FixtureStatHomeAndAway getYellow_cards() {
	return yellow_cards;
    }

    public void setAssists(FixtureStatHomeAndAway assists) {
	this.assists = assists;
    }

    public void setBonus(FixtureStatHomeAndAway bonus) {
	this.bonus = bonus;
    }

    public void setBps(FixtureStatHomeAndAway bps) {
	this.bps = bps;
    }

    public void setGoals_scored(FixtureStatHomeAndAway goals_scored) {
	this.goals_scored = goals_scored;
    }

    public void setOwn_goals(FixtureStatHomeAndAway own_goals) {
	this.own_goals = own_goals;
    }

    public void setPenalties_missed(FixtureStatHomeAndAway penalties_missed) {
	this.penalties_missed = penalties_missed;
    }

    public void setPenalties_saved(FixtureStatHomeAndAway penalties_saved) {
	this.penalties_saved = penalties_saved;
    }

    public void setRed_cards(FixtureStatHomeAndAway red_cards) {
	this.red_cards = red_cards;
    }

    public void setSaves(FixtureStatHomeAndAway saves) {
	this.saves = saves;
    }

    public void setYellow_cards(FixtureStatHomeAndAway yellow_cards) {
	this.yellow_cards = yellow_cards;
    }
}
