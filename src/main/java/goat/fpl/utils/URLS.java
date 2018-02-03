package goat.fpl.utils;

public class URLS {

    /**
     * Hooks into available fpl endpoints. The Available end-points are:
     * https://fantasy.premierleague.com/drf/bootstrap-static
     * https://fantasy.premierleague.com/drf/entry/${id}
     * https://fantasy.premierleague.com/drf/entry/${id}/history
     * https://fantasy.premierleague.com/drf/entry/${id}/event/{$eventNumber}/picks
     * https://fantasy.premierleague.com/drf/entry/${id}/transfers
     * https://fantasy.premierleague.com/drf/teams
     * https://fantasy.premierleague.com/drf/elements
     * https://fantasy.premierleague.com/drf/elements-types
     * https://fantasy.premierleague.com/drf/events
     * https://fantasy.premierleague.com/drf/game-settings
     * https://fantasy.premierleague.com/drf/event/${eventNumber}/live
     * https://fantasy.premierleague.com/drf/leagues-classic-standings/${id}
     */

    public static final String BASE = "https://fantasy.premierleague.com/drf";

    public static final String BOOTSTRAP = "/bootstrap-static";

    public static final String ENTRY_EVENT_PICKS = "/entry/%d/event/%d/picks";

    public static final String ENTRY_HISTORY = "/entry/%d/history";

    public static final String ENTRY_TRANSFERS = "/entry/%d/transfers";

    public static final String LEAGUE = "/leagues-classic-standings/%d?phase=%d&le-page=%d&ls-page=%d";

    public static final String PLAYER_SUM = "https://fantasy.premierleague.com/drf/element-summary/%d";

    public static final String TEAM_EVENT_INFO = "https://fantasy.premierleague.com/a/team/%d/event/%d";
}
