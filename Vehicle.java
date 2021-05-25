package example;

public class Vehicle {
	private int ukuranMesin;
	private String jenisBB;
	private int jumGear;
	private int jumPenumpang;
	
	public Vehicle () {
		this.ukuranMesin = 0;
		this.jenisBB = "fuel";
		this.jumGear = 1;
		this.jumPenumpang = 0;
	}
	
	public Vehicle(int um, String jbb, int jg, int jp) {
		this.ukuranMesin = um;
		this.jenisBB = jbb;
		this.jumGear = jg;
		this.jumPenumpang = jp;
	}
	
	public void setMesin(int um) {
		this.ukuranMesin = um;
	}
	public int getMesin() {
		return this.ukuranMesin;
	}
	
	public void setJenisBahan(String jbb) {
		this.jenisBB = jbb;
	}
	public String getJenisBahan() {
		return this.jenisBB;
	}
	
	public void setJumGear(int jg) {
		this.jumGear = jg;
	}
	public int getJumGear() {
		return this.jumGear;
	}
	
	public void setJumPenumpang(int jp) {
		this.jumPenumpang= jp;
	}
	public int getJumPenumpang() {
		return this.jumPenumpang;
	}
	
	public String toString() {
		return "Machine Size: " + ukuranMesin + ";Fuel Type: " + jenisBB + ";Gear Amount: " + jumGear + ";Passenger Amount: " + jumPenumpang;
	}
	
	
	
}
