package com.think.javalevel1;

public class NestedLoop {
    public static void main(String[] args) {
        // Nested Loop

        for (int i = 1; i < 4; i++) { // Outer Loop
            System.out.println("Outer Loop: " + " i = " + i);
            for (int j = 1; j < 4; j++) { // Inner Loop or Nested Loop
                System.out.println("Inner Loop: " + " i = " + i + " ,j = " + j);
                for (int k = 1; k < 4; k++) {
                    System.out.println("Nested Loop: " + " i = " + i + " ,j = " + j + " ,k = " + k + "\n");
                }
            }

        }
        for (int i = 1; i < 4; i++) { // Outer Loop
            System.out.println("Outer Loop: " + " i = " + i);
            for (int j = 1; j < 4; j++) { // Inner Loop or Nested Loop
                System.out.println("Inner Loop: " + " i = " + i + " ,j = " + j);
            }
            for (int k = 1; k < 4; k++) {
                System.out.println("Nested Loop: " + " i = " + i + " ,k = " + k + "\n");
            }

        }
    }
}
