package tutoriumProg1.probeKlausur1;

public class KlausurMain {

	public static void main(String[] args) {
		Punkt p1 = new Punkt(3,7);
		Punkt p2 = new Punkt(9,0);
		Strecke strecke = new Strecke(p1, p2);
		
		if(p1.istGleich(p2)){
			System.out.println("p1 und p2 sind gleich");
		}
		else{
			System.out.println("p1 und p2 sind nicht gleich");
		}
		
		if(p1.istLinks(p2)){
			System.out.println("p1 ist links von p2");
		}
		else{
			System.out.println("p1 ist nicht links von p2");
		}
		
		if(p1.istOben(p2)){
			System.out.println("p1 ist ueber p2");
		}
		else{
			System.out.println("p1 ist nicht ueber p2");
		}
		
		strecke.print();
		int[] xKoord = {4,9,3,11,1,7};
		int[] yKoord = {3,17,8,4,15,1};
		Punkt[] pktA = new Punkt[5];
		pktA[0] = new Punkt(6,11);
		pktA[1] = new Punkt(9,3);
		pktA[2] = new Punkt(16,4);
		pktA[3] = new Punkt(2,8);
		pktA[4] = new Punkt(10,1);
		PunkteArray pa1 = new PunkteArray(xKoord, yKoord);
		PunkteArray pa2 = new PunkteArray(pktA);
		System.out.println();
		System.out.println("=============== erstes Polygon");
		pa1.printStrecken();
		System.out.println();
		System.out.println("=============== zweites Polygon");
		pa2.printStrecken();
	}

}
