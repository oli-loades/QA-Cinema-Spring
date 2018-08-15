
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;


@Entity
@JsonIgnoreProperties({"hibernateLazyIntailizer","handler"})
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long orderId;
    //@JoinColumn(name="id")
    //OneToMany(Map)
    private int accountId;
    private String orderNumber;

    @JsonIgnoreProperties({"hibernateLazyIntailizer","handler"})

    public Order(Integer orderId, int accountId, String orderNumber) {
        this.orderId = orderId;
        this.accountId = accountId;
        this.orderNumber = orderNumber;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }
}



