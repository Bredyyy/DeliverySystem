package com.bredy.deliverySystem.model;

public class Order {
    private static long counter = 0;
    private final long id;

    private Client client;
    private Restaurant restaurant;
    private double valorTotal;

    public Order(Client client, Restaurant restaurant, double valorTotal) {
        if (client == null) {
            throw new IllegalArgumentException("Order must have a valid Client");
        }
        if (restaurant == null) {
            throw new IllegalArgumentException("Order must have a valid Restaurant");
        }
        if (valorTotal < 0) {
            throw new IllegalArgumentException("Total order value cannot be negative");
        }
        this.id = ++counter;
        this.client = client;
        this.restaurant = restaurant;
        this.valorTotal = valorTotal;
    }

    public long getId() {
        return id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        if (client == null) {
            throw new IllegalArgumentException("Oder must have a valid Client");
        }
        this.client = client;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        if (restaurant == null) {
            throw new IllegalArgumentException("Oder must have a valid Restaurant");
        }
        this.restaurant = restaurant;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        if (valorTotal < 0) {
            throw new IllegalArgumentException("Total oder value cannot be negative");
        }
        this.valorTotal = valorTotal;
    }
}
