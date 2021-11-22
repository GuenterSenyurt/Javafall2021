package day02;

import java.util.Scanner;







public class C06_substring_charAt_math_pi {

	public static void main(String[] args) {

Scanner scan = new Scanner(System.in);
		
       //write a program that writes the first letter of the entered name on the screen

		
		System.out.println("enter your name : ");//Günter Senyurt
		
		String name = scan.nextLine();

		String firstLetter = name.substring(0,1); 
		System.out.println(firstLetter); //G
		
		char first = firstLetter.charAt(0); //writes the first character of firstletter
		
		System.out.println(first); //G
		
		System.out.println(2*Math.PI); //6.283185307179586
		
		char fifth = name.charAt(4); //e
	
		System.out.println(fifth);

		String string = name.substring(5,10); //writes just letters 5,6,7,8,9 
		System.out.println(string); // r Sen
		
		System.out.println(44*44*Math.PI); //6082.12337734984
		
		System.out.println(name); //Günter Senyurt
		
		System.out.println(first+firstLetter); //GG
		
		System.out.println("enter your name again : ");
		
		char secondLetter = scan.next().charAt(1); //scan.next() is equal to Günter - the very first word, it is a String valuej 
		
		System.out.println(secondLetter); //ü

	}

}
