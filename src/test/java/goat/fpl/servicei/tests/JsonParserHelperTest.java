package goat.fpl.servicei.tests;

import org.junit.Assert;
import org.junit.Test;

import goat.fpl.domain.league.LeagueHolder;
import goat.fpl.utils.JsonParserHelper;

public class JsonParserHelperTest {

    @Test
    public void readEmptyJsonTest() {
        String emptyJson = "{}";

        LeagueHolder leagueHolder = JsonParserHelper.readValue(emptyJson, LeagueHolder.class);

        Assert.assertNotNull(leagueHolder);
    }

    @Test(expected = RuntimeException.class)
    public void readEmptyValueTest() {
        String emptyJson = "";

        LeagueHolder leagueHolder = JsonParserHelper.readValue(emptyJson, LeagueHolder.class);

        Assert.assertNotNull(leagueHolder);
    }

    @Test(expected = RuntimeException.class)
    public void readNullValueTest() {
        String emptyJson = null;

        LeagueHolder leagueHolder = JsonParserHelper.readValue(emptyJson, LeagueHolder.class);

        Assert.assertNotNull(leagueHolder);
    }
}
