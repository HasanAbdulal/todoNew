package com.think.javaOOP.exceptionHandling1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // readFile("C:\\Users\\hasan\\Desktop\\lenovo.txt");
        try {
            readFile("C:\\Users\\hasan\\Desktop\\lenovo.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Exception while reading the file");
        }
    }

    static void readFile(String filePath) throws FileNotFoundException, IOException {
        FileInputStream fileInputStream = new FileInputStream(filePath);
        System.out.println("File content:");
        int i = 0;
        while ((i = fileInputStream.read()) != -1) {
            System.out.print((char) i);
        }

    }

    /* static void readFile(String filePath) {

        try (FileInputStream fileInputStream = new FileInputStream(filePath)) {
            System.out.println("File content:");
            int i = 0;
            while ((i = fileInputStream.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Exception while reading the file");
        } finally {
            if(fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    System.out.println("Exception while closing the file");
                }
            }
        }
    }*/
}
