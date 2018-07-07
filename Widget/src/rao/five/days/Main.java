/*
 * Alisha Rao
 * Pd 5
 * PSET 1-1
 * main
 */
package rao.five.days;

public class Main { 
	  
    /** 
     * @param args 
     */ 
    public static void main(String[] args) { 
    	
         
    	  Widget[] widgetListing = new Widget[5]; 
         
    	widgetListing[0] = new Widget(13.00, 30, 16.00, 25.99, "Iron Man", "Founding member of Avengers");
      	widgetListing[1] = new Widget(12.00, 50, 17.00, 21.99, "Wonder Woman", "princess of the Amazons");
      	widgetListing[2] = new Widget(15.00, 35, 15.00, 29.99, "Batman", "drives in his batmobile and saves Gotham city");
      	widgetListing[3] = new Widget(11.00, 23, 28.00, 26.99, "Hulk", "super strong, green creature");
      	widgetListing[4] = new Widget(16.00, 37, 22.00, 29.99, "Superman", "Flying superhero from krypton");
      	
    	Inventory superheroes = new Inventory(widgetListing, "Superhero Inventory", "different types of superhero action figures"); 
    	String newString = superheroes.toString();
    	System.out.println(newString);
    	
        double COGS = superheroes.calculateCOGS();
        System.out.println("The total production cost is $" + COGS);
        
        double expRev = superheroes.calculateExpRevenue();
        System.out.println("The total expected revenue is $" + expRev);
         
        double expProf = expRev - COGS;
        System.out.println("The expected profit is $" + expProf);
         
        superheroes.printInventory(); 
        
         
         
    } 
  
}