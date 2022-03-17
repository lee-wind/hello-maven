package com.wind;

import org.junit.Test;

import java.io.*;
import java.util.Arrays;

public class Index {

    @Test
    public void hello() {
        System.out.println("Hello Maven");
    }

    @Test
    public void printProperties() throws IOException {
        InputStream is = getClass().getResourceAsStream("/application.properties");
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));

        String text;
        try {
            while ((text = reader.readLine()) != null) {
                System.out.println(text);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
