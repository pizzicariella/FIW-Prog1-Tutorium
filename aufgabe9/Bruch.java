package tutorium.aufgabe9;

public class Bruch {
	int zaehler;
	int nenner;
	
	public Bruch(){
		this.zaehler=1;
		this.nenner=1;
	}
	
	public Bruch(int zaehler, int nenner){
		this.zaehler=zaehler;
		this.nenner=nenner;
	}
	
	public int ggT(int a, int b){
		int ggT;
		if(b== 0){
			ggT = a;
		}
		else{
			ggT = ggT(b,a%b);
		}
		return ggT;
	}
	
	public Bruch kuerzen(){
		int ggT=ggT(this.zaehler,this.nenner);
		return new Bruch(this.zaehler/ggT, this.nenner/ggT);
	}
	
	public Bruch plus(Bruch b){
		if(this.nenner == b.nenner){
			Bruch neuerBruch = new Bruch(this.zaehler+b.zaehler, this.nenner);
			return neuerBruch.kuerzen();
		}
		else{
			int neuerNenner = this.nenner*b.nenner;
			Bruch neuerBruch = new Bruch(this.zaehler*b.nenner+b.zaehler*this.nenner, neuerNenner);
			return neuerBruch.kuerzen();
		}
	}
	
	public Bruch minus(Bruch b){
		if(this.nenner == b.nenner){
			Bruch neuerBruch = new Bruch(this.zaehler-b.zaehler, this.nenner);
			return neuerBruch.kuerzen();
		}
		else{
			int neuerNenner = this.nenner*b.nenner;
			Bruch neuerBruch = new Bruch(this.zaehler*b.nenner-b.zaehler*this.nenner, neuerNenner);
			return neuerBruch.kuerzen();
		}
	}
	
	public Bruch mal(Bruch b){
		Bruch neuerBruch = new Bruch(this.zaehler*b.zaehler, this.nenner*b.nenner);
		return neuerBruch.kuerzen();
	}
	
	public Bruch geteilt(Bruch b){
		Bruch neuerBruch = new Bruch(b.nenner, b.zaehler);
		neuerBruch = mal(neuerBruch);
		return neuerBruch.kuerzen();
	}
	
	public void print(){
		System.out.println(this.zaehler+" / "+this.nenner);
	}
	
	public static boolean istGroesser(Bruch b1, Bruch b2){
		double b1Double = (double) b1.zaehler/(double)b1.nenner;
		double b2Double = (double)b2.zaehler/(double)b2.nenner;
		return b1Double>b2Double;
	}
	
	public static boolean istKleiner(Bruch b1, Bruch b2){
		double b1Double = (double) b1.zaehler/(double)b1.nenner;
		double b2Double = (double)b2.zaehler/(double)b2.nenner;
		return b1Double<b2Double;
	}
	
	public static boolean istGleich(Bruch b1, Bruch b2){
		Bruch b1Gekuerzt = b1.kuerzen();
		Bruch b2Gekuerzt = b2.kuerzen();
		return b1Gekuerzt.zaehler == b2Gekuerzt.zaehler && b1Gekuerzt.nenner == b2Gekuerzt.nenner;
	}
}
