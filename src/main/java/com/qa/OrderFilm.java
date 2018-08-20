package com.qa;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.sql.Connection;
import java.sql.DriverManager;


@Entity
@JsonIgnoreProperties({"hibernatateLazztIntializer", "handler"})
public class OrderFilm {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     private Long id;

    @Column
     private int  accountId;
    @Column
     private String OrderNumber;

     @JsonIgnore
     private  Seet seet;
     
     @OneToOne(mappedBy = "Order", targetEntity = Seet.class)
     private int seatNumber;
     @OneToOne(mappedBy = "Order", targetEntity = Screen.class)
     private int screenNumber;

     public void isSeatAvaible(){


          Connection connection = datasource.getConection();
          sqlSelectStatment
         String selectStatement = "Select *  from seets where seatAvaaible = true";

         if (seet.isSeatAvaible()){



         else{

         }
     }



    public Seet getSeet() {
        return seet;
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
