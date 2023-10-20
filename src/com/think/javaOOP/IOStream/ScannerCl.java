package com.think.javaOOP.IOStream;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ScannerCl {
    public static void main(String[] args) throws IOException {
        File file = new File("think.txt");
        Scanner sc = new Scanner(file);
        /*
        Scanner sc = new Scanner("AW@,EEW,Fvde");
        sc.useDelimiter(Pattern.compile(",")); // Use it to read the file by comma
        */

        //sc.useDelimiter("\\z"); // Use it to read the whole file without a loop
        // sc.useDelimiter("\\D+"); // Use it to read only numbers
        while (sc.hasNextLine()) {
            parseLine(sc.nextLine());
        }
    }

    private static void parseLine(String str) {
        String name, phone, email;
        Scanner sca = new Scanner(str);
        sca.useDelimiter(",");
        while (sca.hasNext()) {
            name = sca.next();
            phone = sca.next();
            email = sca.next();
            System.out.println("Name: " + name + " --Phone: " + phone + " --Email: " + email);
        }
        sca.close();
    }
}
