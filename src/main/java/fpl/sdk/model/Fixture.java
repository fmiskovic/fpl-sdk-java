package fpl.sdk.model;

import java.util.Date;

public class Fixture {

    private int code;

    private Date deadline_time;

    private String deadline_time_formatted;

    private int event;

    private int event_day;

    private boolean finished;

    private boolean finished_provisional;

    private long id;

    private Date kickoff_time;

    private String kickoff_time_formatted;

    private int minutes;

    private boolean provisional_start_time;

    private boolean started;

    private FixtureStats stats;

    private int team_a;

    private int team_a_score;

    private int team_h;

    private int team_h_score;

    public Fixture() {
    }

    public int getCode() {
        return code;
    }

    public Date getDeadline_time() {
        return deadline_time;
    }

    public String getDeadline_time_formatted() {
        return deadline_time_formatted;
    }

    public int getEvent() {
        return event;
    }

    public int getEvent_day() {
        return event_day;
    }

    public boolean isFinished() {
        return finished;
    }

    public boolean isFinished_provisional() {
        return finished_provisional;
    }

    public long getId() {
        return id;
    }

    public Date getKickoff_time() {
        return kickoff_time;
    }

    public String getKickoff_time_formatted() {
        return kickoff_time_formatted;
    }

    public int getMinutes() {
        return minutes;
    }

    public boolean isProvisional_start_time() {
        return provisional_start_time;
    }

    public boolean isStarted() {
        return started;
    }

    public FixtureStats getStats() {
        return stats;
    }

    public int getTeam_a() {
        return team_a;
    }

    public int getTeam_a_score() {
        return team_a_score;
    }

    public int getTeam_h() {
        return team_h;
    }

    public int getTeam_h_score() {
        return team_h_score;
    }
}
