package net.thaitech.main.facade;

import net.thaitech.main.management.*;
import net.thaitech.main.*;;

public class ECommerceFacade {
    private ProductManagementSystem productSystem;
    private CustomerManagementSystem customerSystem;
    private OrderManagementSystem orderSystem;

    public ECommerceFacade() {
        this.productSystem = new ProductManagementSystem();
        this.customerSystem = new CustomerManagementSystem();
        this.orderSystem = new OrderManagementSystem();
    }

    public void addProduct(Product product) {
        productSystem.addProduct(product);
    }

    public void addCustomer(Customer customer) {
        customerSystem.addCustomer(customer);
    }

    public void createOrder(Order order) {
        orderSystem.createOrder(order);
    }
}
