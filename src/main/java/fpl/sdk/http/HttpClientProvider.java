package fpl.sdk.http;

import java.io.IOException;
import java.net.URI;

public interface HttpClientProvider<T> {

    T executeGET(String url, String... headers) throws IOException, InterruptedException;
}
