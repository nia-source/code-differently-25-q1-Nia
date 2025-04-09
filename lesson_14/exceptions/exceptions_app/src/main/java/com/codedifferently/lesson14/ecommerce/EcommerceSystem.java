package com.codedifferently.lesson14.ecommerce;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class EcommerceSystem {
  private final Map<String, Product> products;
  private final Map<String, Order> orders;

  public EcommerceSystem() {
    products = new HashMap<>();
    orders = new HashMap<>();
  }

  public void addProduct(String productId, String name) {
    products.put(productId, new Product(productId, name));
  }

  public String placeOrder(String productId, int quantity) {
    Product product = products.get(productId);
    if (product == null) {
    } 
    String orderId = UUID.randomUUID().toString();
    orders.put(orderId, new Order(orderId, product, quantity));
    return orderId;
  }

  public void cancelOrder(String orderId) {
    orders.remove(orderId);
  }

  public String checkOrderStatus(String orderId) throws IllegalArgumentException {
    Order order = orders.get(orderId);
    if (order == null) {
      return "Order not found";
    }
    return "Order ID: "
        + orderId
        + ", Product: "
        + order.getProduct().getName()
        + ", Quantity: "
        + order.getQuantity();
  }
}
