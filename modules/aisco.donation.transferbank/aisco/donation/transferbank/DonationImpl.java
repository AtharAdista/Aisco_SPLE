package aisco.donation.transferbank;

import aisco.donation.core.DonationComponent;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class DonationImpl extends DonationComponent {
    String transactionId;
    String bankName;
    String bankNumber;
    String paymentStatus;
    List <Object> donationList;

    public DonationImpl() {
        System.out.println("Donation via Transfer bank");
        this.donationList = new ArrayList<>();
    }

    public DonationImpl(String name, String email, String phone, int amount, String paymentMethod,
            String transactionId, String bankName, String bankNumber, String paymentStatus) {
        super(name, email, phone, amount, paymentMethod);
        this.transactionId = transactionId;
        this.bankName = bankName;
        this.bankNumber = bankNumber;
        this.paymentStatus = paymentStatus;
        this.donationList = new ArrayList<>();    }
    
    public void getDonation(){
        System.out.println(Arrays.asList(donationList));
    }

    public void addDonation() {
    	this.donationList.add(new DonationImpl("Anisa", "anisa@jmail.com", "+62878 6654 3321", 2500000, "Transfer Bank", "1", "BCA", "123456", "Success"));
    	this.donationList.add(new DonationImpl("Aldo", "aldo@jmail.com", "+62878 6600 3321", 2000000, "Transfer Bank", "2", "BNI", "654321", "Success"));
    }
    
    public String toString() {
        return "Donasi " + name + ": Amount: " + amount + ", transaction ID: " + transactionId + ", payment method: " + paymentMethod
                + ", Bank Name: " + bankName + ", Bank Number: " + bankNumber + ", Payment Status: " + paymentStatus + "\n";
    }

}