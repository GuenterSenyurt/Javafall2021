package day02;

import java.util.Scanner; //Scanner is imported to the class (not to package since it is further above)
                          //from java.util, java.util is Java utility library

public class C03_Scanner {

	public static void main(String[] args) {
		
		
  Scanner scan = new Scanner(System.in); //Scanner object created, scan is a Scanner object, instead of scan we could you other names as well
      //objects are non-primitive data types
     // primitive data types include only value but --> non-primitive data types include value + methods
      //when typed scan. it shows all methods available for the object scan
  
  System.out.println("please write your name :"); // what do we want from the user
  
  String isim = scan.next(); //user name is assigned to String variable isim
  
  System.out.println("your name is : "+isim); //the user name is printed on screen
  
  
		/*
please write your name :
Ahmet
your name is : Ahmet
		 */
		
  
  

	}
		
}
