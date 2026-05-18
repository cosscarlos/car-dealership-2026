package com.pluralsight;

public class LeaseContract extends Contract{

    private double expectedEndingValue;
    private double leaseFee = 1.07;
    private double monthlyPayment;

    public LeaseContract(String date, String customerName, String customerEmail, boolean sold, double totalPrice, double monthlyPayment, double expectedEndingValue, double leaseFee, double monthlyPayment1) {
        super(date, customerName, customerEmail, sold, totalPrice, monthlyPayment);
        this.expectedEndingValue = expectedEndingValue;
        this.leaseFee = leaseFee;
        this.monthlyPayment = monthlyPayment1;
    }


}
