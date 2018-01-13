package tutorium.probeklausur2;

public class Zaehler {
	protected int wert;
	
	public Zaehler(){
		this.wert=0;
	}

	public int getWert() {
		return wert;
	}
	
	public void erhoehe(){
		this.wert++;
	}
	
	public void reset(){
		this.wert=0;
	}
	
	@Override
	public String toString(){
		return "Zaehlerstand: "+this.wert;
	}
	
	public void print(){
		System.out.println(this.toString());
	}
}
