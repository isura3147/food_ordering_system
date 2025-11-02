package edu.icet.controller;

import edu.icet.model.dto.OrderDetail;
import edu.icet.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orderdetails")
public class OrderDetailController {

    @Autowired
    OrderDetailService orderDetailService;

    @PostMapping("/singleItem")
    public void placeOrder(@RequestBody OrderDetail orderDetail) {
        orderDetailService.placeOrder(orderDetail);
    }

    @PostMapping("/multipleItems")
    public void placeOrder(@RequestBody List<OrderDetail> orderDetails) {
        orderDetailService.placeOrder(orderDetails);
    }
}
