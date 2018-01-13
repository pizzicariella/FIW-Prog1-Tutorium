package tutorium.probeklausur2;

import java.util.Random;

public class ZahlenFeld {
	int[] meinFeld;
	Zaehler anzDoppel;
	ZaehlerMitUeberlauf anzVersuche;
	
	public ZahlenFeld(int laenge){
		this.meinFeld= new int[laenge];
		this.anzDoppel= new Zaehler();
		this.anzVersuche= new ZaehlerMitUeberlauf();
	}
	
	public boolean existiert(int zahl){
		for(int i = 0; i<this.meinFeld.length;i++){
			if(this.meinFeld[i]==zahl){
				return true;
			}
		}
		return false;
	}
	
	public void fuelle(int max){
		Random r = new Random();
		for(int i = 0; i<this.meinFeld.length; i++){
			boolean eingefuegt = false;
			while(!eingefuegt){
				int zahl = r.nextInt(max);
				this.anzVersuche.erhoehe();
				if(!(existiert(zahl))){
					this.meinFeld[i] = zahl;
					eingefuegt = true;
				}
				else{
					this.anzDoppel.erhoehe();
				}
			}
		}
	}
	
	public void sortiereGrossKlein(){
		for(int i = this.meinFeld.length-1; i>0;i--){
			for(int j = 0; j< i; j++){
				if(this.meinFeld[j] < this.meinFeld[j+1]){
					int merke = this.meinFeld[j];
					this.meinFeld[j] = this.meinFeld[j+1];
					this.meinFeld[j+1] = merke;
				}
			}
		}
	}
	
	public String toString(){
		String s = "[";
		for(int i = 0; i<this.meinFeld.length-1;i++){
			s+=this.meinFeld[i]+", ";
		}
		if(this.meinFeld.length !=0){
			s+=this.meinFeld[this.meinFeld.length-1];
		}
		s+="], doppelte="+this.anzDoppel.wert+", Anzahl Versuche="+this.anzVersuche.gesamt();
		return s;
	}
	
	public void print() {
		System.out.println(this.toString());
	}
}
