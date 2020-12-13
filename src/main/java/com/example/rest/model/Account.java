package com.example.rest.model;


import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

import javax.persistence.*;
import java.io.Serializable;

@NamedQueries({
        @NamedQuery(name = "findAllAccounts", query = "from Account a")
})

@Entity
@Table(name="TBL_ACCOUNT")
public class Account {

    public Account() {
    }

    public Account(Integer id, String preferred_name, String firstName, String lastName, String contactNumber) {
        this.id = id;
        this.preferred_name = preferred_name;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactNumber = contactNumber;
    }

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name="preferred_name")
    private String preferred_name;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="contact_number")
    private String contactNumber;


    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", preferred_name='" + preferred_name + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                '}';
    }
}
