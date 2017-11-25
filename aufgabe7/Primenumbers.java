package tutorium.aufgabe7;

public class Primenumbers {

	public static void main(String[] args) {
		printPrimeNumbers(61);
	}
	
	public static boolean isPrime(int number){
		if(number ==0 || number == 1){
			return false;
		}
		for(int i = number-1; i>1; i--){
			if(number%i == 0){
				return false;
			}
		}
		return true;
	}
	
	public static void printPrimeNumbers(int maximum){
		for(int i = 0; i<=maximum;i++){
			if(isPrime(i)){
				System.out.print(i);
			}
			else{
				System.out.print("-");
			}
		}
	}

}
