package com.think.javaOOP.constructor;

public class Main {
    public static void main(String[] args) {
        // This will call the overloaded constructor
        // It chose the overloaded constructor because it has the parameters
        Product product = new Product("Product", "This is a product description", 45.99f, 56, 43.23f, "Black");
        product.setName("ThinkPad X1");
        
//        product.display();
        // This will call the default constructor
        /*Product product2 = new Product();
        product2.display();*/

        /* When there is no constructor declared, the default value is used. In Java and C++
        // the default value for a string is null, for a float is 0.0f, for an int is 0, for a boolean is false and so on.
        // The default constructor created by the compiler if there is no constructor declared
        */
        /*Product product3 = new Product();
        product3.display();*/

        //Product product4 = new Product("Product", "This is a product description", 45.99f, 56, 43.23f, "Red");
        // Will print the first constructor with 5 parameters called who is called by the second constructor with 6 parameters

        // Copy constructor
        // It takes all the values from the object passed as parameter and copy them to the new object
        Product product5 = new Product(product);
        product5.display();
    }
}
