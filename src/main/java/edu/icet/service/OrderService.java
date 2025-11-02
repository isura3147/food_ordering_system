package edu.icet.service;

import edu.icet.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    public String viewOrder(String order) {
        return "order";
    }
}
