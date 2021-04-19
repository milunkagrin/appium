package ru.otus.qa.appium.logic.utils;


import java.net.MalformedURLException;
import java.net.URL;

public class GetURL {
    public static URL getUrl() {
        try {
            return new URL("http://localhost:4723/wd/hub/");
        } catch (MalformedURLException e) {
            throw new RuntimeException("Can't connect! \n" + e);
        }
    }
}
