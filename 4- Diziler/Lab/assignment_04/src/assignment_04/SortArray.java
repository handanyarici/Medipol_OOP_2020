package assignment_04;

import java.util.Scanner;

/**
 * Created by TCHYARICI on 03/03/2020
 */
public class SortArray {
	public static void main(String args[]) {
		int[] a = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("tam sayi giriniz.");
			Scanner console = new Scanner(System.in);
			a[i] = console.nextInt();
		}
		int [] result = sortArray(a);
		for(int i = 0; i<result.length;i++){
			System.out.println(result[i]);
		}
	}

	private static int[] sortArray(int[] a) {
		return new int[5];
	}

}
