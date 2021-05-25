package example;

public class SportBike extends Bike{
	
	String clutchState = ""; // status kopling
	
	private int gearStatus;
	
	public SportBike() {
		this.gearStatus = 4; //default gear untuk bike
	}
	
	public SportBike(int clutch) {
		this.gearStatus = clutch;
	}
	
	public void clutchUpdate(int b ) { //  b adalah kopling
		if(b == 1) { //1 itu pushed
			clutchState = "Clutch is Pushed";
			System.out.println("Clutch is Updated");
			System.out.println("-- automatic exit --");
			
		}else if(b == 2) { //2 itu not pushed
			clutchState = "Clutch is not Pushed";
			System.out.println("Clutch is Updated");
			System.out.println("-- automatic exit --");
		}
	}
}
