package tutorium.aufgabe6;

public class Pyramide {

	public static void main(String[] args) {
		printPyramid(11, '+');
	}
	
	public static void printPyramid(int height, char symbol){
		for(int row=0; row<height; row++){
			for(int spaces= height-row; spaces> 0; spaces--){
				System.out.print(" ");
			}
			for(int sym = 0; sym<row*2+1; sym++){
				System.out.print(symbol);
			}
			System.out.println();
		}
	}
}
