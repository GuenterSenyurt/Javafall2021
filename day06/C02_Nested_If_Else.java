package day06;

import java.util.Scanner;

public class C02_Nested_If_Else {

	public static void main(String[] args) {
		// Soru12)  Kullanıcıdan 4 basamakli bir sayi girmesini isteyin. 
		//Girdiği sayi 5’e  bölünüyorsa son rakamını kontrol edin. Son
		//rakamı 0 ise ekrana “5’e bölünen  çift sayı” yazdırın. Son 
		//rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın. 
		//Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("4 basamakli bir sayi giriniz :");
		
		int sayi = scan.nextInt();
		
		if (sayi >=1000 && sayi <= 9999 && sayi%5 == 0) {
			if (sayi%10 == 0)
				{
				System.out.println("5 e bolunen cift sayi bu");
				
			} else {System.out.println("5 e bolunen tek sayi bu");

			}
		} else if (sayi >=1000 && sayi <= 9999 && sayi%5 != 0) {
			 {
				System.out.println("Tekrar deneyiniz");

			}
			 
		} 
		else {
			System.out.println("Yanlis sayi, 4 basamakli sayi olacakti");
		}
		 scan.close();
		}
 

	}


