package aisco.paymentgateway.core;

public interface PaymentGateway {
    void paymentProcess();
    void generateTransactionId();
}
