package Tomato.factory;

import Tomato.models.*;
import Tomato.strategies.PaymentStrategey;

import java.util.List;

public class ScheduledOrderFactory implements OrderFactory{
    private String scheduledTime;

    public ScheduledOrderFactory(String scheduledTime) {
        this.scheduledTime = scheduledTime;
    }
    @Override
    public Order createOrder(User user, Cart cart, Restaurant restaurant, List<MenuItem> menuItems, PaymentStrategey paymentStrategey,double totalCost, String orderType) {

        Order order;

        if(orderType.equalsIgnoreCase("Delivery")){

            order =new DeliveryOrder(user.getAddress());
        }else if(orderType.equalsIgnoreCase("Pickup")){
            order=new PickupOrder(restaurant.getAddress());

        }else{
            throw new IllegalArgumentException("Invalid order type: " + orderType);
        }

        order.setUser(user);
        order.setRestaurant(restaurant);
        order.setMenuItems(menuItems);
        order.setPaymentStrategey(paymentStrategey);
        order.setTotal(totalCost);
        order.setScheduled(scheduledTime);

        return order;







    }
}
