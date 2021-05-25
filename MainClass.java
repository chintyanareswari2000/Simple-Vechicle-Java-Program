package example;
import java.util.Scanner;
public class MainClass {

	Vehicle[] set;
	
	public MainClass(){
		set = new Vehicle[4];
		set[0] = new Vehicle(10,"Solar", 6, 8); //cars
		set[1] = new Vehicle(6, "Fuel", 5, 2); //sportbike
		set[2] = new Vehicle(2, "Battery", 2, 1); //moped
		
	}
	
	public void menu(int index) {
		System.out.println("Machine Size    : " + set[index].getMesin());
		System.out.println("Fuel Type       : " + set[index].getJenisBahan());
		System.out.println("Gear Amount     : " + set[index].getJumGear());
		System.out.println("Passenger Amount: " + set[index].getJumPenumpang());
	}
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		MainClass mc = new MainClass();
		Cars mobil = new Cars();
		MopedBike mobike = new MopedBike();
		SportBike olahbike = new SportBike();
		
		int pil = 0;
		
		System.out.printf("%10s", "Welcome to VehicleTech\n");
		System.out.println("=============================");
		
		System.out.println("1. Cars");
		System.out.println("2. Bike");
		System.out.println("3. Quit");
		System.out.print("Please Input your Choice    : ");
		pil = s.nextInt();
		
		switch(pil) {
			case 1:
				System.out.println();
				mc.menu(0);
				System.out.print("Is your Clutch is Pushed? [Y/N]: ");
				char inp = s.next().charAt(0);
				System.out.print("\nIs your Car Manual? [Y/N]: ");
				char ins = s.next().charAt(0);
				mobil.changeGearCar(inp,ins);
				
				break;
			case 2:
				
				System.out.println("\nChoose you Bike Type    : ");
				System.out.println("1. Sport Bike");
				System.out.println("2. Moped");
				System.out.print("Please Insert your Choice    : ");
				int pil1 = s.nextInt();
					
				if(pil1 == 1) {
					System.out.println();
					mc.menu(1);
					System.out.println("\nPlease Choose One    : ");
					System.out.println("1. Clutch Update");
					System.out.println("2. Exit Program");
					System.out.print("Insert your Choice    : ");
					int pil3 = s.nextInt();
					if(pil3 == 1) {
						System.out.println("\n1. Clutch is Pushed");
						System.out.println("2. Clutch is not Pushed");
						System.out.print("Insert Choice Number    : ");
						int pil31 = s.nextInt();
						olahbike.clutchUpdate(pil31);
					}else if (pil3 == 2) {
						System.out.println("Press Enter to Continue...");
						System.out.println();
					}
					
					
				}else if (pil1 == 2) {
				    
					System.out.println();
					mc.menu(2);
					System.out.println("\nPlease Choose One    : ");
					System.out.println("1. Change Gear");
					System.out.println("2. Exit Program");
					System.out.print("Insert your Choice    : ");
					int pil2 = s.nextInt();
					if(pil2 == 1) {
						System.out.print("Insert Your RPM Right Now    : ");
						int valRPM = s.nextInt();
						mobike.changeGear(valRPM);
					}else if (pil2 == 2) {
						System.out.println("Press Enter to Continue...");
						System.out.println();
					}
				}
				break;
				
			case 3:
				System.out.println("Press Enter to Continue...");
				System.out.println();
				break;
				
		}
		

	}
}
	
