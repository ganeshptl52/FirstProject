import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

class City{
	int cityId;
	static int cityIdgenerator=1;
	String city;
	Cab cabs[] = new Cab[100];
	int noOfCabs;
	
	City(String city)
	{
		this.city=city;
		this.cityId=cityIdgenerator++;
		noOfCabs=0;
	}
	
	void addCab() {
		cabs[noOfCabs++] = new Cab(cityId);
		cabs[noOfCabs-1].printCabInfo();
	} 
	
	void removeCab(int cabId) {
		for(int i=0;i<noOfCabs ;i++)
		{
			if (cabs[i].carID == cabId)
			{
				if (i == noOfCabs-1) {
					cabs[i]=null;
					noOfCabs--;
				}
				else {
					cabs[i]=cabs[noOfCabs-1];
					cabs[noOfCabs-1]=null;
					noOfCabs--;
				}
			}			
		}
	}
	
	void selectCab(int destCityID)
	{
		long [][] DecisionArray = new long[noOfCabs][3];
		for(int i=0;i<noOfCabs ;i++)
		{
			DecisionArray[i][0]=cabs[i].carID;
			DecisionArray[i][1]=cabs[i].duration();
			DecisionArray[i][2]=i;
		}
		Arrays.sort(DecisionArray, new Comparator<long[]>() {
			public int compare(final long[] entry1, final long[] entry2) {
            	if (entry1[1] < entry2[1])
            		return 1;
            	else
            		return -1;
			}
		});
		int i;
        for (i = 0; i < noOfCabs; i++) {
        	System.out.println(DecisionArray[i][0]+" "+DecisionArray[i][1]+" "+DecisionArray[i][2]);
        }		
		long max = DecisionArray[0][1];

        for (i = 0; i < noOfCabs; i++) {
           if (DecisionArray[i][1]<max)break;
        }
        if (i==1)
        {
        	cabs[(int) DecisionArray[0][2]].changeStatustoTrip(destCityID);
        	System.out.println("========CAB DETAILS====================");
        	cabs[(int) DecisionArray[i][2]].printCabInfo();
        	removeCab((int) DecisionArray[0][0]);
        }
        else
        {
        	Random r = new Random();
        	i=r.nextInt(i);
        	cabs[(int) DecisionArray[i][2]].changeStatustoTrip(destCityID);
        	cabs[(int) DecisionArray[i][2]].printCabInfo();
        	removeCab((int) DecisionArray[i][0]);        	
        }
	}
	
	void printCity()
	{
		System.out.println("=======================================================================");
		System.out.println("City ID:"+cityId+" : "+city);
		System.out.println("No of cabs in City : "+noOfCabs);
		System.out.println("Cab details:");
		for(int i=0;i<noOfCabs ;i++) {
			System.out.println("Cab Id:"+cabs[i].carID);
			System.out.println("Cab status "+ (cabs[i].cabOnTrip ? "ON TRIP" : "IDLE" )+" From "+cabs[i].duration() );
		}
		System.out.println("=======================================================================");
	}

}