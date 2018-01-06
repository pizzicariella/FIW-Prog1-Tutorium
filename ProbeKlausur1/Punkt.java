package tutoriumProg1.probeKlausur1;

public class Punkt {
	private int x,y;
	
	public Punkt(int x, int y){
		setX(x);
		setY(y);
		if(x <0){
			this.x = 0;
		}
		if(y<0){
			this.y = 0;
		}
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		if(x>= 0){
			this.x = x;
		}
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		if(y>=0){
			this.y = y;
		}
	}
	
	public boolean istGleich(Punkt p){
		return this.x == p.x && this.y == p.y;
	}
	
	public boolean istLinks(Punkt p){
		return this.x < p.x;
	}
	
	public boolean istOben(Punkt p){
		return this.y < p.y;
	}
	
	@Override
	public String toString(){
		return "("+x+","+y+")";
	}
	
	public void print(){
		System.out.println(toString());
	}
}
