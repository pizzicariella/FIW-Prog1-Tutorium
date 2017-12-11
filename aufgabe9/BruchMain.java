package tutorium.aufgabe9;

public class BruchMain {

	public static void main(String[] args) {
		Bruch b1 = new Bruch(12, 24);
		Bruch b2 = new Bruch(5, 8);
		Bruch b3 = new Bruch(6,12);
		b1.kuerzen().print();
		b1.plus(b2).print();
		b1.minus(b2).print();
		b1.mal(b2).print();
		b1.geteilt(b2).print();
		if(Bruch.istGroesser(b1, b2)){
			System.out.println("b1 ist groesser als b2");
		}
		else{
			System.out.println("b2 ist groesser als b1");
		}
		if(Bruch.istKleiner(b1, b2)){
			System.out.println("b1 ist kleiner als b2");
		}
		else{
			System.out.println("b2 ist kleiner als b1");
		}
		if(Bruch.istGleich(b1, b2)){
			System.out.println("b1 ist gleich b2");
		}
		else{
			System.out.println("b2 ist nicht gleich b1");
		}
		if(Bruch.istGleich(b1, b3)){
			System.out.println("b1 ist gleich b2");
		}
		else{
			System.out.println("b2 ist nicht gleich b1");
		}
			
	}

}
