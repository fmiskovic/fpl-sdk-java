package goat.fpl.model;

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

    public void setBank(int bank) {
        this.bank = bank;
    }

    public int getCurrent_event() {
        return current_event;
    }

    public void setCurrent_event(int current_event) {
        this.current_event = current_event;
    }

    public int getEvent_transfers() {
        return event_transfers;
    }

    public void setEvent_transfers(int event_transfers) {
        this.event_transfers = event_transfers;
    }

    public float getEvent_transfers_cost() {
        return event_transfers_cost;
    }

    public void setEvent_transfers_cost(float event_transfers_cost) {
        this.event_transfers_cost = event_transfers_cost;
    }

    public int getExtra_free_transfers() {
        return extra_free_transfers;
    }

    public void setExtra_free_transfers(int extra_free_transfers) {
        this.extra_free_transfers = extra_free_transfers;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getJoined_seconds() {
        return joined_seconds;
    }

    public void setJoined_seconds(int joined_seconds) {
        this.joined_seconds = joined_seconds;
    }

    public Date getJoined_time() {
        return joined_time;
    }

    public void setJoined_time(Date joined_time) {
        this.joined_time = joined_time;
    }

    public String getKit() {
        return kit;
    }

    public void setKit(String kit) {
        this.kit = kit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPlayer() {
        return player;
    }

    public void setPlayer(long player) {
        this.player = player;
    }

    public String getPlayer_first_name() {
        return player_first_name;
    }

    public void setPlayer_first_name(String player_first_name) {
        this.player_first_name = player_first_name;
    }

    public String getPlayer_last_name() {
        return player_last_name;
    }

    public void setPlayer_last_name(String player_last_name) {
        this.player_last_name = player_last_name;
    }

    public long getPlayer_region_id() {
        return player_region_id;
    }

    public void setPlayer_region_id(long player_region_id) {
        this.player_region_id = player_region_id;
    }

    public String getPlayer_region_name() {
        return player_region_name;
    }

    public void setPlayer_region_name(String player_region_name) {
        this.player_region_name = player_region_name;
    }

    public String getPlayer_region_short_iso() {
        return player_region_short_iso;
    }

    public void setPlayer_region_short_iso(String player_region_short_iso) {
        this.player_region_short_iso = player_region_short_iso;
    }

    public int getStarted_event() {
        return started_event;
    }

    public void setStarted_event(int started_event) {
        this.started_event = started_event;
    }

    public int getSummary_event_points() {
        return summary_event_points;
    }

    public void setSummary_event_points(int summary_event_points) {
        this.summary_event_points = summary_event_points;
    }

    public long getSummary_event_rank() {
        return summary_event_rank;
    }

    public void setSummary_event_rank(long summary_event_rank) {
        this.summary_event_rank = summary_event_rank;
    }

    public int getSummary_overall_points() {
        return summary_overall_points;
    }

    public void setSummary_overall_points(int summary_overall_points) {
        this.summary_overall_points = summary_overall_points;
    }

    public long getSummary_overall_rank() {
        return summary_overall_rank;
    }

    public void setSummary_overall_rank(long summary_overall_rank) {
        this.summary_overall_rank = summary_overall_rank;
    }

    public long getTotal_loans() {
        return total_loans;
    }

    public void setTotal_loans(long total_loans) {
        this.total_loans = total_loans;
    }

    public long getTotal_loans_active() {
        return total_loans_active;
    }

    public void setTotal_loans_active(long total_loans_active) {
        this.total_loans_active = total_loans_active;
    }

    public long getTotal_transfers() {
        return total_transfers;
    }

    public void setTotal_transfers(long total_transfers) {
        this.total_transfers = total_transfers;
    }

    public String getTransfers_or_loans() {
        return transfers_or_loans;
    }

    public void setTransfers_or_loans(String transfers_or_loans) {
        this.transfers_or_loans = transfers_or_loans;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public boolean isEmail() {
        return email;
    }

    public void setEmail(boolean email) {
        this.email = email;
    }
}
