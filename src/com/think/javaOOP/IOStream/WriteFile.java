package com.think.javaOOP.IOStream;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class WriteFile {
    public static void main(String[] args) throws Exception, FileNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream("lorem.txt");
        String st = "السلام HTETETETeLorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. " +
            "Suspendisse";
        byte[] b = st.getBytes(StandardCharsets.UTF_8);
        fos.write(b, 0, b.length);
        fos.close();
        fos.flush();

        FileInputStream fis = new FileInputStream("lorem.txt");
        // Create a loop to read the file
        while (fis.available() > 0) {
            System.out.print((char) fis.read());
        }
        /*
         * When to use flush Java?
         * When you write data to a stream, it is not written immediately, and it is buffered.
         * So use flush() when you need to be sure that all your data from buffer is written.
         * We need to be sure that all the writing is completed before we close the stream,
         * and that is why flush() is called in file/buffered writer's close()
         * */
        fis.close();
    }
}
