package com.bredy.deliverySystem.model;

public class DeliveryMan extends User{
    public DeliveryMan(String name, String email, String phone) {
        super(name, email, phone);
    }

    @Override
    public String toString() {
        return "Delivery man name: " + getName() + "\nDelivery man's email: " + getEmail() + "\nDelivery man's phone: " + getPhone();
    }
}
