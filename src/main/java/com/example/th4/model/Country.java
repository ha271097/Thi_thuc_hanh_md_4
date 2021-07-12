package com.example.th4.model;

import lombok.Data;

import javax.persistence.*;
@Entity
@Table
@Data
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}
