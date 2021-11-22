package day12;

import java.util.Scanner;

public class C08_forLoop_07 {

	public static void main(String[] args) {

		//Soru 11 ) Interview Question Kullanicidan 10’dan kucuk bir tamsayi isteyin ve
     //girilen sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)
		
		
		 Scanner scan = new Scanner(System.in);
	        System.out.println("lutfen bir tamsayi girin...");
	         int sayi=scan.nextInt();
	         
	         
	         if (sayi==0) { System.out.println("0! = 1");
				
			} else if (sayi==1) {System.out.println("1! = 1");

			} else {
				String m="";
				int x= 1;
				for (int i = sayi; i >= 1; i--) {
					 x*=i;
					 m = m +"*"+i;
				}
				System.out.print(sayi + "! = "+ x);
				System.out.println(" ="+ m.substring(1));
				
			}
				
	         
	         
	         
	     scan.close();    
	         
		
		
		
		
		
		
		

	}

}
