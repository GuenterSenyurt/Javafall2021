package day02;

import java.util.Scanner;

public class C04_Scanner2 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter your first name :"); //enter your first name :
		
		String isim = scan.next(); //isim = Günter
		
		System.out.println("enter your last name :"); //enter your last name :
		
		String soyisim = scan.next(); //soyisim = Senyurt
		
		System.out.println("your name is :" + isim + " "+ soyisim); //your name is :Günter Senyurt
		
		//next() takes the first word only from the entry of the user
		
		
		
	}

}
