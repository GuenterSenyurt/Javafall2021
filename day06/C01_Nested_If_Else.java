package day06;

import java.util.Scanner;

public class C01_Nested_If_Else {

	public static void main(String[] args) {
 /*
		Soru 11) Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
    Kullanicidan bir sifre girmesini isteyin
    Eger ilk harf buyuk harf ise “A” olup olmadigini kontrol edin. Ilk harf A ise   “Gecerli Sifre”     degilse “Gecersiz Sifre” yazdirin.
    Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin. Ilk harf z ise   “Gecerli Sifre”     degilse “Gecersiz Sifre” yazdirin.

		
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Sifrenizi giriniz :");
		
		char karakter = scan.next().charAt(0);
		
		if (karakter >='A' && karakter <= 'Z') {
			if (karakter == 'A') {
				System.out.println("Gecerli sifre");
				
			} else {System.out.println("Gecersiz sifre");

			}
		} else if (karakter >='a' && karakter <= 'z') {
			if (karakter == 'z') {
				System.out.println("Gecerli sifre");
			} else {System.out.println("Gecersiz sifre");

			}
				
		} else { System.out.println("Gecerli sifre olmasi icin harf ile baslayin");

		}
  scan.close();
		}
		
		

	}


