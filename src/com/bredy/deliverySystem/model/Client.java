package com.bredy.deliverySystem.model;

public class Client {
    private String name;
    private String phone;

    public void showClientInfo () {
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
