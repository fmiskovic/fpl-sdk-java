package goat.fpl.servicei.tests;

import goat.fpl.model.League;
import goat.fpl.utils.JsonParserHelper;
import org.junit.Assert;
import org.junit.Test;

public class JsonParserHelperTest {

    @Test
    public void readEmptyJsonTest() {
        String emptyJson = "{}";

        League league = JsonParserHelper.readValue(emptyJson, League.class);

        Assert.assertNotNull(league);
    }

    @Test(expected = RuntimeException.class)
    public void readEmptyValueTest() {
        String emptyJson = "";

        League league = JsonParserHelper.readValue(emptyJson, League.class);

        Assert.assertNotNull(league);
    }

    @Test(expected = RuntimeException.class)
    public void readNullValueTest() {
        String emptyJson = null;

        League league = JsonParserHelper.readValue(emptyJson, League.class);

        Assert.assertNotNull(league);
    }
}
