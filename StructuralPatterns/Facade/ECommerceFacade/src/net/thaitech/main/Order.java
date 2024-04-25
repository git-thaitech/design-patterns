package net.thaitech.main;

public class Order {
    private String id;
    private Customer customer;
    private Product product;

    public Order(String id, Customer customer, Product product) {
        this.id = id;
        this.customer = customer;
        this.product = product;
    }

    public String getId() {
        return id;
    }
}
