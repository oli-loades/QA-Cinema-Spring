import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import  org.springframework.web.bind.annotation.RestController;
import  org.springframework.web.bind.annotation.RequestBody;
import  org.springframework.web.bind.annotation.ResponseStatus;




import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderContoller {

       @Autowired
       OrderReposoinity orderReposoinity;

       @GetMapping
       @ResponseStatus(HttpStatus.OK)
       public List<Order> getOrder()
       {
           return  orderReposoinity.findAll();
       }

       @PostMapping
       @ResponseStatus(HttpStatus.CREATED)
       public void addOrder(@RequestBody Order orderToAdd)
       {
             orderReposoinity.save(orderToAdd);
       }

//       @PutMapping("{id}")
//       @ResponseStatus(HttpStatus.CREATED)
//       public void updateOrder(@PathVariable  )
//       { orderReposoinity.
//       }




}
