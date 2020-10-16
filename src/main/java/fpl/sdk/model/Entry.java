package fpl.sdk.model;

import java.util.Date;

public class Entry {

    private int bank;

    private int current_event;

    private boolean deleted;

    private boolean email;

    private int event_transfers;

    private float event_transfers_cost;

    private int extra_free_transfers;

    private long id;

    private int joined_seconds;

    private Date joined_time;

    private String kit;

    private String name;

    private long player;

    private String player_first_name;

    private String player_last_name;

    private long player_region_id;

    private String player_region_name;

    private String player_region_short_iso;

    private int started_event;

    private int summary_event_points;

    private long summary_event_rank;

    private int summary_overall_points;

    private long summary_overall_rank;

    private long total_loans;

    private long total_loans_active;

    private long total_transfers;

    private String transfers_or_loans;

    private int value;

    public Entry() {

    }

    public int getBank() {
        return bank;
    }

    public int getCurrent_event() {
        return current_event;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public boolean isEmail() {
        return email;
    }

    public int getEvent_transfers() {
        return event_transfers;
    }

    public float getEvent_transfers_cost() {
        return event_transfers_cost;
    }

    public int getExtra_free_transfers() {
        return extra_free_transfers;
    }

    public long getId() {
        return id;
    }

    public int getJoined_seconds() {
        return joined_seconds;
    }

    public Date getJoined_time() {
        return joined_time;
    }

    public String getKit() {
        return kit;
    }

    public String getName() {
        return name;
    }

    public long getPlayer() {
        return player;
    }

    public String getPlayer_first_name() {
        return player_first_name;
    }

    public String getPlayer_last_name() {
        return player_last_name;
    }

    public long getPlayer_region_id() {
        return player_region_id;
    }

    public String getPlayer_region_name() {
        return player_region_name;
    }

    public String getPlayer_region_short_iso() {
        return player_region_short_iso;
    }

    public int getStarted_event() {
        return started_event;
    }

    public int getSummary_event_points() {
        return summary_event_points;
    }

    public long getSummary_event_rank() {
        return summary_event_rank;
    }

    public int getSummary_overall_points() {
        return summary_overall_points;
    }

    public long getSummary_overall_rank() {
        return summary_overall_rank;
    }

    public long getTotal_loans() {
        return total_loans;
    }

    public long getTotal_loans_active() {
        return total_loans_active;
    }

    public long getTotal_transfers() {
        return total_transfers;
    }

    public String getTransfers_or_loans() {
        return transfers_or_loans;
    }

    public int getValue() {
        return value;
    }
}
