package edu.icet.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "orderdetail")
public class OrderDetailEntity {
    @Id
    @Column(nullable = false)
    private int id;

    @ManyToOne
    @JoinColumn(name = "itemcode", referencedColumnName = "code")
    private ItemEntity itemEntity;

    @Column(nullable = false)
    private int quantity;
}
