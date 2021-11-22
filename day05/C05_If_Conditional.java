package day05;

import java.util.Scanner;

public class C05_If_Conditional {

	public static void main(String[] args) {
		 /*
         * Soru 2) Kullanicidan gun isimlerinden birinin ilk harfini isteyin 
         * ve o harfle baslayan gun isimlerini yazdirin 
            Ornek:  ilkHarf=P output = “Pazar, Pazartesi veya Persembe”             
            ilkHarf=S output = “Sali”
         *** Buyuk kucuk harf problem olmamasi icin toUpperCase methodunu kullanin
         */

		
		System.out.println("Haftanin gününün ilk harfini giriniz :");
		Scanner scan = new Scanner(System.in);
		
		char ilkHarf = scan.next().toUpperCase().charAt(0);
		
		if (ilkHarf =='C') { System.out.println("Carsamba, Cuma veya Cumartesi");
			
		}
		if (ilkHarf =='P') {System.out.println("Pazar, Pazartesi veya Persembe");
		
			
		}
		if (ilkHarf =='S') {System.out.println("Sali");
			
		}
		if (! (ilkHarf =='P' || ilkHarf =='S' || ilkHarf =='C' )) {System.out.println("Gecersiz gün ismi girdiniz!!");
			
		}
	}

}
