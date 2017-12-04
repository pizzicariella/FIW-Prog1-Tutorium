package tutorium.aufgabe8;

public class TriangleTest {

	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle(5);
		Triangle t3 = new Triangle(4,6,3);
		
		if(t1.equilateral()){
			System.out.println("t1 ist gleichseitig.");
		}
		else{
			System.out.println("t1 ist nicht gleichseitig");
		}
		if(t1.isosceles()){
			System.out.println("t1 ist gleichschenklig");
		}
		else{
			System.out.println("t1 ist nicht gleichschenklig");
		}
		System.out.println("Umfang von t1: "+t1.circumference());
		System.out.println("Flaecheninhalt von t1: "+t1.area());
		if(t2.equilateral()){
			System.out.println("t2 ist gleichseitig.");
		}
		else{
			System.out.println("t2 ist nicht gleichseitig");
		}
		if(t2.isosceles()){
			System.out.println("t2 ist gleichschenklig");
		}
		else{
			System.out.println("t2 ist nicht gleichschenklig");
		}
		System.out.println("Umfang von t2: "+t2.circumference());
		System.out.println("Flaecheninhalt von t2: "+t2.area());
		if(t3.equilateral()){
			System.out.println("t3 ist gleichseitig.");
		}
		else{
			System.out.println("t3 ist nicht gleichseitig");
		}
		if(t3.isosceles()){
			System.out.println("t3 ist gleichschenklig");
		}
		else{
			System.out.println("t3 ist nicht gleichschenklig");
		}
		System.out.println("Umfang von t3: "+t3.circumference());
		System.out.println("Flaecheninhalt von t3: "+t3.area());
	}

}
