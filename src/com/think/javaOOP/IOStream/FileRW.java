package com.think.javaOOP.IOStream;

import java.io.*;

public class FileRW {
    public static void main(String[] args) throws IOException {
        // We can use OutputStreamWriter to write a file stand alone without using FileOutputStream
        /*Writer writer = new OutputStreamWriter(new FileOutputStream("think.txt"));
        String sr = "ThinkPad X1 Carbon 16th Gen";
        writer.write(sr);
        writer.flush();*/
        // byte[] b = sr.getBytes(StandardCharsets.UTF_8);
        // fos.write(b);
        // fos.close();

        // To work with a text file, we can use FileWriter directly
        /*String ss = "ThinkPad X1 Carbon 17th Gen";
        FileWriter fw = new FileWriter("think0.txt");
        fw.write(ss);
        fw.close();*/

        File file = new File("think.txt");
        FileReader fr = new FileReader(file);
        // Read the file character by character when the file is not too big
        /*int i;
        while ((i = fr.read()) != -1) {
            // Without casting, it will print out the ASCII code (Binary)
            System.out.print((char) i);
        }*/

        // Read the text file using char array when the file is too big
        char[] ch = new char[(int) file.length()];
        fr.read(ch);
        for (char c : ch) {
            System.out.print(c);
        }
        fr.close();

    }
}
