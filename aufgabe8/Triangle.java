package tutorium.aufgabe8;

public class Triangle {
	int a, b, c;
	
	public Triangle(){
		this.a=1;
		this.b=1;
		this.c=1;
	}
	
	public Triangle(int lenght){
		this.a=lenght;
		this.b = lenght;
		this.c=lenght;
	}
	
	public Triangle(int a, int b, int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	public boolean equilateral(){
		return a==b && b==c;
	}
	
	public boolean isosceles(){
		return a==b || b==c || a ==c;
	}
	
	public int circumference(){
		return a +b+c;
	}
	
	public double area(){
		// Berechnung nach der Formel von Heron
		double s = ((double)a+(double)b+(double)c)/2;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
}
