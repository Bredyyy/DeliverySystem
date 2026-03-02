package com.bredy.deliverySystem.model;

public class Client {
    private String name;
    private String phone;

    public Client(String name, String phone) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Client name cannot be empty");
        }
        this.name = name;
        this.phone = phone;
    }

    public void showClientInfo () {
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Client name cannot be empty");
        }
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
