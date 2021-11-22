package day10;

import java.util.Iterator;
import java.util.Scanner;

public class C02_MethodCreation02 {

	public static void main(String[] args) {
		// Kullanicidan iki sayi isteyin
		// Sayilarin kareleri ve küplerini toplayip yazdiran iki ayri method yazin
		//Kullaniciya sorun: 2 yazarsa kareleri toplamini yapan method calissin
		//Kullanici 3 yazarsa kupleri toplamini yapan method calissin
		
		
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Iki sayi giriniz :");
		
	    double x= scan.nextDouble();
		double y=scan.nextDouble();
		
		
		int m =0;
		
		
		
		while (m!=1) {
			System.out.println("Seciminizi yapiniz :\n"+
			    "2: kareler toplami\n"+
			    "3: kupler toplami");
			
			int A = scan.nextInt();
			
		if (A==2) {karelerToplami(x,y); m++;}
		
		else if (A==3) {kuplerToplami(x,y);m++;}
		else  System.out.println("Yanlis rakam yazdiniz, tekrar deneyin :");
		
	
		
	}}

	public static void karelerToplami(double x, double y) {
		System.out.println("Girilen iki sayinin kareler toplami :" +(x*x+y*y)+ " dir.");
		// argument values and parameter values do not have to be defined the same
	}

	public static void kuplerToplami(double x, double y) {
		System.out.println("Girilen iki sayinin kupler toplami :" +(x*x*x+y*y*y)+ " dir.");
		
		
		
	}
 
}
