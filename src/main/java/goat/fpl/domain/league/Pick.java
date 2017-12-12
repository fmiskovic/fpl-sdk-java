package goat.fpl.domain.league;

public class Pick {

    private long element;

    private boolean is_captain;

    private boolean is_vice_captain;

    private int position;

    public long getElement() {
        return element;
    }

    public int getPosition() {
        return position;
    }

    public boolean isIs_captain() {
        return is_captain;
    }

    public boolean isIs_vice_captain() {
        return is_vice_captain;
    }

    public void setElement(long element) {
        this.element = element;
    }

    public void setIs_captain(boolean is_captain) {
        this.is_captain = is_captain;
    }

    public void setIs_vice_captain(boolean is_vice_captain) {
        this.is_vice_captain = is_vice_captain;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
