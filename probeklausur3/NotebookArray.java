package tutorium.probeklausur3;

import java.util.Random;

public class NotebookArray {
	Notebook[] notebooks;
	
	public NotebookArray(int anzahl){
		this.notebooks= new Notebook[anzahl];
	}
	
	public void konfigurieren(){
		Random r = new Random();
		for(int i=0; i<this.notebooks.length; i++){
			int z = r.nextInt(5);
			switch(z){
			 case 0 : notebooks[i] = Notebook.herstellen("lenovo",  8, 256, 13);break;
			 case 1 : notebooks[i] = Notebook.herstellen("lenovo",  16, 512, 15);break;
			 case 2 : notebooks[i] = Notebook.herstellen("apple",  4, 256, 13);break;
			 case 3 : notebooks[i] = Notebook.herstellen("apple",  8, 512, 13);break;
			 case 4 : notebooks[i] = Notebook.herstellen("dell",  8, 512, 15);break;
			}
		}
	}
	
	@Override
	public String toString(){
		String s = "[ "+notebooks.length+" : ";
		for(int i = 0; i<notebooks.length-1; i++){
			s+=notebooks[i].toString()+", ";
		}
		if(notebooks.length!=0){
			s+=notebooks[notebooks.length-1].toString();
		}
		s+="]";
		return s;
	}
	
	public void print(){
		System.out.println(this.toString());
	}
	
	public NotebookArray getHersteller(String hersteller){
		int cnt = 0;
		for(int i = 0; i<notebooks.length;i++){
			if(notebooks[i].getHersteller().equals(hersteller)){
				cnt++;
			}
		}
		NotebookArray nba = new NotebookArray(cnt);
		int j = 0;
		for(int i = 0;i< this.notebooks.length;i++){
			if(this.notebooks[i].getHersteller().equals(hersteller)){
				nba.notebooks[j] = Notebook.herstellen(hersteller, notebooks[i].getRam(), notebooks[i].getPlatte(), notebooks[i].monitor);
				j++;
			}
		}
		return nba;
	}
	
	public void sortRamPlatte(){
		for(int i = 0; i<notebooks.length-1; i++){
			for(int j = 0; j<notebooks.length-i-1;j++){
				if((notebooks[j].getRam()>notebooks[j+1].getRam()) || (notebooks[j].getRam()==notebooks[j+1].getRam() && 
						notebooks[j].getPlatte()>notebooks[j+1].getPlatte())){
					Notebook rem = notebooks[j];
					notebooks[j] = notebooks[j+1];
					notebooks[j+1]= rem;				
				}
			}
		}
	}
}

