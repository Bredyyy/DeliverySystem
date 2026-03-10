package com.bredy.deliverySystem.service;

import com.bredy.deliverySystem.service.Deliverable;

public class DeliveryMotorcycle implements Deliverable {
    private String riderName;

    public DeliveryMotorcycle(String plate) {
        this.riderName = plate;
    }

    @Override
    public void carryDelivery() {
        System.out.println("Motorcycle name: " + riderName);
    }
}