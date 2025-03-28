package aisco.donation.paymentqr;

import aisco.donation.core.DonationComponent;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class DonationImpl extends DonationComponent {
    String transactionId;
    String paymentStatus;
    List <Object> donationList;

    public DonationImpl() {
        System.out.println("Donation via QRIS");
        this.donationList = new ArrayList<>();
    }

    public DonationImpl(String name, String email, String phone, int amount, String paymentMethod,
            String transactionId, String paymentStatus) {
        super(name, email, phone, amount, paymentMethod);
        this.transactionId = transactionId;
        this.paymentStatus = paymentStatus;
        this.donationList = new ArrayList<>();    }
    
    public void getDonation(){
        System.out.println(Arrays.asList(donationList));
    }

    public void addDonation() {
    	this.donationList.add(new DonationImpl("Anisa", "anisa@jmail.com", "+62878 6654 3321", 2500000, "QRIS", "1", "Success"));
    	this.donationList.add(new DonationImpl("Aldo", "aldo@jmail.com", "+62878 6600 3321", 2000000, "QRIS", "2", "Success"));
    }
    
    public String toString() {
        return "Donasi " + name + ": Amount: " + amount + ", transaction ID: " + transactionId + ", payment method: " + paymentMethod
                + ", Payment Status: " + paymentStatus + "\n";
    }

}