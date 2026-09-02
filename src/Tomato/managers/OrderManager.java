package Tomato.managers;

import Tomato.models.Order;

import java.util.List;

public class OrderManager {

    private List<Order> orders;
    private static OrderManager instance;

    private OrderManager(){
        // Initialize the orders list
        orders = new java.util.ArrayList<>();
    }

    public static synchronized OrderManager getInstance(){
        if(instance==null) {
            instance = new OrderManager();
        }
        return instance;
    }

    public void addOrder(Order order){
        orders.add(order);
    }

    public void listOrders(){
        System.out.println("Orders:");
        for(Order order: orders){
            System.out.println(order.getType()+"order for"+order.getUser().getName()+"|| Total: "+order.getTotal()+"|| At :"+order.getScheduled());
        }
    }
}
