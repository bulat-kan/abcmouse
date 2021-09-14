package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties;

    static {
        String path = "src/test/resources/Configuration.properties";
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(path);
            properties = new Properties();
            properties.load(inputStream);
            inputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key){
        return properties.getProperty(key).trim();
    }
}
