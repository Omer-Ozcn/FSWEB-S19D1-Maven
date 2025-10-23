package com.workintech.s18d2.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "vegetable", schema = "fsweb")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Vegetable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Double price;

    @Column(name = "is_grown_on_tree", nullable = false)
    private boolean isGrownOnTree;
}
