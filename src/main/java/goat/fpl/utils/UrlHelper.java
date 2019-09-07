package goat.fpl.utils;

public class UrlHelper {

    public static String getURL(String path) {
        return URLS.BASE.concat(path);
    }
}
