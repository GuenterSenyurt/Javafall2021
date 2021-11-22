package day12;

import java.util.Scanner;

public class C11_forLoop_10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir tamsayi girin...");
         int sayi=scan.nextInt();
         
         int x=sayi;
         
         int a = (x-1)*4-3;
         for (int i = 1; i <= sayi-1; i++) {
        	 
        	 
			    for (int j = sayi-i; j < sayi; j++) {
				System.out.print("* ");}
				for (int k = 0; k < a; k++) {
 					System.out.print(" ");}
			    for (int m = sayi-i; m < sayi; m++) {
			    	System.out.print(" *");
				}
			
			
			
			System.out.println();
			a=a-4;
		}
         for (int b = 0; b < 2*sayi-1; b++) {
			System.out.print("* ");
		}    
         
	scan.close();

}

}
	
/*
 
 
lutfen bir tamsayi girin...
9
*                               *
* *                           * *
* * *                       * * *
* * * *                   * * * *
* * * * *               * * * * *
* * * * * *           * * * * * *
* * * * * * *       * * * * * * *
* * * * * * * *   * * * * * * * *
* * * * * * * * * * * * * * * * * 

*/

/*
 
lutfen bir tamsayi girin...
11
*                                       *
* *                                   * *
* * *                               * * *
* * * *                           * * * *
* * * * *                       * * * * *
* * * * * *                   * * * * * *
* * * * * * *               * * * * * * *
* * * * * * * *           * * * * * * * *
* * * * * * * * *       * * * * * * * * *
* * * * * * * * * *   * * * * * * * * * *
* * * * * * * * * * * * * * * * * * * * * 
 
 
 */
