package edu.icet.service;

import edu.icet.model.dto.OrderDetail;
import edu.icet.model.entity.ItemEntity;
import edu.icet.model.entity.OrderDetailEntity;
import edu.icet.repository.OrderDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderDetailService {

    @Autowired
    OrderDetailRepository orderDetailRepository;

    public void placeOrder(OrderDetail orderDetail) {

        ItemEntity itemRef = new ItemEntity();
        itemRef.setCode(orderDetail.getItemCode());

        orderDetailRepository.save(new OrderDetailEntity(
                orderDetail.getId(),
                itemRef,
                orderDetail.getQuantity()
        ));
    }

    public void placeOrder(List<OrderDetail> orderDetails) {

        ItemEntity itemRef = new ItemEntity();

        for (OrderDetail orderDetail : orderDetails) {
            itemRef.setCode(orderDetail.getItemCode());
            orderDetailRepository.save(new OrderDetailEntity(
               orderDetail.getId(),
               itemRef,
               orderDetail.getQuantity()
            ));
        }
    }
}
