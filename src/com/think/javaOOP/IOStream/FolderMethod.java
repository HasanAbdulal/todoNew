package com.think.javaOOP.IOStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FolderMethod {
    public static void main(String[] args) throws IOException {
        File newFolder = new File("C:/Users/hasan/Downloads/Thread");
        // Create a new folder
//        newFolder.mkdir();
        File newFile = new File(newFolder, "newFile.txt");
//        newFile.createNewFile();
        FileOutputStream fos = new FileOutputStream(newFile);
        String st = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus.";
        byte[] b = st.getBytes();
        fos.write(b);
        fos.flush();
        fos.close();
        FileInputStream fis = new FileInputStream(newFile);
        int input;
        while ((input = fis.read()) != -1) {
            System.out.print((char) input);
        }
        fis.close();

        // Rename the folder
//        newFolder.renameTo(new File("C:/Users/hasan/Downloads/Thread"));
        // Delete the folder, but it will not delete if the folder is not empty
//        newFolder.delete();
        // Create multiple folders at once
        File newFolder1 = new File("C:/Users/hasan/Downloads/Java0", "Java1");
//        newFolder1.mkdirs();
        String[] files = newFolder1.list();
        // Check if the folder is a directory
        if (newFolder1.isDirectory()) {
            // Loop through the files in the folder to print out the file names
            for (String file : files) {
                System.out.println(file);
            }
        }
    }
}
