package day05;

import java.util.Scanner;

public class C06_If_Statement_with_String_Variable {

	public static void main(String[] args) {
		
		// G�n giriniz ve haftasonu mu haftaici mi oldugunu ayirt eden kod yaziniz-String ile deneyin 
		
	
		
			System.out.println("Bir g�n giriniz : ");
		Scanner scan = new Scanner(System.in);
		
		String gun = scan.next().toLowerCase();
		
	    if (gun.equals("pazar") || gun.equals("cumartesi")) {
	    	System.out.println("Haftasonu g�n� sectiniz!!");
			
		}
		if (! (gun.equals("pazar") || gun.equals("cumartesi"))) {
			System.out.println("Haftaici g�n� sectiniz!!");	
		}
		
  //String is a non-primitive data type,  
		// String gun = "pazar";
		// if (gun == "pazar") {
		 System.out.println("it is sunday");} 

	    // bu kod calismayabilir veya calismaz
	
	     //bunun yerine if (gun.equals("pazar")) kullanmaliyiz.h

	
}
	


