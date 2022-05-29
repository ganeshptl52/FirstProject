import java.util.Scanner;

class CabManagement{
	
	public static void main(String args[]) throws InterruptedException
	{
		Scanner inputStream = new Scanner(System.in);
		City [] cities = new City[100];
		int input,cityId,carID,i,j,k,cityIdFrom,cityIdTo;
		int noOfCities=0;
		String cityName;
		j=0;
		cities[noOfCities++]= new City("Mumbai");
		cities[noOfCities++]= new City("Pune");
		cities[noOfCities++]= new City("Thane");
		cities[noOfCities++]= new City("Borivali");
		cities[0].addCab();

		cities[0].addCab();
		
		cities[0].addCab();
		cities[0].addCab();
		Thread.sleep(1000);
		cities[0].addCab();
		
		cities[0].printCity();
		cities[0].selectCab(2);
		
/*        while(false) {
        	print();
        	input = Integer.parseInt(inputStream.nextLine());
        	if (input == 4) break;
            switch(input){
            case 1: System.out.println("=================================================");
                    System.out.println("Please Enter City Name to Register");
                    cityName = inputStream.nextLine();
                    cities[noOfCities++]= new City(cityName);
                    System.out.println("City "+ cityName +" Successfully Registered");
                    System.out.println("=================================================");
                    break;
                    
            case 2: if (noOfCities <= 0)
                    {
            	       System.out.println("Please register City First");   
                    }
            	    System.out.println("=================================================");
            		System.out.println("Please select City to Register Cab");
            		for (i=0;i<noOfCities;i++)
            		{
            			System.out.println(cities[i].cityId+" : "+cities[i].city); 
            		}
            		System.out.print("Please select City ");
            		cityId = Integer.parseInt(inputStream.nextLine());
            		for (i=0;i<noOfCities;i++)
            		{
            			if (cities[i].cityId == cityId)
            			{
            			    cities[i].addCab();
            			    break;
            			}
            		}
            		if (i >= noOfCities ) {
            			System.out.println("Please enter valid City");
            		}
            		break;
            		
            case 3: System.out.println("=================================================");
            		System.out.println("Please Enter City Name to From you want to book cab");
            		for (i=0;i<noOfCities;i++)
            		{
            			System.out.println(cities[i].cityId+" : "+cities[i].city); 
            		}
            		cityIdFrom = Integer.parseInt(inputStream.nextLine());
            		for (i=0;i<noOfCities;i++)
            		{
            			if (cities[i].cityId == cityIdFrom)
            			{
            				System.out.println("Please Enter City where you want to go");
                    		for (j=0;j<noOfCities;j++)
                    		{
                    			if (cities[j].cityId != cityIdFrom)
                    			System.out.println(cities[j].cityId+" : "+cities[j].city); 
            			    }
                    		cityIdTo = Integer.parseInt(inputStream.nextLine());
                    		for (j=0;j<noOfCities;j++)
                    		{
                    			if (cities[j].cityId == cityIdTo && cities[j].cityId != cityIdFrom) {
                    				cities[i].selectCab(cities[j].cityId);
                    				break;
                    			}
            			    }
            		     }
            		}
            		if (i >= noOfCities ) {
            			System.out.println("Please enter valid City");
            			break;
            		}
            		if (j >= noOfCities ) {
            			System.out.println("Please enter valid to City");
            			break;
            		} 
                    break;
            default:System.out.println("Please enter valid input");
                    break;
            
            }
        }
    
        inputStream.close();
        for (i=0;i<noOfCities;i++)
		{
		    cities[i].printCity();
		}	
		*/	
	}
	
	static void print() 
	{
		System.out.println("==================================");
		System.out.println("1.Register City");
		System.out.println("2.Register Cab");
		System.out.println("3.Find Cab");
		System.out.println("4.Exit");
		System.out.println("==================================");
	}
}