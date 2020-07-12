package Com.CleanCodeAndSerialization;

import java.util.Scanner;

public class InterestCalculator extends HouseConstruction{
		 void Interest(){
		 Scanner sc = new Scanner(System.in);
		 System.out.format("%s","Enter si for Simple Interest or ci for Compound Interest or hc for "
		 		+ "House Construction: ");
		 
		 String choice = sc.nextLine();
		 
		 if (choice.equalsIgnoreCase("hc")) {
	    	 HouseConstruction hc = new HouseConstruction();
	    	 hc.constructionCost();
	     }
		 else {
		 System.out.format("%s","Enter principle amount:");
		 float principle = sc.nextFloat();
		 System.out.format("%s","Enter time period of interest:");
		 float timePeriod = sc.nextFloat();
		 System.out.format("%s","Enter rate of interest for 1 year:");
		 int rateOfInterest = sc.nextInt();
		 sc.close();
		 float amount=0;
		 float compoundInterest = 0;
		 float simpleInterest = 0;
		     if (choice.equalsIgnoreCase("si")) {
		    	 simpleInterest = (principle*timePeriod*rateOfInterest)/100;
		    	 System.out.format("%g",simpleInterest);
		     }
		     else if (choice.equalsIgnoreCase("ci")) {
				while(timePeriod>=1) {
					compoundInterest+=((principle+amount)*rateOfInterest/100);
					amount = compoundInterest;
					timePeriod-=1;
				}
				if (timePeriod>0 && timePeriod<1) {
					compoundInterest += ((principle+amount)*rateOfInterest/100)*(timePeriod);
					
				}
				System.out.format("%g",compoundInterest);
			 }
		 }
		
	}
	}
