package com.bredy.deliverySystem.service;

import com.bredy.deliverySystem.service.Deliverable;

public class DeliveryBicycle implements Deliverable {
    private String riderName;

    public DeliveryBicycle(String riderName) {
        this.riderName = riderName;
    }

    @Override
    public void carryDelivery() {
        System.out.println("Bicycle name: " + riderName);
    }
}