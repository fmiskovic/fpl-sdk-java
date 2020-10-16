package fpl.sdk.model;

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

    public String get_scoring() {
        return _scoring;
    }

    public long getAdmin_entry() {
        return admin_entry;
    }

    public boolean isClosed() {
        return closed;
    }

    public Date getCreated() {
        return created;
    }

    public boolean isEntry_can_admin() {
        return entry_can_admin;
    }

    public boolean isEntry_can_forum() {
        return entry_can_forum;
    }

    public boolean isEntry_can_invite() {
        return entry_can_invite;
    }

    public boolean isEntry_can_leave() {
        return entry_can_leave;
    }

    public Object getEntry_change() {
        return entry_change;
    }

    public String getEntry_code() {
        return entry_code;
    }

    public long getEntry_last_rank() {
        return entry_last_rank;
    }

    public String getEntry_movement() {
        return entry_movement;
    }

    public long getEntry_rank() {
        return entry_rank;
    }

    public boolean isForum_disabled() {
        return forum_disabled;
    }

    public long getId() {
        return id;
    }

    public String getLeague_type() {
        return league_type;
    }

    public boolean isMake_code_public() {
        return make_code_public;
    }

    public String getName() {
        return name;
    }

    public Object getRank() {
        return rank;
    }

    public boolean isReprocess_standings() {
        return reprocess_standings;
    }

    public String getShort_name() {
        return short_name;
    }

    public Object getSize() {
        return size;
    }

    public int getStart_event() {
        return start_event;
    }
}
