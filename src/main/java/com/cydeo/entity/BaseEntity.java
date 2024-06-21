package com.cydeo.entity;


import jakarta.persistence.*;

@MappedSuperclass //MappedSuperClass is used as a parent class for other entities
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
