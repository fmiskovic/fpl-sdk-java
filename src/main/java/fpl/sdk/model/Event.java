package fpl.sdk.model;

import java.util.Date;
import java.util.List;

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

    private List<ChipPlays> chip_plays;

    private long most_selected;

    private long most_transferred_in;

    private long top_element;

    private long transfers_made;

    private long most_captained;

    private long most_vice_captained;

    private TopElementInfo top_element_info;

    public Event() {

    }

    public long getMost_selected() {
        return most_selected;
    }

    public long getMost_transferred_in() {
        return most_transferred_in;
    }

    public long getTop_element() {
        return top_element;
    }

    public long getTransfers_made() {
        return transfers_made;
    }

    public long getMost_captained() {
        return most_captained;
    }

    public long getMost_vice_captained() {
        return most_vice_captained;
    }

    public TopElementInfo getTop_element_info() {
        return top_element_info;
    }

    public List<ChipPlays> getChip_plays() {
        return chip_plays;
    }

    public long getAverage_entry_score() {
        return average_entry_score;
    }

    public boolean isData_checked() {
        return data_checked;
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

    public boolean isFinished() {
        return finished;
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

    public boolean isIs_current() {
        return is_current;
    }

    public boolean isIs_next() {
        return is_next;
    }

    public boolean isIs_previous() {
        return is_previous;
    }

    public String getName() {
        return name;
    }
}
