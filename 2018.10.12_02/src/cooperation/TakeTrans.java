package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		
		Student sJames = new Student("James", 5000);
		Student sTomas = new Student("Tomas", 10000);
		Student sEdward = new Student("Edward", 17000);
		
		Bus bus100 = new Bus(100);
		sJames.takeBus(bus100);
		sJames.showInfo();
		bus100.showInfo();
		
		Subway subwayGreen = new Subway("2È£¼±");
		sTomas.takeSubway(subwayGreen);
		sTomas.showInfo();
		subwayGreen.showInfo();
		
		Taxi taxiSeng = new Taxi("¼Ä¼Ä");
		sEdward.takeTaxi(taxiSeng);
		sEdward.showInfo();
		taxiSeng.showInfo(); 
		
		
	}

}
