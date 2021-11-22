package day09;

import java.util.Scanner;

public class C03_String_olarak_verilen_sayi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz :");
        String sayi = scan.next();    //"10.000" yazdiralim mesela yani String olarak
        sayi = sayi.replace(".", "");
        
        System.out.println(sayi);
        
        if (Integer.valueOf(sayi)>1000) {System.out.println("bulunan sonuc 1000 den buyuktur");
			//Integer.valueOf(String) --> String degeri Integer yapar //Wrapper class
		} else {System.out.println("bulunan sonuc 1000 den kucuktur");

		}
	}

}
