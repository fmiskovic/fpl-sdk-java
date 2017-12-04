package goat.fpl.domain.player;

public class Player {

    private int assists;
    private int bonus;
    private int bps;
    private String chance_of_playing_next_round;
    private String chance_of_playing_this_round;
    private int clean_sheets;
    private String creativity;
    private int element_type;
    private int event_points;
    private String first_name;
    private int goals_conceded;
    private int goals_scored;
    private String ict_index;
    private int id;
    private String influence;
    private int minutes;
    private int own_goals;
    private int penalties_missed;
    private int penalties_saved;
    private String points_per_game;
    private int red_cards;
    private int saves;
    private String second_name;
    private String status;
    private int team;
    private String threat;
    private int total_points;
    private long transfers_in;
    private long transfers_in_event;
    private long transfers_out;
    private long transfers_out_event;
    private String web_name;
    private int yellow_cards;

    public int getAssists() {
        return assists;
    }

    public int getBonus() {
        return bonus;
    }

    public int getBps() {
        return bps;
    }

    public String getChance_of_playing_next_round() {
        return chance_of_playing_next_round;
    }

    public String getChance_of_playing_this_round() {
        return chance_of_playing_this_round;
    }

    public int getClean_sheets() {
        return clean_sheets;
    }

    public String getCreativity() {
        return creativity;
    }

    public int getElement_type() {
        return element_type;
    }

    public int getEvent_points() {
        return event_points;
    }

    public String getFirst_name() {
        return first_name;
    }

    public int getGoals_conceded() {
        return goals_conceded;
    }

    public int getGoals_scored() {
        return goals_scored;
    }

    public String getIct_index() {
        return ict_index;
    }

    public int getId() {
        return id;
    }

    public String getInfluence() {
        return influence;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getOwn_goals() {
        return own_goals;
    }

    public int getPenalties_missed() {
        return penalties_missed;
    }

    public int getPenalties_saved() {
        return penalties_saved;
    }

    public String getPoints_per_game() {
        return points_per_game;
    }

    public int getRed_cards() {
        return red_cards;
    }

    public int getSaves() {
        return saves;
    }

    public String getSecond_name() {
        return second_name;
    }

    public String getStatus() {
        return status;
    }

    public int getTeam() {
        return team;
    }

    public String getThreat() {
        return threat;
    }

    public int getTotal_points() {
        return total_points;
    }

    public long getTransfers_in() {
        return transfers_in;
    }

    public long getTransfers_in_event() {
        return transfers_in_event;
    }

    public long getTransfers_out() {
        return transfers_out;
    }

    public long getTransfers_out_event() {
        return transfers_out_event;
    }

    public String getWeb_name() {
        return web_name;
    }

    public int getYellow_cards() {
        return yellow_cards;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public void setBps(int bps) {
        this.bps = bps;
    }

    public void setChance_of_playing_next_round(String chance_of_playing_next_round) {
        this.chance_of_playing_next_round = chance_of_playing_next_round;
    }

    public void setChance_of_playing_this_round(String chance_of_playing_this_round) {
        this.chance_of_playing_this_round = chance_of_playing_this_round;
    }

    public void setClean_sheets(int clean_sheets) {
        this.clean_sheets = clean_sheets;
    }

    public void setCreativity(String creativity) {
        this.creativity = creativity;
    }

    public void setElement_type(int element_type) {
        this.element_type = element_type;
    }

    public void setEvent_points(int event_points) {
        this.event_points = event_points;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setGoals_conceded(int goals_conceded) {
        this.goals_conceded = goals_conceded;
    }

    public void setGoals_scored(int goals_scored) {
        this.goals_scored = goals_scored;
    }

    public void setIct_index(String ict_index) {
        this.ict_index = ict_index;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setInfluence(String influence) {
        this.influence = influence;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setOwn_goals(int own_goals) {
        this.own_goals = own_goals;
    }

    public void setPenalties_missed(int penalties_missed) {
        this.penalties_missed = penalties_missed;
    }

    public void setPenalties_saved(int penalties_saved) {
        this.penalties_saved = penalties_saved;
    }

    public void setPoints_per_game(String points_per_game) {
        this.points_per_game = points_per_game;
    }

    public void setRed_cards(int red_cards) {
        this.red_cards = red_cards;
    }

    public void setSaves(int saves) {
        this.saves = saves;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTeam(int team) {
        this.team = team;
    }

    public void setThreat(String threat) {
        this.threat = threat;
    }

    public void setTotal_points(int total_points) {
        this.total_points = total_points;
    }

    public void setTransfers_in(long transfers_in) {
        this.transfers_in = transfers_in;
    }

    public void setTransfers_in_event(long transfers_in_event) {
        this.transfers_in_event = transfers_in_event;
    }

    public void setTransfers_out(long transfers_out) {
        this.transfers_out = transfers_out;
    }

    public void setTransfers_out_event(long transfers_out_event) {
        this.transfers_out_event = transfers_out_event;
    }

    public void setWeb_name(String web_name) {
        this.web_name = web_name;
    }

    public void setYellow_cards(int yellow_cards) {
        this.yellow_cards = yellow_cards;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", web_name='" + web_name + '\'' +
                '}';
    }
}
