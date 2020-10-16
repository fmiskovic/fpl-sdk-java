package fpl.sdk.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import fpl.sdk.model.League;
import org.junit.Assert;
import org.junit.Test;

public class JsonUtilsTest {

    @Test
    public void readEmptyJsonTest() throws JsonProcessingException {
        String emptyJson = "{}";
        League league = JsonUtils.fromJson(emptyJson, League.class);
        Assert.assertNotNull(league);
    }

    @Test(expected = MismatchedInputException.class)
    public void readEmptyValueTest() throws JsonProcessingException {
        String emptyJson = "";
        League league = JsonUtils.fromJson(emptyJson, League.class);
        Assert.assertNotNull(league);
    }

    @Test(expected = RuntimeException.class)
    public void readNullValueTest() throws JsonProcessingException {
        League league = JsonUtils.fromJson(null, League.class);
        Assert.assertNotNull(league);
    }
}
