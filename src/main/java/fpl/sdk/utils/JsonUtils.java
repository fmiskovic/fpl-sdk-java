package fpl.sdk.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;


/**
 * Use static methods from this class to parse json.
 */
public class JsonUtils {

    private static final ObjectMapper PARSER = initParser();

    private JsonUtils() {
        // static usage only
    }

    public static <T> T fromJson(String json, Class<T> clazz) throws JsonProcessingException {
        return PARSER.readValue(json, clazz);
    }

    public static String toJson(Object pojo) throws JsonProcessingException {
        return PARSER.writeValueAsString(pojo);
    }

    private static ObjectMapper initParser(){
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        return mapper;
    }
}
