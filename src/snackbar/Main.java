package snackbar; 

public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer("Jane", 45.25); 
        Customer c2 = new Customer("Bob", 33.14); 

        VendingMachine v1 = new VendingMachine("Food"); 
        VendingMachine v2 = new VendingMachine("Drink");
        VendingMachine v3 = new VendingMachine("Office");

        Snacks s1 = new Snacks("Chips", 1.75, 36); 
        Snacks s2 = new Snacks("Chocolate Bar", 1.00, 36); 
        Snacks s3 = new Snacks("Pretzels", 2.00, 30); 

        Snacks s4 = new Snacks("Soda", 2.50, 24);
        Snacks s5 = new Snacks("Water", 2.75, 20); 


        System.out.println("*** test data ***");
        System.out.println("Customer 1 buys 3 of snack 4 with total cash of: " + c1.getCashOnHand() + " Snack quantity: " + s4.getQuantity());
        System.out.println("Customer 1 buys 1 of snack 3 with total cash of: " + c1.getCashOnHand() + "Snack quantity: " + s3.getQuantity());
        System.out.println("Customer 2 buys 2 of snack 4 with total cash of: " + c2.getCashOnHand() + "Snack quantity: " + s4.getQuantity());
        System.out.println("Customer 1 found $10 and now has $" + c1.addCash(10.00));
        System.out.println("Customer 1 buys 1 of snack 2 with total cash of " + c1.getCashOnHand() + " Snack quantity: " + s2.getQuantity());
        System.out.println("There were 12 new snack 3 items found the new quantity is: " + s3.addQuantity(12));
        System.out.println("Customer 2 buys 3 of snack 3 with total cash of " + c2.getCashOnHand() + " Snack quantity: " + s3.getQuantity());
        
    }
}