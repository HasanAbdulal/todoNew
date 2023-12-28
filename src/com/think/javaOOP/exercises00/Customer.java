package com.think.javaOOP.exercises00;

public class Customer {
    private String name;
    private String size;

    // 1. Add a private instance variable called items to the Customer class to store an array of Clothing objects.
    private Clothing[] items;

    // 1. Add constructor to a Customer class to initialize name field
    // 3. Add second parameter to the Customer constructor to accept int measurement value.
    // 4. Invoke method setSize from Customer constructor passing measurement as an argument.
    public Customer(String name, int measurement) {
        this.name = name;
        setSize(measurement);
    }

    // 2. Provide a public method called addItems in the Customer class that accepts Clothing array as an argument 
    // assigns it to the items instance variable.
    public void addItems(Clothing[] someItems) {
        items = someItems;
    }

    // 3. Provide a public method in the Customer class that returns an array of Clothing items.
    public Clothing[] getItems() {
        return items;
    }

    /*
    * 4. Provide a public method called get TotalClothingCost in the Customer class that calculates and returns total cost for all clothing items of this customer.
    * Hints:
        An algorithm that calculates total of all clothing items is already present in the main method of the ShopApp class.
        Consider moving it into the method within the Customer class.
        * */
    public double getTotalClothingCost() {
        double total = 0.0;
        for (Clothing item : items) {
            total = total + item.getPrice();
        }
        return total;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    /*
    * 1. Add a new method to the Customer class called setSize. It should be similar to the existing setSize method, except it should accept int measurement parameter instead of String.
    2. Move a switch statement from the main method of the ShopApp class into this new method in the Customer class.
    3. Change the all setSize method calls within this switch to simple size variable assignment.
    4. In the main method of the ShopApp class invoke this version of the setSize method
    passing the value of 3 as an argument.
    * */
    public void setSize(int measurement) {
        switch (measurement) {
            case 1:
            case 2:
            case 3:
                setSize("small");
                break;
            case 4:
            case 5:
            case 6:
                setSize("medium");
                break;
            case 7:
            case 8:
            case 9:
                setSize("large");
                break;
            default:
                setSize("X-large");
                break;
        }
    }

}
