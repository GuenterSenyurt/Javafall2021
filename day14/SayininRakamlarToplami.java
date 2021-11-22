package day14;

import java.util.Scanner;

public class SayininRakamlarToplami {

	public static void main(String[] args) {
// for loop ile yapalim
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen rakamlar toplamini bulmak icin pozitif bir tamsayi giriniz");
        int sayi=scan.nextInt(); // 345 data turu int
        
        int rakamlarToplami=0;
        int rakam=0;
        
        String sayiStr=""+sayi; // 345 data turu String
        // int olarak verilen bir sayinin basamak sayisini bulmak istersek
        // kisa yoldan o sayiyi String'e cevirip, str.length() method'unu kullanabiliriz
                
                for (int i = 0; i < sayiStr.length(); i++) {
                    rakam=sayi%10;
                    rakamlarToplami+=rakam;
                    sayi/=10;
                }
                System.out.println("girdiginiz sayinin rakamlar toplami : " + rakamlarToplami);
                scan.close();

	}

}
