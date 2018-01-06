package tutoriumProg1.probeKlausur1;

public class Strecke {
	private Punkt start, ende;
	
	public Strecke(Punkt start, Punkt ende){
		this.start=start;
		this.ende=ende;
	}

	public Punkt getStart() {
		return start;
	}

	public void setStart(Punkt start) {
		this.start = start;
	}

	public Punkt getEnde() {
		return ende;
	}

	public void setEnde(Punkt ende) {
		this.ende = ende;
	}
	
	public double laenge(){
		double xDiff = Math.abs(start.getX()-ende.getX());
		double yDiff = Math.abs(start.getY()-ende.getY());
		return Math.sqrt(xDiff*xDiff+yDiff*yDiff);
	}
	
	@Override
	public String toString(){
		return "Strecke [Startpunkt="+start.toString()+", Endpunkt="+ende.toString()+", Laenge="+laenge()+"cm ]";
	}
	
	public void print(){
		System.out.println(toString());
	}
}
