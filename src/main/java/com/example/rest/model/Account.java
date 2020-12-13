package com.example.rest.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Set;

@Entity
@Table(name="TBL_ACCOUNT")
public class Account extends AbstractModel {

    public Account(Integer id, String firstName, String lastName, String contactNumber, Address address, Set<DaySheet> daySheetSet) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactNumber = contactNumber;
        this.address = address;
        this.daySheetSet = daySheetSet;
    }

    public Account(String createdBy, Calendar createdOn, String updatedBy, Calendar updatedOn, boolean isActive, Integer id, String firstName, String lastName, String contactNumber, Address address, Set<DaySheet> daySheetSet) {
        super(createdBy, createdOn, updatedBy, updatedOn, isActive);
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactNumber = contactNumber;
        this.address = address;
        this.daySheetSet = daySheetSet;
    }

    public Account() {
    }

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="contact_number")
    private String contactNumber;

    @JsonManagedReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "address")
    private Address address;

    @JsonBackReference
    @OneToMany(mappedBy="account")
    private Set<DaySheet> daySheetSet;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Set<DaySheet> getDaySheetSet() {
        return daySheetSet;
    }

    public void setDaySheetSet(Set<DaySheet> daySheetSet) {
        this.daySheetSet = daySheetSet;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", address=" + address +
                ", daySheetSet=" + daySheetSet +
                "} " + super.toString();
    }
}
