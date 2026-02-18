package com.bredy.deliverySystem.model;

public class Order {
    private Client client;
    private Restaurant restaurant;
    private double valorTotal;

    public Order(Client client, Restaurant restaurant, double valorTotal) {
        this.client = client;
        this.restaurant = restaurant;
        this.valorTotal = valorTotal;


    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
