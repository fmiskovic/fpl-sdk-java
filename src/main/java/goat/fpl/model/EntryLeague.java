package goat.fpl.model;

import java.util.Date;

public class EntryLeague {

    private String _scoring;
    private long admin_entry;
    private boolean closed;
    private Date created;
    private boolean entry_can_admin;
    private boolean entry_can_forum;
    private boolean entry_can_invite;
    private boolean entry_can_leave;
    private Object entry_change;
    private String entry_code;
    private long entry_last_rank;
    private String entry_movement;
    private long entry_rank;
    private boolean forum_disabled;
    private long id;
    private String league_type;
    private boolean make_code_public;
    private String name;
    private Object rank;
    private boolean reprocess_standings;
    private String short_name;
    private Object size;
    private int start_event;

    public EntryLeague() {

    }

    public long getAdmin_entry() {
        return admin_entry;
    }

    public void setAdmin_entry(long admin_entry) {
        this.admin_entry = admin_entry;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Object getEntry_change() {
        return entry_change;
    }

    public void setEntry_change(Object entry_change) {
        this.entry_change = entry_change;
    }

    public String getEntry_code() {
        return entry_code;
    }

    public void setEntry_code(String entry_code) {
        this.entry_code = entry_code;
    }

    public long getEntry_last_rank() {
        return entry_last_rank;
    }

    public void setEntry_last_rank(long entry_last_rank) {
        this.entry_last_rank = entry_last_rank;
    }

    public String getEntry_movement() {
        return entry_movement;
    }

    public void setEntry_movement(String entry_movement) {
        this.entry_movement = entry_movement;
    }

    public long getEntry_rank() {
        return entry_rank;
    }

    public void setEntry_rank(long entry_rank) {
        this.entry_rank = entry_rank;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLeague_type() {
        return league_type;
    }

    public void setLeague_type(String league_type) {
        this.league_type = league_type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getRank() {
        return rank;
    }

    public void setRank(Object rank) {
        this.rank = rank;
    }

    public String getScoring() {
        return _scoring;
    }

    public void setScoring(String scoring) {
        _scoring = scoring;
    }

    public String getShort_name() {
        return short_name;
    }

    public void setShort_name(String short_name) {
        this.short_name = short_name;
    }

    public Object getSize() {
        return size;
    }

    public void setSize(Object size) {
        this.size = size;
    }

    public int getStart_event() {
        return start_event;
    }

    public void setStart_event(int start_event) {
        this.start_event = start_event;
    }

    public boolean isClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }

    public boolean isEntry_can_admin() {
        return entry_can_admin;
    }

    public void setEntry_can_admin(boolean entry_can_admin) {
        this.entry_can_admin = entry_can_admin;
    }

    public boolean isEntry_can_forum() {
        return entry_can_forum;
    }

    public void setEntry_can_forum(boolean entry_can_forum) {
        this.entry_can_forum = entry_can_forum;
    }

    public boolean isEntry_can_invite() {
        return entry_can_invite;
    }

    public void setEntry_can_invite(boolean entry_can_invite) {
        this.entry_can_invite = entry_can_invite;
    }

    public boolean isEntry_can_leave() {
        return entry_can_leave;
    }

    public void setEntry_can_leave(boolean entry_can_leave) {
        this.entry_can_leave = entry_can_leave;
    }

    public boolean isForum_disabled() {
        return forum_disabled;
    }

    public void setForum_disabled(boolean forum_disabled) {
        this.forum_disabled = forum_disabled;
    }

    public boolean isMake_code_public() {
        return make_code_public;
    }

    public void setMake_code_public(boolean make_code_public) {
        this.make_code_public = make_code_public;
    }

    public boolean isReprocess_standings() {
        return reprocess_standings;
    }

    public void setReprocess_standings(boolean reprocess_standings) {
        this.reprocess_standings = reprocess_standings;
    }
}
