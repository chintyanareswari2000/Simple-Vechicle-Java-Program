package example;
public class Bike extends Vehicle{

	private int gearStatus; //status gear saat ini

	public Bike () {
		this.gearStatus = 4; //default gear untuk bike
	}
	
	public Bike(int start) {
		this.gearStatus = start;
	}
	
	public void setGearState(int startState) {
		this.gearStatus = startState;
	}
	
	public int getStartState() {
		return this.gearStatus;
	}
	
	public void changeGear(int a) { //gear saat ini
		if (a == 1) { // shift up
			gearStatus += 1;
			System.out.println("Your Gear Now is " + gearStatus);
			
		}else if( a == 2) { // shift down
			gearStatus -= 1;
			System.out.println("Your Gear Now is " + gearStatus);
			
		}
		
		
	}
	
	
	
	
}