package com.bredy.deliverySystem.model;

public class Client extends User {
    public Client(String name, String email, String phone) {
        super(name, email, phone);
    }

    @Override
    public String toString() {
        return "Client name: " + getName() + "\nClient's email: " + getEmail() + "\nClient's phone: " + getPhone();
    }

}