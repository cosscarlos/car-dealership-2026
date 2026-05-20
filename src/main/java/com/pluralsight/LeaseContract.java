package com.pluralsight;

public abstract class LeaseContract extends Contract{

    private double expectedEndingValue;
    private double leaseFee = 1.07;
    private double monthlyPayment;

    public LeaseContract(String date, String customerName, String customerEmail, Vehicle sold, double expectedEndingValue, double leaseFee, double monthlyPayment) {
        super(date, customerName, customerEmail, sold);
        this.monthlyPayment = monthlyPayment;
    }
}
