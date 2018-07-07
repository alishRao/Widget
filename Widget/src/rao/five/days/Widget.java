/*
 * Alisha Rao
 * Pd 5
 * PSET 1-1
 * Widget
 */
package rao.five.days;

public class Widget { 
    
    private double productionCost; 
    private int inventoryQty; 
    private double wholesalePrice; 
    private double suggestedRetail; 
    private String widgetName; 
    private String widgetDescription; 
     
    public Widget() { 
        productionCost = 0; 
        inventoryQty = 0; 
        wholesalePrice = 0; 
        suggestedRetail = 0; 
        widgetName = "No Name Set"; 
        widgetDescription = "No Description Set"; 
         
    } 
     
    public Widget(double prCost, int invQty, double wholePrice, double sugRetail, String name, String desc) { 
        productionCost = prCost; 
        inventoryQty = invQty; 
        wholesalePrice = wholePrice; 
        suggestedRetail = sugRetail; 
        widgetName = name; 
        widgetDescription = desc; 
    } 
     
    public Widget(String name, String desc) { 
        productionCost = 0; 
        inventoryQty = 0; 
        wholesalePrice = 0; 
        suggestedRetail = 0; 
        widgetName = name; 
        widgetDescription = desc; 
    } 
     
     
    //Getters and Setters 
     
    //Read Write 
  
    public int getInventoryQty() { 
        return inventoryQty; 
    } 
  
    public void setInventoryQty(int inventoryQty) { 
        this.inventoryQty = inventoryQty; 
    } 
  
    public double getSuggestedRetail() { 
        return suggestedRetail; 
    } 
  
    public void setSuggestedRetail(double suggestedRetail) { 
        this.suggestedRetail = suggestedRetail; 
    } 
  
    public String getWidgetName() { 
        return widgetName; 
    } 
  
    public void setWidgetName(String widgetName) { 
        this.widgetName = widgetName; 
    } 
  
    public String getWidgetDescription() { 
        return widgetDescription; 
    } 
  
    public void setWidgetDescription(String widgetDescription) { 
        this.widgetDescription = widgetDescription; 
    } 
     
     
    //Read Only!!! 
  
    public double getProductionCost() { 
        return productionCost; 
    } 
  
    public double getWholesalePrice() { 
        return wholesalePrice; 
    } 
  
  
    //Method ToString() 
    @Override 
    public String toString() { 
         
        return  "\n\n\n************************************Widget Part Report **************************\n" + 
                "*********************************************************************************\n" + 
                "\nWidget Name: " + widgetName                        + "\n" + 
                "Description: " + widgetDescription                    + "\n" + 
                "_______________________________________________"            + "\n" + 
                "\nWidget Cost of Goods Sold: " + productionCost            + "\n" + 
                "Widget WholeSale Revenue: " + wholesalePrice            + "\n" + 
                "Widget Suggested Retail : " + suggestedRetail            + "\n\n" + 
                "_______________________________________________"            + "\n" + 
                "\nQuantity in Warehouse: " + inventoryQty                + "\n" +             
                "_______________________________________________"            + "\n\n\n"; 
                 
         
    } 
     
  
} 