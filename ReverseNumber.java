package com.LogicBuild;

public class ReverseNumber {
	public static void main(String[] args) {
		
		int a = 456;
		
		while(a > 0) {
			
			int rev = a % 10;
			
			System.out.print(rev);
			
			a = a/10;
			
		}
		
	}

}
