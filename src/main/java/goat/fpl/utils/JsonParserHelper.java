package goat.fpl.utils;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;


/**
 * Use static methods from this class to parse json.
 *
 * @Auhor fmiskovic
 */
public class JsonParserHelper {

    private static final ObjectMapper OBJECT_MAPPER = initializeDeserializers();

    private JsonParserHelper() {

    }

    public static <T> T readValue(byte[] jsonAsBytes, Class<T> expectedType) {
        try {
            return OBJECT_MAPPER.readValue(jsonAsBytes, expectedType);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public static <T> T readValue(JsonNode jsonNode, Class<T> expectedType) {
        try {
            return OBJECT_MAPPER.readValue(jsonNode.traverse(), expectedType);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public static <T> T readValue(String jsonString, Class<T> expectedType) {
        try {
            return OBJECT_MAPPER.readValue(jsonString, expectedType);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    private static ObjectMapper initializeDeserializers() {
        ObjectMapper objectMapper = new ObjectMapper();

        objectMapper.configure(JsonParser.Feature.ALLOW_COMMENTS, true);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        SimpleModule module = new SimpleModule();
        objectMapper.registerModule(module);

        return objectMapper;
    }
}
