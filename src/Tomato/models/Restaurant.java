package Tomato.models;

import java.util.List;

public class Restaurant {

    static long idCounter = 1;
    private Long id;
    private String name;
    private String address;
    private List<MenuItem> menu;

    public Restaurant(Long id, String name, String address, List<MenuItem> menu) {
        this.id = idCounter++;
        this.name = name;
        this.address = address;
        this.menu = menu;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public List<MenuItem> getMenu() {
        return menu;
    }

    public void setMenu(List<MenuItem> menu) {
        this.menu = menu;
    }
    @Override
    public String toString() {
        return "Restaurant{id=" + id + ", name='" + name + "', address='" + address + "', menu=" + menu + "}";
    }

}
