package edu.icet.model.entity;

import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderEntity {
    @Id
    private String orderId;
    private LocalDate orderDate;
    private String customerId;
}
