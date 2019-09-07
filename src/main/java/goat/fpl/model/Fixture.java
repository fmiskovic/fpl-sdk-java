package goat.fpl.model;

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

    public void setCode(int code) {
        this.code = code;
    }

    public Date getDeadline_time() {
        return deadline_time;
    }

    public void setDeadline_time(Date deadline_time) {
        this.deadline_time = deadline_time;
    }

    public String getDeadline_time_formatted() {
        return deadline_time_formatted;
    }

    public void setDeadline_time_formatted(String deadline_time_formatted) {
        this.deadline_time_formatted = deadline_time_formatted;
    }

    public int getEvent() {
        return event;
    }

    public void setEvent(int event) {
        this.event = event;
    }

    public int getEvent_day() {
        return event_day;
    }

    public void setEvent_day(int event_day) {
        this.event_day = event_day;
    }

    public long getId() {

        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getKickoff_time() {
        return kickoff_time;
    }

    public void setKickoff_time(Date kickoff_time) {
        this.kickoff_time = kickoff_time;
    }

    public String getKickoff_time_formatted() {
        return kickoff_time_formatted;
    }

    public void setKickoff_time_formatted(String kickoff_time_formatted) {
        this.kickoff_time_formatted = kickoff_time_formatted;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public FixtureStats getStats() {
        return stats;
    }

    public void setStats(FixtureStats stats) {
        this.stats = stats;
    }

    public int getTeam_a() {
        return team_a;
    }

    public void setTeam_a(int team_a) {
        this.team_a = team_a;
    }

    public int getTeam_a_score() {
        return team_a_score;
    }

    public void setTeam_a_score(int team_a_score) {
        this.team_a_score = team_a_score;
    }

    public int getTeam_h() {
        return team_h;
    }

    public void setTeam_h(int team_h) {
        this.team_h = team_h;
    }

    public int getTeam_h_score() {
        return team_h_score;
    }

    public void setTeam_h_score(int team_h_score) {
        this.team_h_score = team_h_score;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public boolean isFinished_provisional() {
        return finished_provisional;
    }

    public void setFinished_provisional(boolean finished_provisional) {
        this.finished_provisional = finished_provisional;
    }

    public boolean isProvisional_start_time() {
        return provisional_start_time;
    }

    public void setProvisional_start_time(boolean provisional_start_time) {
        this.provisional_start_time = provisional_start_time;
    }

    public boolean isStarted() {
        return started;
    }

    public void setStarted(boolean started) {
        this.started = started;
    }
}
