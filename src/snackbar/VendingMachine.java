package snackbar; 

public class VendingMachine {
    
    //fields
    private int id;
    private int vendId = 0;  
    private String name; 

    public VendingMachine(String name) {

        vendId++; 
        id = vendId; 
        this.name = name; 
    }

    //METHODS
    //SETTERS 

    public void setName(String name) {
        this.name = name; 
    }

    //GETTERS 


    public int getId() {
        return id; 
    }

    public String getName() {
        return name; 
    }
}