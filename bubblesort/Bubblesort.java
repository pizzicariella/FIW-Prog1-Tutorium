package bubblesort;

public class Bubblesort {

	public static void main(String[] args) {
		int[] arr1 = {4,7,2,0,-3,2};
		int[] arr2 = {6,87,43,1,9,4,3};
		bubblesort(arr1);
		bubblesort(arr2);
		for(int i = 0; i< arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		for(int i = 0; i< arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
	}
	
	public static void bubblesort(int[] arr) {
		for(int i = 1; i<arr.length;i++) {
			for(int j = 0; j<arr.length-i; j++) {
				if(arr[j]> arr[j+1]) {
					int swap = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = swap;
				}
			}
		}
	}

}
