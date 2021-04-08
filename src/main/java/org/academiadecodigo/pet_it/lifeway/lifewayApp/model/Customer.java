package org.academiadecodigo.pet_it.lifeway.lifewayApp.model;


import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer age;

    @Version
    private Integer version;
}
