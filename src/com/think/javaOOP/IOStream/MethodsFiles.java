package com.think.javaOOP.IOStream;

import java.io.File;

public class MethodsFiles {
    public static void main(String[] args) {
        File file = new File("C:/Users/hasan/Downloads/undefined - Imgur.png");
        // Tests whether the file or directory denoted by this abstract pathname exists.
        System.out.println("Is file exists: " + file.exists()); // boolean
        // Returns the name of the file or directory denoted by this abstract pathname.
        System.out.println("File name: " + file.getName()); // String
        //  Returns the absolute pathname string of this abstract pathname.	
        System.out.println("Get absolute path: " + file.getAbsolutePath());
        // Returns the length of the file denoted by this abstract pathname.
        System.out.println("Get file size: " + file.length()); // long
        // Tests whether the application can execute the file denoted by this abstract pathname.
        System.out.println("Can execute: " + file.canExecute()); // boolean
        // Tests whether the application can read the file denoted by this abstract pathname.
        System.out.println("Can read: " + file.canRead()); // boolean
        // Tests whether the application can modify the file denoted by this abstract pathname.
        System.out.println("Can write: " + file.canWrite()); // boolean
        // Tests whether the file denoted by this abstract pathname is a directory.
        System.out.println("Is this a folder: " + file.isDirectory()); // boolean
        // Tests whether the file denoted by this abstract pathname is a normal file.
        System.out.println("Is this a normal file: " + file.isFile()); // boolean
        // Tests whether the file named by this abstract pathname is a hidden file.
        System.out.println("Is hidden: " + file.isHidden()); // boolean
        // Returns the time that the file denoted by this abstract pathname was last modified.
        System.out.println("Last modified: " + file.lastModified()); // long
        // Deletes the file or directory denoted by this abstract pathname.
        System.out.println("Deletes the file: " + file.delete()); // boolean
    }
}
