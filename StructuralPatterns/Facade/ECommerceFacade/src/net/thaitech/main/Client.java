package net.thaitech.main;

import net.thaitech.main.facade.*;

public class Client {
    public static void main(String[] args) {
        ECommerceFacade facade = new ECommerceFacade();

        Product product = new Product("123", "Smartphone", 999.99);
        facade.addProduct(product);

        Customer customer = new Customer("John Doe", "john@example.com");
        facade.addCustomer(customer);

        Order order = new Order("ORD123", customer, product);
        facade.createOrder(order);
    }
}