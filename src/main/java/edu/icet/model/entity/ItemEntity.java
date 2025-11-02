package edu.icet.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "item")
public class ItemEntity {

    @Id
    @Column(length = 6, nullable = false)
    private String code;

    @Column(length = 100, nullable = false)
    private String description;

    @Column(length = 10, nullable = false)
    private String packSize;

    @Column(precision = 6)
    private Double unitPrice;

    @Column(length = 5, nullable = false)
    private int qtyOnHand;
}
