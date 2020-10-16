package fpl.sdk.utils;

public class URLS {

    /**
     * Hooks into available fpl endpoints. The Available end-points are:
     * https://fantasy.premierleague.com/api/bootstrap-static
     * https://fantasy.premierleague.com/api/entry/${id}
     * https://fantasy.premierleague.com/api/entry/${id}/history
     * https://fantasy.premierleague.com/api/entry/${id}/event/{$eventNumber}/picks
     * https://fantasy.premierleague.com/api/entry/${id}/transfers
     * https://fantasy.premierleague.com/api/teams
     * https://fantasy.premierleague.com/api/elements
     * https://fantasy.premierleague.com/api/elements-types
     * https://fantasy.premierleague.com/api/events
     * https://fantasy.premierleague.com/api/game-settings
     * https://fantasy.premierleague.com/api/event/${eventNumber}/live
     * https://fantasy.premierleague.com/api/leagues-classic-standings/${id}
     */

    public static final String BASE = "https://fantasy.premierleague.com/api";

    public static final String BOOTSTRAP = "/bootstrap-static/";

    public static final String ENTRY_EVENT_PICKS = "/entry/%d/event/%d/picks/";

    public static final String ENTRY_HISTORY = "/entry/%d/history/";

    public static final String ENTRY_TRANSFERS = "/entry/%d/transfers/";

    public static final String LEAGUE = "/leagues-classic-standings/%d?phase=%d&le-page=%d&ls-page=%d/";

    public static final String EVENT_LIVE = "/event/%d/live/";

    public static final String PLAYER_SUM = "/element-summary/%d/";
}
