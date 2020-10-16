package fpl.sdk.utils;

public class UrlBuilder {

    private String baseUrl;

    private String relativePath;

    public UrlBuilder baseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
        return this;
    }

    public UrlBuilder relativePath(String relativePath) {
        this.relativePath = relativePath;
        return this;
    }

    public String build() {
        return baseUrl + relativePath;
    }
}
