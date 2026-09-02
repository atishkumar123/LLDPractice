package Tomato.managers;

import Tomato.models.Restaurant;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class RestaurantManager {

    private List<Restaurant> restaurants;
    private static RestaurantManager instance;

    private RestaurantManager(){
        // initialize internal storage
        this.restaurants = new ArrayList<>();
    }

    /**
     * Returns the singleton instance of RestaurantManager.
     */
    public static synchronized RestaurantManager getInstance(){
        if(instance == null){
            instance = new RestaurantManager();
        }
        return instance;
    }

    /**
     * Add a restaurant to the manager. Null restaurants are rejected.
     * If a restaurant with the same id already exists, it will not be added.
     */
    public boolean addRestaurant(Restaurant restaurant){
        if(restaurant == null) throw new IllegalArgumentException("restaurant cannot be null");
        Long id = restaurant.getId();
        // prevent duplicate ids
        if(id != null && getRestaurantById(id).isPresent()) return false;
        return restaurants.add(restaurant);
    }

    public boolean removeRestaurant(Restaurant restaurant){
        if(restaurant == null) return false;
        return restaurants.removeIf(r -> r.getId() != null && r.getId().equals(restaurant.getId()));
    }

    public boolean removeRestaurantById(Long id){
        if(id == null) return false;
        return restaurants.removeIf(r -> id.equals(r.getId()));
    }

    public Optional<Restaurant> getRestaurantById(Long id){
        if(id == null) return Optional.empty();
        return restaurants.stream().filter(r -> id.equals(r.getId())).findFirst();
    }

    public List<Restaurant> findRestaurantsByName(String name){
        if(name == null || name.isEmpty()) return new ArrayList<>();
        String lookup = name.toLowerCase();
        return restaurants.stream()
                .filter(r -> r.getName() != null && r.getName().toLowerCase().contains(lookup))
                .collect(Collectors.toList());
    }

    /**
     * Returns an immutable copy of the restaurants list to avoid external modification.
     */
    public List<Restaurant> getRestaurants(){
        return new ArrayList<>(restaurants);
    }

    /**
     * Clear all restaurants (useful for tests).
     */
    public void clear(){
        restaurants.clear();
    }

}
