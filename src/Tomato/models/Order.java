package Tomato.models;

import Tomato.strategies.PaymentStrategey;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Order {

    static Long orderCounter = 0L;
    Long orderId;
    Restaurant restaurant;
    User user;
    List<MenuItem> items;
    PaymentStrategey paymentStrategey;
    double total;
    String scheduled;

    public Order(){};

    public Order(Restaurant restaurant, User user, Vector<MenuItem> items, PaymentStrategey paymentStrategey, LocalDateTime scheduled) {
        this.orderId = ++orderCounter;
        this.restaurant = restaurant;
        this.user = user;
        this.items = items;
        this.paymentStrategey = paymentStrategey;
        this.scheduled = scheduled;
        this.total = calculateTotal();
    }

    private double calculateTotal() {
        return items.stream().mapToDouble(menuItem->menuItem.getPrice()).sum();
    }

    public boolean processPayment(){
        if(paymentStrategey!=null){
            paymentStrategey.pay(total);
            return true;
        }else{
            System.out.println("Payment strategy not set for order: " + orderId);
            return false;
        }
    }

    /**
     * Get the type of order. Can be overridden by subclasses.
     */
    public String getType(){
        return "STANDARD";
    }

    // Getters and Setters
    public Long getOrderId(){
        return orderId;
    }

    public void setOrderId(Long orderId){
        this.orderId = orderId;
    }

    public Restaurant getRestaurant(){
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant){
        this.restaurant = restaurant;
    }

    public User getUser(){
        return user;
    }

    public void setUser(User user){
        this.user = user;
    }

    public List<MenuItem> getMenuItems(){
        return new ArrayList<>(items);
    }

    public void setMenuItems(List<MenuItem> items){
        if(items == null){
            this.items = new Vector<>();
        } else {
            this.items = new Vector<>(items);
        }
        this.total = calculateTotal();
    }

    public PaymentStrategey getPaymentStrategey(){
        return paymentStrategey;
    }

    public void setPaymentStrategey(PaymentStrategey paymentStrategey){
        this.paymentStrategey = paymentStrategey;
    }

    public double getTotal(){
        return total;
    }

    public void setTotal(double total){
        this.total = total;
    }

    public String getScheduled(){
        return scheduled;
    }

    public void setScheduled(String scheduled){
        this.scheduled = scheduled;
    }

}
