package com.example.rest.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;

@Entity
@Table(name= "TBL_DAY_SHEET")
public class DaySheet extends AbstractModel {

    @Id
    @GeneratedValue
    private int id;

    @Column(name="date")
    private Date date;

    @JsonManagedReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "account")
    private Account account;

    @Column(name = "amount")
    private double amount;

    @Column(name = "type")
    private boolean type;

    public DaySheet() {
    }

    public DaySheet(int id, Date date, Account account, double amount, boolean type) {
        this.id = id;
        this.date = date;
        this.account = account;
        this.amount = amount;
        this.type = type;
    }

    public DaySheet(String createdBy, Calendar createdOn, String updatedBy, Calendar updatedOn, boolean isActive, int id, Date date, Account account, double amount, boolean type) {
        super(createdBy, createdOn, updatedBy, updatedOn, isActive);
        this.id = id;
        this.date = date;
        this.account = account;
        this.amount = amount;
        this.type = type;
    }

    @Override
    public String toString() {
        return "DaySheet{" +
                "id=" + id +
                ", date=" + date +
                ", account=" + account +
                ", amount=" + amount +
                ", type=" + type +
                "} " + super.toString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean isType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }
}
