package tutorium.probeklausur2;

public class KlausurMain {

	public static void main(String[] args) {
		Zaehler z = new Zaehler();
		for(int i = 0; i<100; i++){
			z.erhoehe();
			if(z.getWert()%10 == 0){
				z.print();
			}
		}
		
		ZaehlerMitUeberlauf zmue = new ZaehlerMitUeberlauf();
		for(int i = 0; i<100; i++){
			zmue.erhoehe();
			if(zmue.getWert()%10 == 0){
				zmue.print();
			}
		}
		
		ZahlenFeld zf = new ZahlenFeld(20);
		zf.print();
		zf.fuelle(25);
		zf.print();
		zf.sortiereGrossKlein();
		zf.print();
	}

}
