package goat.fpl.model;

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

    public Date getCreated() {
	return created;
    }

    public long getId() {

	return id;
    }

    public String getLeague_type() {
	return league_type;
    }

    public String getName() {
	return name;
    }

    public String getScoring() {
	return _scoring;
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

    public boolean isClosed() {
	return closed;
    }

    public boolean isForum_disabled() {
	return forum_disabled;
    }

    public boolean isMake_code_public() {
	return make_code_public;
    }

    public boolean isReprocess_standings() {
	return reprocess_standings;
    }

    public void setClosed(boolean closed) {
	this.closed = closed;
    }

    public void setCreated(Date created) {
	this.created = created;
    }

    public void setForum_disabled(boolean forum_disabled) {
	this.forum_disabled = forum_disabled;
    }

    public void setId(long id) {
	this.id = id;
    }

    public void setLeague_type(String league_type) {
	this.league_type = league_type;
    }

    public void setMake_code_public(boolean make_code_public) {
	this.make_code_public = make_code_public;
    }

    public void setName(String name) {
	this.name = name;
    }

    public void setReprocess_standings(boolean reprocess_standings) {
	this.reprocess_standings = reprocess_standings;
    }

    public void setScoring(String scoring) {
	_scoring = scoring;
    }

    public void setShort_name(String short_name) {
	this.short_name = short_name;
    }

    public void setSize(long size) {
	this.size = size;
    }

    public void setStart_event(int start_event) {
	this.start_event = start_event;
    }
}
