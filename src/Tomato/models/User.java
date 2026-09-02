package Tomato.models;

public class User {

    static long idCounter=1;
    private Long userId;
    private String name;
    private String address;
    private Cart cart;

    public User(Long userId, String name, String address, Cart cart) {
        this.userId = ++idCounter;
        this.name = name;
        this.address = address;
        this.cart = cart;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}
