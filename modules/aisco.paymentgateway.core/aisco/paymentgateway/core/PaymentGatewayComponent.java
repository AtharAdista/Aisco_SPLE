package aisco.paymentgateway.core;
import java.util.UUID;
import java.time.LocalDateTime;
import java.util.List;

public abstract class PaymentGatewayComponent implements PaymentGateway {

    protected String transactionId;
    protected float amount;
    protected String paymentStatus;
    protected LocalDateTime timeout;
    
    public PaymentGatewayComponent()
    {

    }
    public PaymentGatewayComponent(float amount, String paymentStatus) {
        this.transactionId = generateTransactionId();
        this.timeout = LocalDateTime.now().plusMinutes(10);
        this.amount = amount;
        this.paymentStatus = paymentStatus;
    }
    public abstract void paymentProcess();
 
    public String generateTransactionId()
    {
    	return UUID.randomUUID().toString();
    }

}
