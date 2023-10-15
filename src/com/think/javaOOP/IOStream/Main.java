package com.think.javaOOP.IOStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        File file = new File("C:/Users/hasan/Downloads/undefined - Imgur.png");
        FileInputStream fis = new FileInputStream(file);
        // To have all the bytes of the image file and store it in a byte array
        byte[] b = new byte[(int) file.length()];

        fis.read(b);
        for (byte value : b) {
            System.out.print((byte) value);
        }

        FileOutputStream fos = new FileOutputStream("C:/Users/hasan/Downloads/undefined - Imgur1.png");
        fos.write(b);
        fos.flush();
        fos.close();

        fis.close();
    }
}
