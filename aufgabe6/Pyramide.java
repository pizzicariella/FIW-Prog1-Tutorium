package tutorium.aufgabe6;

public class Pyramide {

	public static void main(String[] args) {
		printPyramid(11, '+');
	}
	
	public static void printPyramid(int height, char symbol){
		for(int i = 0; i < height; i++){
			for(int k = 0; k<height-i; k++){
				System.out.print(" ");
			}
			for(int j = 0; j< 2*i+1; j++){
				System.out.print(symbol);
			}
			System.out.println();
		}
	}

}
