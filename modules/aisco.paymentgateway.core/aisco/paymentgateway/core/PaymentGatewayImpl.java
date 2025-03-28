package aisco.paymentgateway.core;
import aisco.paymentgateway.core.PaymentGatewayComponent;
import java.util.List;

public class PaymentGatewayImpl extends PaymentGatewayComponent {

 
    public PaymentGatewayImpl(float amount, String paymentStatus){
      super (amount, paymentStatus);  
    }

    public void paymentProcess(){

        System.out.println("Payment success");
    }

}








