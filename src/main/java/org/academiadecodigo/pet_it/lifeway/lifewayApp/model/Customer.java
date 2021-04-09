package org.academiadecodigo.pet_it.lifeway.lifewayApp.model;


import org.springframework.stereotype.Component;

import javax.persistence.*;

/*@Entity
@Table(name = "customer")*/
@Component
public class Customer {


    /*@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;*/
    private String name;
    private Integer age;

   /* @Version
    private Integer version;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

   /* public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }*/


}
