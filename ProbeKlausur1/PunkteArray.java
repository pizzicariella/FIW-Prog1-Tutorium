package tutoriumProg1.probeKlausur1;

public class PunkteArray {
	private Punkt[] punkteA;
	
	public PunkteArray(int[] xKoord, int[] yKoord){
		this.punkteA = new Punkt[xKoord.length];
		for(int i = 0; i<punkteA.length; i++){
			punkteA[i] = new Punkt(xKoord[i], yKoord[i]);
		}
	}
	
	public PunkteArray( Punkt[] parapunkteA){
		this.punkteA=new Punkt[parapunkteA.length];
		for(int i= 0; i<punkteA.length; i++){
			this.punkteA[i] = parapunkteA[i];
		}
	}
	
	public Strecke[] erzeugePolygon(){
		Strecke[] streckenA = new Strecke[punkteA.length];
		for(int i = 0; i<punkteA.length-1;i++){
			streckenA[i] = new Strecke(punkteA[i], punkteA[i+1]);
		}
		streckenA[punkteA.length-1] = new Strecke(punkteA[punkteA.length-1], punkteA[0]);
		return streckenA;
	}
	
	public double gesamtLaenge(){
		Strecke[] streckenA = erzeugePolygon();
		double ges = 0.0;
		for(int i= 0; i<streckenA.length; i++){
			ges+=streckenA[i].laenge();
		}
		return ges;
	}
	
	public Punkt amWeitestenLinks(){
		Punkt links = punkteA[0];
		for(int i= 1; i< punkteA.length;i++){
			if(punkteA[i].istLinks(links)){
				links=punkteA[i];
			}
		}
		return links;
	}
	
	public Punkt amWeitestenOben(){
		Punkt oben = punkteA[0];
		for(int i= 1; i< punkteA.length;i++){
			if(punkteA[i].istOben(oben)){
				oben=punkteA[i];
			}
		}
		return oben;
	}
	
	@Override
	public String toString(){
		Strecke[] streckenA = erzeugePolygon();
		String s = "";
		for(int i = 0; i<streckenA.length; i++){
			s+=streckenA[i].toString+"\n";		
		}
		s+= "Gesamtlaenge der Strecken: "+gesamtLaenge()+"cm \n";
		s+= "Am weitesten Links : "+amWeitestenLinks().toString()+ "\n";
		s+= "Am weitesten oben : "+amWeitestenOben().toString()+ "\n";
		return s;
	}
	
	public void printStrecken(){
		System.out.println(this.toString());
	}
	
	//alternativ ohne toString() Methode:
	
	/*public void printStrecken(){
		Strecke[] streckenA = erzeugePolygon();
		for(int i = 0; i< streckenA.length; i++){
			streckenA[i].print();
		}
		System.out.println("Gesamtlaenge der Strecken: "+gesamtLaenge()+"cm");
		System.out.println("Am weitesten Links : "+amWeitestenLinks().toString());
		System.out.println("Am weitesten oben : "+amWeitestenOben().toString());
	}*/
}
