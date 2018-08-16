package com.qa;

import com.qa.OrderTicket;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
@JsonIgnoreProperties({"hibernatateLazztIntializer", "handler"})
public class OrderFilm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderid;
    
    @OneToOne
    @JoinColumn(name="id")
    @JsonIgnore
    private Account account;
    


 @OneToMany(mappedBy = "orderticket", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<OrderTicket> tickets;
    
    public OrderFilm(){

    }



	public OrderFilm(Account account) {
		super();
		this.account = account;
		tickets = new ArrayList<>();
	}



	public Long getId() {
		return orderid;
	}



	public void setId(Long id) {
		this.orderid = orderid;
	}



	public Account getAccount() {
		return account;
	}



	public void setAccount(Account account) {
		this.account = account;
	}



	public List<OrderTicket> getTickets() {
		return tickets;
	}



	public void setTickets(List<OrderTicket> tickets) {
		this.tickets = tickets;
	}
    
    

      

}
