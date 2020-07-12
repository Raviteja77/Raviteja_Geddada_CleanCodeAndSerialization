package Com.CleanCodeAndSerialization;

import java.util.*;

public class HouseConstruction {
		void constructionCost() { 
		 Scanner sc1 = new Scanner(System.in);
		 System.out.format("%s","Enter material quality:");
		 String material = sc1.nextLine();
		 System.out.format("%s","Enter area of house in square feets:");
		 float areaOfHouse = sc1.nextFloat();
		 System.out.format("%s","For fullyAutomated house enter 1 else 0");
		 int fullyautomated=sc1.nextInt();
		 float constructionCost=0;
		 sc1.close();
		 if (material.equalsIgnoreCase("standard")) 
			 constructionCost = 1200 * areaOfHouse;
		     
		 else if (material.equalsIgnoreCase("above standard")) 
			 constructionCost = 1500 * areaOfHouse;
		 
		 else if (material.equalsIgnoreCase("high standard") && fullyautomated==1) 
			 constructionCost = 2500 * areaOfHouse;
		 
		 else if (material.equalsIgnoreCase("high standard")) 
			 constructionCost = 1800 * areaOfHouse;	 
		 
		 else {
			 System.out.format("%s", "Invalid Input");
			 System.exit(0);
		 }
		 System.out.format("%g",constructionCost); 
	}
	}



