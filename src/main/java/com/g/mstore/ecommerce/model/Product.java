package com.g.mstore.ecommerce.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Optional;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;


    private String description;

    private String price;

    private String image;

    private String category;


}
