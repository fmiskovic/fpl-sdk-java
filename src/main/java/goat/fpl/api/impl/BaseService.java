package goat.fpl.api.impl;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.logging.Logger;

public class BaseService {

    private final static Logger LOGGER = Logger.getLogger(BaseService.class.getName());

    protected byte[] httpGetDataAsBytes(String url) throws Exception {
	URL obj = new URL(url);
	HttpURLConnection conn = (HttpURLConnection) obj.openConnection();
	conn.setRequestMethod("GET");

	LOGGER.info(String.format("Sending 'GET' request to URL : %s", url));
	int responseCode = conn.getResponseCode();
	LOGGER.info(String.format("Response Code : %s", responseCode));

	try (InputStream inputStream = conn.getInputStream();
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream()) {
	    int read = inputStream.read();
	    while (read != -1) {
		byteArrayOutputStream.write(read);
		read = inputStream.read();
	    }
	    return byteArrayOutputStream.toByteArray();
	} catch (IOException e) {
	    throw new RuntimeException(e.getMessage(), e);
	}
    }

    protected String httpGetDataAsString(String url) throws Exception {
	URL obj = new URL(url);
	HttpURLConnection conn = (HttpURLConnection) obj.openConnection();
	conn.setRequestMethod("GET");

	LOGGER.info(String.format("Sending 'GET' request to URL : %s", url));
	int responseCode = conn.getResponseCode();
	LOGGER.info(String.format("Response Code : %s", responseCode));

	try (InputStream inputStream = conn.getInputStream();
		BufferedReader in = new BufferedReader(new InputStreamReader(inputStream))) {
	    StringBuilder response = new StringBuilder();

	    String inputLine;
	    while ((inputLine = in.readLine()) != null) {
		response.append(inputLine);
	    }
	    in.close();

	    return response.toString();
	} catch (Exception e) {
	    throw new RuntimeException(e.getMessage(), e);
	}
    }
}
