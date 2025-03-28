package aisco.donation.credit;

import aisco.donation.core.DonationComponent;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class DonationImpl extends DonationComponent {
    String transactionId;
    String creditNumber;
    String creditExpired;
    String cvc;
    String creditHolder;
    String paymentStatus;
    List <Object> donationList;

    public DonationImpl() {
        System.out.println("Donation via Credit");
        this.donationList = new ArrayList<>();
    }

    public DonationImpl(String name, String email, String phone, int amount, String paymentMethod,
            String transactionId, String creditNumber, String creditExpired, String cvc, String creditHolder, String paymentStatus) {
        super(name, email, phone, amount, paymentMethod);
        this.transactionId = transactionId;
        this.creditNumber = creditNumber;
        this.creditExpired = creditExpired;
        this.cvc = cvc;
        this.creditHolder = creditHolder;
        this.paymentStatus = paymentStatus;
        this.donationList = new ArrayList<>();    }
    
    public void getDonation(){
        System.out.println(Arrays.asList(donationList));
    }

    public void addDonation() {
    	this.donationList.add(new DonationImpl("Anisa", "anisa@jmail.com", "+62878 6654 3321", 2500000, "Credit", "1", "123456", "04/28", "123", "Anisa Ruth", "Success"));
    	this.donationList.add(new DonationImpl("Aldo", "aldo@jmail.com", "+62878 6600 3321", 2000000, "Credit", "2", "654321", "05/27", "456", "Aldo Sananta", "Success"));
    }
    
    public String toString() {
        return "Donasi " + name + ": Amount: " + amount + ", transaction ID: " + transactionId + ", payment method: " + paymentMethod
                + ", credit number: " + creditNumber + ", Payment Status: " + paymentStatus + "\n";
    }

}