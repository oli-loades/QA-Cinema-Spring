package com.qa;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@JsonIgnoreProperties({"hibernateLazyIntializer","handler"})
public class OrderTicket {
	

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ticketId;
    
    private int numberoftickets;
    
    @ManyToOne
    @JoinColumn(name="orderId")
    private OrderFilm orderticket;


}
