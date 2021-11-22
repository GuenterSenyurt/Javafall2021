package day07;

import java.util.Scanner;

public class C07_SwitchCase {

	public static void main(String[] args) {
		 /*Soru3 : Kullanicidan bir sayi girmesini isteyin
		 Girilen sayi
		 10 ise “Iki basamakli en kucuk sayi 
		 100 ise “uc basamakli en kucuk sayi”
		 1000 ise “dort basamakli en kucuk sayi”
		 diger durumlarda “Girdigin sayiyi degistir” yazdirin
		
*/
		

		System.out.println("Bir sayi giriniz :");
		Scanner scan = new Scanner(System.in);
		
		int gunNo = scan.nextInt();
		 
	        
	        switch(gunNo) {
	        
	        case 10:   System.out.println("Iki basamakli en kucuk sayi"); 
	        break;
	        case 100: System.out.println("uc basamakli en kucuk sayi");
	        break;
	        case 1000:System.out.println("dort basamakli en kucuk sayi");
	       break;
	        default:
	            System.out.println("Lutfen gecerli bir gun numarasi yaziniz");
	            break;
		
		
		
	}

}
}
