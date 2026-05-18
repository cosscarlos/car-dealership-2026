package com.pluralsight;

public class SalesContract extends Contract {

    private double salesTaxAmount = 1.05;
    private int recordingFee = 100;
    private int processingFee;
    private boolean finance;
    private double monthlyPayment;


    public SalesContract(String date, String customerName, String customerEmail, boolean sold, double totalPrice, double monthlyPayment, double salesTaxAmount, int recordingFee, int processingFee, boolean finance, double monthlyPayment1) {
        super(date, customerName, customerEmail, sold, totalPrice, monthlyPayment);
        this.salesTaxAmount = salesTaxAmount;
        this.recordingFee = recordingFee;
        this.processingFee = processingFee;
        this.finance = finance;
        this.monthlyPayment = monthlyPayment1;
    }
}
