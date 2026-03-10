package com.bredy.deliverySystem.model;

public class User {
    private String name;
    private String email;
    private String phone;

    public User(String name, String email, String phone) {
        this.setName(name);
        this.setEmail(email);
        this.setPhone(phone);
    }

    public void showUserInfo() {
        System.out.println("Name: " + name);
        System.out.println(" Email: " + email);
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
