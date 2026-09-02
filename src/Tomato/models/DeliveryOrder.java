package Tomato.models;

import Tomato.strategies.PaymentStrategey;
import java.util.Vector;

public class DeliveryOrder extends Order {
    
    private String deliveryAddress;
    private String deliveryTime;
    private double deliveryFee;
    private String status;



    public DeliveryOrder( String deliveryAddress) {


        this.deliveryAddress = deliveryAddress;

    }

    @Override
    public String getType(){
        return "DELIVERY";
    }

    // Getters and Setters
    public String getDeliveryAddress(){
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress){
        this.deliveryAddress = deliveryAddress;
    }

   

    public double getDeliveryFee(){
        return deliveryFee;
    }

    public void setDeliveryFee(double deliveryFee){
        this.deliveryFee = deliveryFee;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }

    @Override
    public String toString(){
        return "DeliveryOrder{" +
                "orderId=" + getOrderId() +
                ", type=" + getType() +
                ", total=" + getTotal() +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                
                ", deliveryFee=" + deliveryFee +
                ", status='" + status + '\'' +
                '}';
    }
}


