package comchow.eureka.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/paymentprovider")
public class PaymentController {

   @GetMapping("/paynow/{price}")
   public String payNow(@PathVariable int price) {
      return "Payment with " + price + " is successful.";
   }
}
