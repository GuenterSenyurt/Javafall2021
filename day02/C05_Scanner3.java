package day02;

import java.util.Scanner;

public class C05_Scanner3 {

	public static void main(String[] args) {


Scanner scan = new Scanner(System.in);
		
		System.out.println("enter your first name :"); //enter your first name :
		
		String isim = scan.nextLine(); //isim = G�nter Senyurt
		
		System.out.println("enter your last name :"); //enter your last name :
		
		String soyisim = scan.nextLine(); //soyisim = Hilmi G�l
		
		System.out.println("your name is :" + isim + " "+ soyisim); //your name is :G�nter Senyurt Hilmi G�l
		
		//nextLine() takes the whole line of the entry from the user

	}

}
