import javax.persistence.*;

@Entity
public class OrderTicket {
     @Id
     private long ticketId;
     //@ManyToOne
     //@JoinColumn(name="orderIdf")
     private Order Order;


    public long getTicketId() {
        return ticketId;
    }

    public void setTicketId(long ticketId) {
        this.ticketId = ticketId;
    }

    public Order getOrder() {
        return Order;
    }

    public void setOrder(Order order) {
        Order = order;
    }


}


