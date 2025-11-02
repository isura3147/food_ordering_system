package edu.icet.model.dto;


import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderDetail {
    private int id;
    private int itemCode;
    private int quantity;
}
