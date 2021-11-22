package day13;

import java.util.Scanner;

public class C02_forLoop {

	public static void main(String[] args) {
		//Kullanicidan 10'dan kucuk pozitif bir tamsayi girmesini isteyin
		// girdigi sayiya gore asagidaki sekli yazdirin
		// orn : 3 girilirse
		// 1
		// 1 2
		// 1 2 3


		    Scanner scan = new Scanner(System.in);
	        System.out.println("lutfen bir tamsayi girin : 20 den kucuk olsun.");

          
	        double sayi = scan.nextDouble();
	        int sayi1 = (int) sayi;
	        
	       
					
					
					 int m = 1;
						
				        for (int j = 1; j <= sayi1; j++) {
							for (int k = 0; k < j; k++) {
								System.out.print(m+" ");
								m+=1;
							
							}
							System.out.println();
							m=1;
						}
				        scan.close();
				        
				        
				        
				     
				 
				        

	}
	}



/*
 
 
 
lutfen bir tamsayi girin : 20 den kucuk olsun.
20
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
1 2 3 4 5 6 
1 2 3 4 5 6 7 
1 2 3 4 5 6 7 8 
1 2 3 4 5 6 7 8 9 
1 2 3 4 5 6 7 8 9 10 
1 2 3 4 5 6 7 8 9 10 11 
1 2 3 4 5 6 7 8 9 10 11 12 
1 2 3 4 5 6 7 8 9 10 11 12 13 
1 2 3 4 5 6 7 8 9 10 11 12 13 14 
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 



 */
