package com.pluralsight;

public abstract class Contract {
    protected String date;
    protected String customerName;
    protected String customerEmail;
    protected Vehicle sold;
    protected double totalPrice;
    protected double monthlyPayment;

    public Contract(String date, String customerName, String customerEmail, Vehicle sold) {
        this.date = date;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.sold = sold;
    }

    //default getters and setters
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public Vehicle getSold() {
        return sold;
    }

    public void setSold(Vehicle sold) {
        this.sold = sold;
    }

//abstract methods
    public abstract double getTotalPrice();
    public abstract void getMonthlyPayment();


}
