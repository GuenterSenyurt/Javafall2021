package day12;

import java.util.Scanner;

public class C09_HesapCetveli_08 {

	public static void main(String[] args) {
	
		 Scanner scan = new Scanner(System.in);
	        System.out.println("lutfen bir tamsayi girin...");
	         int sayi=scan.nextInt();
	         
	         
	         for (int i = 1; i <= sayi; i++) {
				for (int j = 1; j <= sayi; j++) {
					System.out.print((j*i)+" ");
				}
				System.out.println();
			}
		

	}

}
