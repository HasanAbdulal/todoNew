package com.think.javaOOP.IOStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferRW {
    public static void main(String[] args) throws IOException {
        // This method will overwrite the file, which means the file will be empty after running this method.
        // By adding true as the second parameter, the file will not be overwritten.
        BufferedWriter bw = new BufferedWriter(new FileWriter("think.txt", true));
        bw.newLine();
        bw.write("login");
        bw.newLine();
        bw.write("Tech");
        bw.flush();
        bw.close();

        // This method will read the file line by line.
        BufferedReader br = new BufferedReader(new java.io.FileReader("think.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }
}
