/**
 * Created by TCHYARICI on 02/29/2020
 */

import java.util.Scanner;

/**
 * Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
 * Ask the user "Do you want to continue? Y/N". If N, stop getting number from console and print the result. If Y, continue to getting integer from console.
 */
public class Main {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Enter the number ");
		int number = console.nextInt();

		System.out.println("Sum of even numbers: ");
		System.out.println("Sum of odd numbers: ");
	}
}
