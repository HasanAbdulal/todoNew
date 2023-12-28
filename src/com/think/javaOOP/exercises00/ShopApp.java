package com.think.javaOOP.exercises00;

import io.helidon.webserver.Routing;
import io.helidon.webserver.ServerConfiguration;
import io.helidon.webserver.WebServer;

import java.net.InetAddress;
import java.net.UnknownHostException;

import java.util.Arrays;


public class ShopApp {
    public static void main(String[] args) {
        //double total = 0.0;
        //double tax = 0.21;
        //int measurement = 8;
        int count = 0;
        int average = 0;

        // 5. Modify instantiation of the Customer object inside the main method of the ShopApp class to use "Pinky" as customer name and 3 as the measurement value.
        Customer customer = new Customer("Pinky", 12);
        //2. Remove invocation of the setName method for the customer object in the main method of the ShopApp class.
        // customer.setSize("medium");
        System.out.println("Min Price: " + Clothing.MIN_PRICE);

        // 3. Modify initialization of all Clothing objects in the main method of the ShopApp class to use this newly added constructor instead of set methods.
        Clothing item1 = new Clothing("Blue Jacket", 20.9, "medium");
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "small");
        Clothing[] items = {item1, item2, new Clothing("Yellow", 40.9, "medium"), new Clothing("Black T-Shirt", 10.5,
            "medium")};

        // 5. In the main method of the ShopApp class pass an array of Clothing items to the addItems method of the 
        // Customer object.
        customer.addItems(items);

        // customer.setSize(measurement);
        System.out.println("Customer is a " + customer.getName() + ", " + customer.getSize() + ", " + customer.getTotalClothingCost() + "€");
        // 6. Remove logic that calculates total from the for-each loop in the main method of the ShopApp class. Retain functionality that and prints all clothing object details.
        // 7. Replace printing of the total variable with an invocation of the getTotalClothingCost method upon the customer object.
        for (Clothing item : customer.getItems()) {
            System.out.println("Item: " + item);
        }

        // 1. Add an algorithm calculating an average price for all Clothing items owned by a given Customer.
        for (Clothing item : customer.getItems()) {
            // 3. Modify average calculation, so it only calculates the average price of items for which size is "L". This should produce an ArithmeticException, because there are no such items in the array.
            if (item.getSize().equals("large")) {
                count++;
                average += item.getPrice();
            }
        }

        // 2. In the main method of the ShopApp class, add an invocation of the method sort of the Arrays class to perform sorting of the Clothing items array before processing it in a for-each loop.
        Arrays.sort(customer.getItems());
        // 4. Create a try-catch construct to intercept this exception and print the error message.
        // 5. Consider how you can change the algorithm to avoid this exception.
        try {
            average = (count == 0) ? 0 : average / count;
            average = (int) average / count;
            // 2. Print the calculated average value.
            System.out.println("Average price is: " + average + ", Count " + count);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }
        for (Clothing item : customer.getItems()) {
            System.out.println("Item: " + item);
        }

        try {
            ItemList list = new ItemList(items);
            Routing routing = Routing.builder().get("/items", list).build();
            ServerConfiguration config = ServerConfiguration.builder().bindAddress(InetAddress.getLocalHost()).port(8080).build();
            WebServer ws = WebServer.create(config, routing);
            ws.start();
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        }
    }
}
