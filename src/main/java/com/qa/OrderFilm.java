package com.qa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
@JsonIgnoreProperties({"hibernatateLazztIntializer", "handler"})
public class OrderFilm {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     private Long id;
     private int  accountId;
     private String OrderNumber;
     private int  seatNumber;
     private  int screenNumber;

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public int getScreenNuber() {
        return screenNuber;
    }

    public void setScreenNuber(int screenNuber) {
        this.screenNuber = screenNuber;
    }

    private int  screenNuber;


    public OrderFilm (){


    }
    public OrderFilm(int accountId, String orderNumber) {
        super();
        this.accountId = accountId;
        OrderNumber = orderNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getOrderNumber() {
        return OrderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        OrderNumber = orderNumber;
    }
    
}
