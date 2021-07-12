package com.example.th4.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table
@Data
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull(message = "Không được để trống")
    private String name;

    private double acreage;

    private double population;

    private double GDP;

    private String introduce;

    @ManyToOne
    private Country country;

}
