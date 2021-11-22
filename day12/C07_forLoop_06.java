package day12;

import java.util.Scanner;

public class C07_forLoop_06 {

	public static void main(String[] args) {
   //Soru 10 ) Kullanicidan iki sayi isteyin. Girilen sayilar ve aralarindaki 
		//tum tamsayilari toplayip, sonucu yazdiran bir program yaziniz

		 Scanner scan = new Scanner(System.in);
	        System.out.println("lutfen iki tamsayi girin...");
	         int sayi1, sayi2;
	         
	         sayi1 = scan.nextInt();
	         sayi2 = scan.nextInt();
	         
	         
	         if (sayi1>sayi2) {
	        	 int Sonuc = 0;
					for (int i = sayi1; i >= sayi2; i--) {
						Sonuc+=i;
						
					}
					System.out.println(Sonuc);
	        	 
				
			} else if (sayi1<sayi2){
				
				int Sonuc = 0;
				for (int i = sayi1; i <= sayi2; i++) {
					Sonuc+=i;
					
				}
				System.out.println(Sonuc);

			}else System.out.println("Sonuc :" + (sayi1+sayi2));
	         
		
		
		scan.close();
		
		
		
	}

}
