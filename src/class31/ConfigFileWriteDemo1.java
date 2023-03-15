package com.class31;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileWriteDemo1 {
    public static void main(String[] args) throws IOException {

        String path = "Files/test.properties";
        FileOutputStream fileOutputStream = new FileOutputStream(path);

        Properties properties = new Properties();
        properties.setProperty("Name", "Anees");
        properties.store(fileOutputStream, "A new name has been added");



    }
}
