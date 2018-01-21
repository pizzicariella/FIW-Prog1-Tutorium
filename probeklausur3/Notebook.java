package tutorium.probeklausur3;

public class Notebook extends Computer{
	protected int monitor;
	
	public static Notebook herstellen(String hersteller, int ram, int platte, int monitor){
		Notebook n = new Notebook();
		n.hersteller= hersteller;
		n.ram=ram;
		n.platte=platte;
		n.monitor= monitor;
		return n;
	}
	
	@Override
	public String toString(){
		return "(Hersteller: "+this.hersteller+", RAM: "+this.ram+", Platte: "+this.platte+", Monitor: "+this.monitor+")";
	}
	
}
