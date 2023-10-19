package com.think.javaOOP.IOStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWr {
    public static void main(String[] args) throws IOException {
        /*PrintWriter pw = new PrintWriter("think.txt");
        pw.println("Hello World!");
        pw.println(212);
        pw.println('R');
        pw.println(1.2);
        pw.println(true);
        pw.flush();
        pw.close();*/
        FileWriter fw = new FileWriter("think.txt");
        PrintWriter pw = new PrintWriter(fw, true);
        // With the print method of PrintWriter, you can print any type of data, but you can't print a new line, and you can't flush the buffer.
        // print method to print data with the flush method
        // println method to print data without the flush method
        pw.println("Hello Thinner!");
        pw.println(97); // Will print the value as it is
        pw.write(97); // Will print the character corresponding to the ASCII value
        pw.println('X');
        pw.println(4.2);
        pw.print(true);
//        pw.flush();
//        pw.close();
    }
}
