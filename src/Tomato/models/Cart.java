package Tomato.models;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private Restaurant restaurant;
    private List<MenuItem> items;

    public Cart(){
        this.items = new ArrayList<>();
        this.restaurant = null;
    }

    public Cart(Restaurant restaurant){
        this();
        this.restaurant = restaurant;
    }

    public Restaurant getRestaurant(){
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant){
        this.restaurant = restaurant;
    }

    public List<MenuItem> getItems(){
        return new ArrayList<>(items);
    }

    public void setItems(List<MenuItem> items){
        if(items == null){
            this.items = new ArrayList<>();
        } else {
            this.items = new ArrayList<>(items);
        }
    }

    /**
     * Add item to cart. Requires restaurant to be set first.
     */
    public void addItem(MenuItem item){
        if(restaurant == null){
            throw new IllegalStateException("Set restaurant before adding items");
        }
        if(item == null){
            throw new IllegalArgumentException("Item cannot be null");
        }
        items.add(item);
    }

    /**
     * Remove item from cart.
     */
    public boolean removeItem(MenuItem item){
        if(item == null) return false;
        return items.remove(item);
    }

    /**
     * Get total cost of all items in cart.
     */
    public double getTotalCost(){
        return items.stream().mapToDouble(MenuItem::getPrice).sum();
    }

    /**
     * Check if cart is empty.
     */
    public boolean isEmpty(){
        return items.isEmpty();
    }

    /**
     * Get number of items in cart.
     */
    public int getItemCount(){
        return items.size();
    }

    /**
     * Clear all items from cart.
     */
    public void clear(){
        items.clear();
    }

    @Override
    public String toString(){
        return "Cart{restaurant=" + (restaurant == null ? "null" : restaurant.getName()) + ", items=" + items.size() + ", total=" + getTotalCost() + "}";
    }

}
