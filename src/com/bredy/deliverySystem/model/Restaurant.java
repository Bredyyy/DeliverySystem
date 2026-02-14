package com.bredy.deliverySystem.model;

public class Restaurant {
    private String name;
    private String address;
    private String category;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getCategory() {
        return category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    // TESTINGS AREA



    //

    public void showInfo() {
        System.out.println("Restaurant: " + name);
        System.out.println("Category: " + category);
        System.out.println("Address: " + address);
    }
}
