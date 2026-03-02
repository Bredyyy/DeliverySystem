package com.bredy.deliverySystem.model;

import java.util.ArrayList;
import java.util.List;

public class DeliverySystem {
    private List<Order> orders = new ArrayList<>();

    public void createOrder(Client c, Restaurant r, double valor) {
        Order pedido = new Order(c, r, valor);
        orders.add(pedido);
        System.out.println("Client " + c.getName() + " | Restaurant " + r.getName() + " | Value: R$" + valor);
    }
    public void orderList() {
        for (Order o : orders) {
            System.out.println("\n======= ORDER =======");
            System.out.println("ID: " + o.getId());
            System.out.println("Client: " + o.getClient().getName() +
                    " | Restaurant: " + o.getRestaurant().getName() +
                    " | Value: R$" + o.getValorTotal());
        }
    }
}
