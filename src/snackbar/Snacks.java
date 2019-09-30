package snackbar; 

public class Snacks {
    // fields- things that a class knows, attributes
    // value of all fields together -> state of the object

    private static int maxId = 0 ; 
    private int id; 
    private String name; 
    private int quantity = 5; 
    private double cost; 
    private static int venId; 
    private static int theVenId = 0; 

    //constructor- used to set the initial state of the object
    public Snacks(String name, double cost, int quantity) {
        maxId++; 
        theVenId++; 

        id = maxId; 
        this.name = name; 
        this.cost = cost; 
        this.quantity = quantity; 
        venId = theVenId; 
    }
    //methods or behaviors - getters and setters 
   
    //SETTERS
    public void setName(String name) {
        
        this.name = name; 
    }

    public void setCost(double cost) {
        
        this.cost = cost; 
    }

    public void setQuantity(int quantity) {

        this.quantity = quantity; 
    }





    //GETTERS
    public int getId() {
        
        return id; 
    }

    public int getVenId() {
        
        return venId;
    }

    public String getName() {
        
        return name; 
    }

    public double getCost() {
        
        return cost; 
    }

    public int getQuantity() {
        
        return quantity; 
    }




    //methods 
    public int addQuantity(int newItems) {
        return this.quantity + newItems; 
    }

    public void buySnack(int quantity) {
        System.out.println("you bought: " + quantity + " " + name);
    }

    public void totalCost(int quantity) {
        System.out.println("your total is, " + (this.quantity * this.cost));
    }
}