package com.qa.persistence.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="orderticket")
public class OrderTicket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private Long id;

    @Column
    @JsonIgnore
    private long order_id;

    @JoinColumn(name = "ticket")
    @ManyToOne
    private Ticket ticket;


     @OneToMany(mappedBy = "time", cascade = CascadeType.ALL,orphanRemoval = true,fetch = FetchType.EAGER)
     @JsonIgnore
     private List<movieTime> times;


    @Column
    private int quantity;

    public OrderTicket(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(long order_id) {
        this.order_id = order_id;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
