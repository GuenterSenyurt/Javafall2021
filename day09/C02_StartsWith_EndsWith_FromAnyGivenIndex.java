package day09;

import java.util.Scanner;

public class C02_StartsWith_EndsWith_FromAnyGivenIndex {

	public static void main(String[] args) {

		 //Kullanicidan bir cumle ve bir kelime alin
	    //verilen cumledeki 4. endeksin verilen kelime ile baslayip baslamadigini
	    
			
			
			   Scanner scan=new Scanner(System.in);
		       System.out.println("Lutfen bir cumle giriniz");
		       
		       String cumle = scan.nextLine();
		       
		       System.out.println("Lutfen bir kelime giriniz");
		       String kelime = scan.next();
		       
		       System.out.println(cumle.startsWith(kelime,4));
		       
		       if (cumle.startsWith(kelime,4)) {System.out.println("Cumle sectiginiz kelime ile basliyor.");
				
			} else {System.out.println("Cumle sectiginiz kelime ile baslamiyor.");
		
		
		
		
		
		
		

	}

}}
