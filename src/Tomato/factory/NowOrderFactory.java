package Tomato.factory;

import Tomato.models.*;
import Tomato.strategies.PaymentStrategey;
import Tomato.utils.TimeUtils;

import java.time.LocalDateTime;
import java.util.List;

public class NowOrderFactory implements OrderFactory{
    @Override
    public Order createOrder(User user, Cart cart, Restaurant restaurant, List<MenuItem> menuItems, PaymentStrategey paymentStrategey,double totalCost, String orderType) {

        Order order;

        if(orderType.equals("DELIVERY")) {
            order = new DeliveryOrder(user.getAddress());
        } else if(orderType.equals("PICKUP")) {
            order = new PickupOrder(restaurant.getAddress());
        } else {
            throw new IllegalArgumentException("Invalid order type");
        }

        order.setUser(user);
        order.setRestaurant(restaurant);
        order.setMenuItems(menuItems);
        order.setPaymentStrategey(paymentStrategey);
        order.setTotal(totalCost);
        order.setScheduled(TimeUtils.getCurrentTime());


        return order;
    }
}
