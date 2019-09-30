package snackbar; 

public class Customer {

    //FIELDS
    private int customerId; 
    private int maxId = 0;
    private String customerName; 
    private double cashOnHand;
    
    public Customer(String customerName, double cashOnHand) {
        
        maxId++; 
        this.customerId = maxId; 
        this.customerName = customerName; 
        this.cashOnHand = cashOnHand; 
    }

    // SETTERS
    public void setCustomerName(String customerName) {
        
        this.customerName = customerName; 
    }

    public void setCashOnHand(double cashOnHand) {

        this.cashOnHand = cashOnHand; 
    }

    //GETTERS
    public int getCustomerId() {
       
        return customerId; 
    }

    public String getCustomerName() {

        return customerName; 
    }

    public double getCashOnHand() {

        return cashOnHand; 
    }

    //ADDITIONAL METHODS
    public double addCash(double cash) {
         
        return this.cashOnHand + cash; 
    }

    public void buyFood(double price) {
        if(cashOnHand >= price) {
            System.out.println("you have " + (cashOnHand - price) +" remaining.");
        } else {
            System.out.println("You cannot afford this snack...");
        }
    }
}