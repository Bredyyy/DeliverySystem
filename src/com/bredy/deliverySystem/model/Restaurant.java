package com.bredy.deliverySystem.model;

public class Restaurant {
    private String name;
    private String address;
    private String category;

    public Restaurant(String name, String address, String category) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Restaurant name cannot be empty");
        }
        this.name = name;
        this.address = address;
        this.category = category;
    }

    public void showRestaurantInfo() {
        System.out.println("Restaurant: " + name);
        System.out.println("Category: " + category);
        System.out.println("Address: " + address);
    }

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
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Restaurant name cannot be empty");
        }
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
