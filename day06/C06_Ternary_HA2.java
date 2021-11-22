package day06;

import java.util.Scanner;

public class C06_Ternary_HA2 {

	public static void main(String[] args) {

	// bir tamsayi girin ve tek mi cift mi oldugunu yazdirin
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir tamsayi girin :");
		
		int a = scan.nextInt();
		
		
		  String b = a%2 == 0 ? "cift" : "tek";
			System.out.println("girdiginiz sayi :"+ b + " sayidir");
		
		
		
		
		
		
		

		
		
		

	}

}
