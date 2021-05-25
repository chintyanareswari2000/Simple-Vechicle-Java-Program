package example;

public class MopedBike extends Bike{
	
	private int gearStatus;
	
	public MopedBike() {
		this.gearStatus = 4; //default gear untuk bike
	}
	
	public MopedBike(int state) {  
		this.gearStatus = state;
	}
	
	@Override
	public void changeGear(int a) { //a adalah RPM utk Moped dan Kopling untuk SportBike
		if( a > 3000 ) {
			gearStatus = gearStatus + 1;
			System.out.println("Gear Status: " + gearStatus);
		}else if( a < 1000 ) {
			gearStatus = gearStatus - 1;
			System.out.println("Gear Status: " + gearStatus);
		}else {
			System.out.println("Gear Status: " + gearStatus);	
		}
		System.out.println("-- automatic exit --");
	}
}
