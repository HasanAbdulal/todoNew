package com.think.javaOOP.constructor;

public class Product {
    private String name;
    private String description;
    private float price;
    private int quantity;
    private float discount;
    private String color;

    // Static constructor
    public Product() {
        this.name = "Product";
        this.description = "This is a product description;";
        this.price = 0.0f;
        this.quantity = 0;
        this.discount = 0.0f;
    }

    // Overloaded constructor(dynamic)
    // This constructor is used to create a product with these parameters
    public Product(String name, String description, float price, int quantity, float discount) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
        System.out.println("Constructor with 5 parameters called");
    }

    // Create a copy of constructor
    // The key word this is used to refer to the product5 object, who will store the values from the product object
    public Product(Product obj) {
        this.name = obj.name;
        this.description = obj.description;
        this.price = obj.price;
        this.quantity = obj.quantity;
        this.discount = obj.discount;
        this.color = obj.color;
        System.out.println("Copy constructor called");
    }


    // Second way to create a copy of constructor
    /*public Product(Product product) {
        this(product.name, product.description, product.price, product.quantity, product.discount, product.color);
    }*/

    // Invoke constructor inside another constructor
    public Product(String name, String description, float price, int quantity, float discount, String color) {
        this(name, description, price, quantity, discount);
        this.color = color;
        System.out.println("Constructor with 6 parameters called");
    }

    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Description: " + this.description);
        System.out.println("Price: " + this.price);
        System.out.println("Quantity: " + this.quantity);
        System.out.println("Discount: " + this.discount);
    }


    // How can update any of the fields of the object product ? By using setters and getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
