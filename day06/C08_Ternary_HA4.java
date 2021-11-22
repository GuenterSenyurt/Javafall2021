package day06;

import java.util.Scanner;

public class C08_Ternary_HA4 {

	public static void main(String[] args) {
		// Bir sayi isteyin ve sayi pozitífse sayiyi yazdirin
		// negatif ise karesini yazdirin
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir sayi girin :");
		
		double a = scan.nextDouble();
		
		
		  double m = a>0 ? a : a*a;
			System.out.println(m);

	}

}
