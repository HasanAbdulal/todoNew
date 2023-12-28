package com.think.javaOOP.exercises00;

/*
* 1. Encapsulate all variables for all variables in both the Customer and the Clothing class, providing accessor methods (getters and setters).
2. Add two constants to the Clothing class to represent the minimum price and tax rate set then to be 10 and 0.2 respectively.
3. Add logic to the setPrice method that ensures price is never smaller than the minimum value. To test this, make sure that at least one item price is set to a value less than 10 in the main method of the ShopApp class.
4. Add logic to the getPrice method to automatically add tax.
5. You can now remove the line of code that adds tax to price when calculating total value in the for-each loop within the main method of the ShopApp class.
* */
public class Clothing implements Comparable<Clothing> {
    private String description;
    private double price;
    private String size = "medium";
    // 1. Modify MIN_PRICE and TAX_RATE constants in the Clothing class to be associated with a class, rather than 
    // instance of Clothing.
    //private final double MIN_PRICE = 10.0;
    public final static double MIN_PRICE = 10.0;
    // private final double TAX_RATE = 0.2;
    public final static double TAX_RATE = .2;

    // 1. Add constructor to a Clothing class to initialize description and price fields.
    // 2. Add extra parameter to the Clothing class constructor to accept value for the size field and initialize 
    // this field.
    public Clothing(String description, double price, String aSize) {
        this.description = description;
        this.price = price;
        size = aSize;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price + (price * TAX_RATE);
    }

    public void setPrice(double price) {
        this.price = Math.max(price, MIN_PRICE);
//        this.price = (price > MIN_PRICE) ? price : MIN_PRICE;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    // 1.Implement Comparable Interface in the Clothing class. Your algorithm should sort Clothing objects by their descriptions. Lookup the Java documentation to find out how the Comparable algorithm should be implemented.
    @Override
    public int compareTo(Clothing c) {
        return this.description.compareTo(c.description);
    }

    @Override
    public String toString() {
        return getDescription() + ", " + getPrice() + ", " + getSize();
    }
}
