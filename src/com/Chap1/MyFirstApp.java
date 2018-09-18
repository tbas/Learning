package com.Chap1;

public class MyFirstApp {
    public static void main(String [] args){
		
		System.out.println("HeadFirstJava First Chapter s");
	
		float y = 26.5f;
		int x = (int) y;
		System.out.println(x);
		
		x = 3;
		if (x > 2) {
			System.out.print("a");
		
		}
		while (x > 0) {
					
			x = x - 1;
			System.out.print("-");
			
			if (x == 1) {
				System.out.print("d");
				x = x - 1;
			}
			if (x == 2) {
				System.out.print("b c");
				}

		}
		
	}
}
