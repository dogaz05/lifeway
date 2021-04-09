package org.academiadecodigo.pet_it.lifeway.lifewayApp.model;


import org.springframework.stereotype.Component;

/*@Entity
@Table(name = "customer")*/
@Component
public class Customer {


    /*@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;*/
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String city;
    private String country;
    private int kilometers;
    private int intersections;

    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }
    
     public int getKilometers() {
        return kilometers;
    }


    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }
    
     public int getIntersections() {
        return intersections;
    }


    public void setIntersections(int intersections) {
        this.intersections = intersections;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

/* @Version
    private Integer version;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }*/


   /* public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }*/


}
