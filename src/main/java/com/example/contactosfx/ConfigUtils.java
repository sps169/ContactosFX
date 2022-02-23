package com.example.contactosfx;

import java.io.*;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

public class ConfigUtils {

    public static Properties getProperties() {
        Properties prop = new Properties();
        try (InputStream input = new FileInputStream("src/main/resources/application.properties")) {
            prop.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return prop;
    }


    public static void setProperties(Properties prop) {
        try {
            OutputStream output = new FileOutputStream("src/main/resources/application.properties");
            prop.store(output, null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ResourceBundle getResourceBundle() {
        Locale spanish = new Locale("es", "ES");
        Locale english = new Locale("en", "US");
        Object lang = getProperties().get("lang");
        if (lang.equals("es_ES")) {
            return ResourceBundle.getBundle("strings/strings", spanish);
        }else {
            return ResourceBundle.getBundle("strings/strings", english);
        }
    }
}
