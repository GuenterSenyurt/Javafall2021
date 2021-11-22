package day12;

import java.util.Scanner;

public class C10_forLoop_09 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir tamsayi girin...");
         int sayi=scan.nextInt();
         
         
         for (int i = 1; i <= sayi; i++) {
			for (int j = sayi-i; j < sayi; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	scan.close();

}

}
		
/*  sayi=10
 
* 
* * 
* * * 
* * * * 
* * * * * 
* * * * * * 
* * * * * * * 
* * * * * * * * 
* * * * * * * * * 
* * * * * * * * * * 	
	
 */
		

