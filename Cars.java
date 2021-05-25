package example;

import java.util.Scanner;

public class Cars extends Vehicle{
	private String trans; //utk transimisi mobil
	private int currGear; // utk status gear 
	private char c; //kopling
	
	public Cars() {
		this.trans = "";
		this.currGear = 1;
		this.c = ' ';
		
	}
	
	public Cars(String t, int cg, char co) {
		this.trans = t;
		this.currGear = cg;
		this.c = co;
	}
	
	public void setTrans (String t) {
		this.trans = t;
	}
	public String getTrans() {
		return this.trans;
	}
	
	public void setGear (int cg) {
		this.currGear = cg;
	}
	public int getGear() {
		return this.currGear;
	}
	
	public void setC (char C) {
		this.c = c;
	}
	public char getC() {
		return this.c;
	}
	
	
	public void changeGearCar(char c, char p) { //c adalah kondisi kopling pushed or not pushed dan s adalah manual atau matic
		Scanner s = new Scanner(System.in);
		
		if (c == 'Y' && p == 'Y') {
			System.out.println("You Can Change Your Gear");
			System.out.println();
			System.out.println("1. Shift Up");
			System.out.println("2. Shift Down");
			System.out.print("Input 1 or 2    : ");
			int cginput = s.nextInt();
			
			if(cginput == 1) {
				System.out.print("Please Input Your Current Gear: ");
				int currGear = s.nextInt();
				currGear += 1;
				System.out.println("Your Gear Has Been Shifted Up to " + currGear);
				System.out.println("-- automatic exit --");
			}else if(cginput == 2) {
				System.out.print("Please Input Your Current Gear: ");
				int currGear = s.nextInt();
				currGear -= 1;
				System.out.println("Your Gear Has Been Shifted Down to " + currGear);
				System.out.println("-- automatic exit --");
			}
			
		
		}else if ((c == 'Y' && p == 'N') || (c == 'N' && p == 'Y') || (c == 'N' && p == 'N')){
			System.out.println("Sorry, You Cannot Change Your Gear");
			System.out.println("-- automatic exit --");
		}
		
	}


}
	

