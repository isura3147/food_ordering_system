package edu.icet.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "customer")
public class CustomerEntity {
    @Id
    @Column(length = 6, nullable = false)
    private int id;

    @Column(length = 5, nullable = false)
    private String title;

    @Column(length = 30, nullable = false)
    private String name;

    @Column(length = 12)
    private String phoneNumber;
}
