package tutorium.aufgabe10;

public class SortedArray {
	private int[] s;
	
	public SortedArray(){
		this.s= new int[0];
	}
	
	public SortedArray(int element){
		this.s = new int[1];
		s[0] = element;
	}
	
	public boolean insert(int element){
		for(int i = 0; i<s.length;i++){
			if(s[i] == element){
				return false;
			}
		}
		int[] sNeu = new int[s.length+1];
		int sIndex = 0;
		int sNeuIndex = 0;
		while(sIndex < s.length && s[sIndex] < element ){
			sNeu[sNeuIndex] = s[sIndex];
			sNeuIndex++;
			sIndex++;
		}
		sNeu[sNeuIndex] = element;
		sNeuIndex++;
		while(sIndex < s.length){
			sNeu[sNeuIndex]=s[sIndex];
			sNeuIndex++;
			sIndex++;
		}
		s=sNeu;
		return true;
	}
	
	public boolean delete(int element){
		boolean enthalten = false;
		for(int i = 0; i< s.length; i++){
			if(s[i] == element){
				enthalten = true;
			}
		}
		if(!enthalten){
			return false;
		}
		int[] sNeu = new int[s.length-1];
		int i = 0;
		int j = 0;
		while(j < sNeu.length){
			if(s[i] != element){
				sNeu[j] = s[i];
				i++;
				j++;
			}
			else{
				i++;
			}
		}
		s = sNeu;
		return true;
	}
	
	public void print(){
		System.out.print("[ ");
		if(s.length>0){
			for(int i = 0; i<s.length-1;i++){
				System.out.print(s[i]+", ");
			}
			System.out.print(s[s.length-1]+" ]");
			System.out.println();
		}
		else{
			System.out.print("]");
			System.out.println();
		}
	}
}
