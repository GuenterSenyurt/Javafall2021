package day06;

import java.util.Scanner;

public class C05_Ternary_HA1 {

	public static void main(String[] args) {
		// iki sayi girin ve büyük olmayani yazdirin
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Iki sayi girin :");
		
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		
		double a = y<x ? y : x;
		System.out.println("daha kücük sayi :"+ a + " dir");
		
		
		

	}

}
