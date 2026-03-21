package com.gla.ExceptionHandaling;

import java.io.*;
public class ReadFileExample {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("data.txt");
            BufferedReader br = new BufferedReader(file);

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        }
        catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
