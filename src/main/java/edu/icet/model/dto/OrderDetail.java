package edu.icet.model.dto;


import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderDetail {
    private int id;
    private LocalDate date;
    private double total;
    private String orderStatus;
    private String customerName;
    private List<Order> orderList;  // contains all items in the order
}
