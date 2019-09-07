package goat.fpl.model;

import java.util.List;

public class Team {

    private long code;
    private List<TeamFixture> current_event_fixture;
    private int draw;
    private int form;
    private long id;
    private String link_url;
    private int loss;
    private String name;
    private List<TeamFixture> next_event_fixture;
    private int played;
    private int points;
    private int position;
    private String short_name;
    private int strength;
    private int strength_attack_away;
    private int strength_attack_home;
    private int strength_defence_away;
    private int strength_defence_home;
    private int strength_overall_away;
    private int strength_overall_home;
    private int team_division;
    private boolean unavailable;
    private int win;

    public Team() {

    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public List<TeamFixture> getCurrent_event_fixture() {
        return current_event_fixture;
    }

    public void setCurrent_event_fixture(List<TeamFixture> current_event_fixture) {
        this.current_event_fixture = current_event_fixture;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public int getForm() {
        return form;
    }

    public void setForm(int form) {
        this.form = form;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLink_url() {
        return link_url;
    }

    public void setLink_url(String link_url) {
        this.link_url = link_url;
    }

    public int getLoss() {
        return loss;
    }

    public void setLoss(int loss) {
        this.loss = loss;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<TeamFixture> getNext_event_fixture() {
        return next_event_fixture;
    }

    public void setNext_event_fixture(List<TeamFixture> next_event_fixture) {
        this.next_event_fixture = next_event_fixture;
    }

    public int getPlayed() {
        return played;
    }

    public void setPlayed(int played) {
        this.played = played;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getShort_name() {
        return short_name;
    }

    public void setShort_name(String short_name) {
        this.short_name = short_name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength_attack_away() {
        return strength_attack_away;
    }

    public void setStrength_attack_away(int strength_attack_away) {
        this.strength_attack_away = strength_attack_away;
    }

    public int getStrength_attack_home() {
        return strength_attack_home;
    }

    public void setStrength_attack_home(int strength_attack_home) {
        this.strength_attack_home = strength_attack_home;
    }

    public int getStrength_defence_away() {
        return strength_defence_away;
    }

    public void setStrength_defence_away(int strength_defence_away) {
        this.strength_defence_away = strength_defence_away;
    }

    public int getStrength_defence_home() {
        return strength_defence_home;
    }

    public void setStrength_defence_home(int strength_defence_home) {
        this.strength_defence_home = strength_defence_home;
    }

    public int getStrength_overall_away() {
        return strength_overall_away;
    }

    public void setStrength_overall_away(int strength_overall_away) {
        this.strength_overall_away = strength_overall_away;
    }

    public int getStrength_overall_home() {
        return strength_overall_home;
    }

    public void setStrength_overall_home(int strength_overall_home) {
        this.strength_overall_home = strength_overall_home;
    }

    public int getTeam_division() {
        return team_division;
    }

    public void setTeam_division(int team_division) {
        this.team_division = team_division;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public boolean isUnavailable() {
        return unavailable;
    }

    public void setUnavailable(boolean unavailable) {
        this.unavailable = unavailable;
    }

    @Override
    public String toString() {
        return "Team{" + "code=" + code + ", name='" + name + '\'' + ", short_name='" + short_name + '\'' + '}';
    }
}
