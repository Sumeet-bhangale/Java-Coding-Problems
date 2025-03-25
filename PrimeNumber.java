package com.javaCodingProblems;

// Prime Number is a number which is Divisible by 1 and itself.
// Eg. 2, 3, 5, 7, 11, etc.

public class PrimeNumber {
	public static void main(String[] args) {

		int num = 5;
		int count = 0;

		for (int i = 1; i <= num; i++) {

			if (num % i == 0) {

				count++;
			}
		}

		if (count == 2) {
			System.out.println("Prime Number");
		}

		else {
			System.out.println("Not a Prime Number");
		}

	}
}
