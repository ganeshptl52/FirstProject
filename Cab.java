import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;  
enum CabState{
	ON_TRIP,
	IDLE
}
class Cab
{
	int carID;
	boolean cabOnTrip;
	int cityID,destCityID;
	LocalDateTime fromDate;
	private static int carIdgenerator=1;
	String owner;
	String carCompany;
	String carModel;
	Cab(int cityID)
	{
	    this.carID = carIdgenerator++;
	    this.cityID = cityID;
	    destCityID = -1;
	    this.cabOnTrip = false;
	    fromDate = LocalDateTime.now();
	}
	Cab(int cityID,String owner,String carCompany,String carModel)
	{
		this(cityID);
		this.owner = owner;
		this.carCompany = carCompany;
		this.carModel =carModel;		
	}
	long duration()
	{
		return (ChronoUnit.SECONDS.between(fromDate,LocalDateTime.now()));
	}
	void changeStatustoIdle() {
		this.cityID= destCityID;
		cabOnTrip = false;
		fromDate = LocalDateTime.now();
	}
	void changeStatustoTrip(int destCityID) {
		this.cityID= -1;
		this.destCityID = destCityID;
		cabOnTrip = true;
		fromDate = LocalDateTime.now();
	}	
	void printCabInfo()
	{
		System.out.println("=======================================================================");
		System.out.println("Car Id :"+carID);
		System.out.println("City :"+cityID);
		System.out.println("Car is "+cabOnTrip+" for "+ ChronoUnit.SECONDS.between(fromDate,LocalDateTime.now()));
		System.out.println("=======================================================================");
	}
}