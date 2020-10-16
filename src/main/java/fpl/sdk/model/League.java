package fpl.sdk.model;

import java.util.Date;

public class League {

    private String _scoring;

    private boolean closed;

    private Date created;

    private boolean forum_disabled;

    private long id;

    private String league_type;

    private boolean make_code_public;

    private String name;

    private boolean reprocess_standings;

    private String short_name;

    private long size;

    private int start_event;

    public League() {
    }

    public String get_scoring() {
        return _scoring;
    }

    public boolean isClosed() {
        return closed;
    }

    public Date getCreated() {
        return created;
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

    public boolean isReprocess_standings() {
        return reprocess_standings;
    }

    public String getShort_name() {
        return short_name;
    }

    public long getSize() {
        return size;
    }

    public int getStart_event() {
        return start_event;
    }
}
