package tutorium.probeklausur3;

public class Computer {
	protected String hersteller;
	protected int ram;
	protected int platte;
	
	public String getHersteller() {
		return hersteller;
	}
	public int getRam() {
		return ram;
	}
	public int getPlatte() {
		return platte;
	}
	
	public static Computer herstellen(String hersteller, int ram, int platte){
		Computer computer = new Computer();
		computer.hersteller=hersteller;
		computer.ram=ram;
		computer.platte=platte;
		return computer;
	}
	
	public boolean gleicherHersteller(Computer c){
		return this.hersteller.equals(c.hersteller);
	}
	
	public boolean gleicherHersteller(String hersteller){
		return this.hersteller.equals(hersteller);
	}
	
	@Override
	public String toString(){
		return this.hersteller+" mit "+this.ram+" RAM und "+this.platte+" SSD";
	}
	
	public void print(){
		System.out.println(this.toString());
	}
	
}
