package goat.fpl.model;

import java.util.Date;

public class Event {

    private long average_entry_score;
    private boolean data_checked;
    private Date deadline_time;
    private long deadline_time_epoch;
    private String deadline_time_formatted;
    private long deadline_time_game_offset;
    private boolean finished;
    private int highest_score;
    private int highest_scoring_entry;
    private long id;
    private boolean is_current;
    private boolean is_next;
    private boolean is_previous;
    private String name;

    public Event() {

    }

    public long getAverage_entry_score() {
	return average_entry_score;
    }

    public Date getDeadline_time() {
	return deadline_time;
    }

    public long getDeadline_time_epoch() {
	return deadline_time_epoch;
    }

    public String getDeadline_time_formatted() {
	return deadline_time_formatted;
    }

    public long getDeadline_time_game_offset() {
	return deadline_time_game_offset;
    }

    public int getHighest_score() {
	return highest_score;
    }

    public int getHighest_scoring_entry() {
	return highest_scoring_entry;
    }

    public long getId() {
	return id;
    }

    public String getName() {
	return name;
    }

    public boolean isData_checked() {
	return data_checked;
    }

    public boolean isFinished() {
	return finished;
    }

    public boolean isIs_current() {
	return is_current;
    }

    public boolean isIs_next() {
	return is_next;
    }

    public boolean isIs_previous() {
	return is_previous;
    }

    public void setAverage_entry_score(long average_entry_score) {
	this.average_entry_score = average_entry_score;
    }

    public void setData_checked(boolean data_checked) {
	this.data_checked = data_checked;
    }

    public void setDeadline_time(Date deadline_time) {
	this.deadline_time = deadline_time;
    }

    public void setDeadline_time_epoch(long deadline_time_epoch) {
	this.deadline_time_epoch = deadline_time_epoch;
    }

    public void setDeadline_time_formatted(String deadline_time_formatted) {
	this.deadline_time_formatted = deadline_time_formatted;
    }

    public void setDeadline_time_game_offset(long deadline_time_game_offset) {
	this.deadline_time_game_offset = deadline_time_game_offset;
    }

    public void setFinished(boolean finished) {
	this.finished = finished;
    }

    public void setHighest_score(int highest_score) {
	this.highest_score = highest_score;
    }

    public void setHighest_scoring_entry(int highest_scoring_entry) {
	this.highest_scoring_entry = highest_scoring_entry;
    }

    public void setId(long id) {
	this.id = id;
    }

    public void setIs_current(boolean is_current) {
	this.is_current = is_current;
    }

    public void setIs_next(boolean is_next) {
	this.is_next = is_next;
    }

    public void setIs_previous(boolean is_previous) {
	this.is_previous = is_previous;
    }

    public void setName(String name) {
	this.name = name;
    }

    @Override
    public String toString() {
	return "Event{" + ", id=" + id + ", name='" + name + "finished=" + finished + ", highest_score=" + highest_score
		+ ", is_current=" + is_current + ", is_next=" + is_next + ", is_previous=" + is_previous + '\'' + '}';
    }
}
