package day13;

import java.util.Scanner;

public class C01_forLoop {

	public static void main(String[] args) {
		// kullanicidan 2 tam sayi isteyin
				// ilk sayidan baslayarak , ikinci sayiya kadar ucer, ucer yazdirin
				// (ikinci sayi dahil olmak zorunda degil)
		
		
		    Scanner scan = new Scanner(System.in);
	        System.out.println("lutfen iki tamsayi girin...");
	        int sayi1 = scan.nextInt();
	        int sayi2 = scan.nextInt();
	        
	        
	        if (sayi1==sayi2) {System.out.println("Sayilar esit");
				
			} else if (sayi1>sayi2) {
				
				int x = sayi1;
				
				for (int i = 0; i < (sayi1-sayi2)/3+1; i++) {
					System.out.print(x +" ");
					x-=3;
				}

			} else {
	            int y =sayi1;
	            for (int i = 0; i < (sayi2-sayi1)/3+1; i++) {
					System.out.print(y +" ");
					y+=3;

	}

}
	}}
