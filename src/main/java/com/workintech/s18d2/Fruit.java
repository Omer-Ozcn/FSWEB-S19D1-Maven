package com.workintech.s18d2;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "fruit", schema = "fsweb")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Fruit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Double price;

    @Enumerated(EnumType.STRING)
    @Column(name = "fruit_type", nullable = false)
    private FruitType fruitType;
}
