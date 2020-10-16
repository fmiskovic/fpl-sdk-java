package fpl.sdk.model;

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

    public List<TeamFixture> getCurrent_event_fixture() {
        return current_event_fixture;
    }

    public int getDraw() {
        return draw;
    }

    public int getForm() {
        return form;
    }

    public long getId() {
        return id;
    }

    public String getLink_url() {
        return link_url;
    }

    public int getLoss() {
        return loss;
    }

    public String getName() {
        return name;
    }

    public List<TeamFixture> getNext_event_fixture() {
        return next_event_fixture;
    }

    public int getPlayed() {
        return played;
    }

    public int getPoints() {
        return points;
    }

    public int getPosition() {
        return position;
    }

    public String getShort_name() {
        return short_name;
    }

    public int getStrength() {
        return strength;
    }

    public int getStrength_attack_away() {
        return strength_attack_away;
    }

    public int getStrength_attack_home() {
        return strength_attack_home;
    }

    public int getStrength_defence_away() {
        return strength_defence_away;
    }

    public int getStrength_defence_home() {
        return strength_defence_home;
    }

    public int getStrength_overall_away() {
        return strength_overall_away;
    }

    public int getStrength_overall_home() {
        return strength_overall_home;
    }

    public int getTeam_division() {
        return team_division;
    }

    public boolean isUnavailable() {
        return unavailable;
    }

    public int getWin() {
        return win;
    }
}
