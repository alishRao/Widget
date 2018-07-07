/*
 * Alisha Rao
 * Pd 5
 * PSET 1-1
 * Inventory
 */

package rao.five.days;

public class Inventory { 
	  
    private Widget inventory[] = new Widget[5]; 
    private String inventoryName; 
    private String inventoryDescription; 
     
     
    //Default Constructor 
    public Inventory() { 
        for (Widget element : inventory) { 
            element = new Widget(); 
        } 
        inventoryName = "No Inventory Name Assigned."; 
        inventoryDescription = "No Inventory Description Assigned"; 
    } 
     
    //Full Constructor 
    public Inventory(Widget[] inven, String name, String desc) { 
    	inventory = inven;
    	inventoryName = name;
    	inventoryDescription = desc;
    	
    } 
     
     
    //Partial Constructor 
    public Inventory(String name, String desc) { 
        for (Widget element : inventory) { 
            element = new Widget(); 
        } 
        inventoryName = name; 
        inventoryDescription = desc; 
    } 
  
     
    //Getters and Setters 
    public Widget[] getInventory() { 
        return inventory;
    } 
  
    public void setInventory(Widget[] inventory) { 
        this.inventory = inventory;
    } 
  
    public String getInventoryName() { 
        return inventoryName; 
    } 
  
    public void setInventoryName(String inventoryName) { 
        this.inventoryName = inventoryName; 
    } 
  
    public String getInventoryDescription() { 
        return inventoryDescription; 
    } 
  
    public void setInventoryDescription(String inventoryDescription) { 
        this.inventoryDescription = inventoryDescription; 
    } 
     
    //Class Methods 
     
    @Override 
    public String toString() { 
    	//creates string
    	String s = "Inventory type is " + inventoryName + ". \n" + "Inventory description: " + inventoryDescription + "\n";
    	
    	//loops through widget
    	for (Widget element:inventory) {
    		//gets values for the string
    		s += element.getWidgetName() + "\n";
    	}
    	//returns string
    	return s;
    } 
     
    public double calculateCOGS() { 
    	double COGS = 0;
    	//loops through widget
    	for (Widget element:inventory) {
    		//adds wholesale price and production cost
    		COGS += element.getProductionCost() * element.getWholesalePrice();
    	}
    	//return value
    	return COGS;
    } 
     
     
    public double calculateExpRevenue() { 
    	//create variable revenue
    	double revenue = 0;
    	//loops through widget
    	for (Widget element:inventory) {
    		//add inventory val and prod cost for each thing
    		revenue += element.getInventoryQty() * element.getWholesalePrice();
    	}
    	//return value 
    	return revenue;
    } 
     
    public void printInventory() { 
        //loop through widget
    	for (Widget element:inventory) {
    		//prints report for each element
    		System.out.println(element);
    	}

    } 
     
   
} 
 
 