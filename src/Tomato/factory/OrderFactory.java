package Tomato.factory;

import Tomato.models.*;
import Tomato.strategies.PaymentStrategey;

import java.util.List;

public interface OrderFactory {
    public Order createOrder(User user, Cart cart, Restaurant restaurant, List<MenuItem>menuItems, PaymentStrategey paymentStrategey,double totalCost, String orderType);
}
