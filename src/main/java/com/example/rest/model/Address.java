package com.example.rest.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Set;

@Entity
@Table(name="TBL_ADDRESS")
public class Address extends AbstractModel {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "address_line1")
    private String addressLine1;

    @Column(name = "address_line2")
    private String addressLine2;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "country")
    private String country;

    @Column(name = "pin")
    private String pin;

    @JsonBackReference
    @OneToMany(mappedBy="address")
    private Set<Account> accountSet;

    public Address(Integer id, String addressLine1, String addressLine2, String city, String state, String country, String pin) {
        this.id = id;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pin = pin;
    }

    public Address(String createdBy, Calendar createdOn, String updatedBy, Calendar updatedOn, boolean isActive, Integer id, String addressLine1, String addressLine2, String city, String state, String country, String pin) {
        super(createdBy, createdOn, updatedBy, updatedOn, isActive);
        this.id = id;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pin = pin;
    }

    public Address() {
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", addressLine1='" + addressLine1 + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", pin='" + pin + '\'' +
                "} " + super.toString();
    }
}
