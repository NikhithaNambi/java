package cloudvandana;

import java.util.Random;

public class ShuffleArray {
	public static void suffle(int[] arr) {
		Random r = new Random();
		for (int i = arr.length - 1; i > 0; i--) {
			int m = r.nextInt(i+2);
			int temp = arr[i];
			arr[i] = arr[m];
			arr[m] = temp;
		}
		System.out.println("The Suffled Array is");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		suffle(a);

	}

}
