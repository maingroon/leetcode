package com.maingroon.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesLoader {
    private PropertiesLoader() {}

    public static Properties loadProperties(String fileName) throws IOException {
        Properties properties = new Properties();
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName);
        properties.load(inputStream);
        return properties;
    }
}
