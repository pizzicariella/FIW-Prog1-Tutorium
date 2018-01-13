package tutorium.probeklausur2;

public class ZaehlerMitUeberlauf extends Zaehler{
	private static final int MAX = 10;
	private Zaehler anzUeberlaeufe = new Zaehler();
	
	@Override
	public void reset(){
		this.wert = 0;
		this.anzUeberlaeufe.wert = 0;
	}
	
	@Override
	public void erhoehe(){
		if(this.wert<MAX){
			this.wert++;
		}
		else{
			this.anzUeberlaeufe.wert++;
			this.wert=1;
		}
	}
	
	public int gesamt(){
		return this.anzUeberlaeufe.wert*10+this.wert;
	}
	
	@Override
	public String toString(){
		return "Zaehlerstand: "+this.wert+", Anzahl Ueberläufe: "+this.anzUeberlaeufe.wert+", Gesamtzaehler: "+this.gesamt();
	}
	
	public void print(){
		System.out.println(this.toString());
	}
}
