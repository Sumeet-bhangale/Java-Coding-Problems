package com.javaCodingProblems;

public class Fibonacci {
	public static void main(String[] args) {

		int term = 7;
		int a = 0, b = 1, c;

		for (int i = 1; i <= term; i++) {

			System.out.print(a + " ");
			c = a + b;
			a = b;
			b = c;

		}

	}

}
