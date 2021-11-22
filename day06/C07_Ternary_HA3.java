package day06;

import java.util.Scanner;

public class C07_Ternary_HA3 {

	public static void main(String[] args) {


		// bir sayi girin ve mutlak degerini yazdirin
		
				Scanner scan = new Scanner(System.in);
				
				System.out.println("Bir tamsayi girin :");
				
				double a = scan.nextDouble();
				
				
				  double b = a>0 ? a : a*(-1);
					System.out.println("girdiginiz sayinin mutlak degeri :"+ b + " idir");

	}

}
