package day10;

public class C01_MethodCreation {

	public static void main(String[] args) {
		// Verilen iki sayinin toplamini ve carpimini 
		// yapip yazdiran iki ayri method olusturun.
		
		//method olusturmak icin  3 adim takip edelim:
		 //1. adim : method call yapalim
	
		// 2. adim : methoda argument yazacak miyiz? for ex. toplama(4,5) gibi
		int sayi1=44;
		int sayi2=54;
		
		toplama(sayi1,sayi2); //method call
		// 3. adim : 1. ve 2. adimi yaptiktan sonra Java'dan
		 // yardim alip method olustururuz. 
		
		carpma(sayi1,sayi2); //method call
		
		toplama(sayi1,sayi2); //Sayilarin toplami 98
		carpma(sayi1,sayi2); //Sayilarin carpimi 2376
		toplama(sayi1,sayi2);//Sayilarin toplami 98
		carpma(sayi1,sayi2);//Sayilarin carpimi 2376
	}

	public static void carpma(int m, int n) {
		//  method is created with parameters m and n 
		//4. adim erisimduzenleyici (access modifier) :public yaptik
		//ve return type a karar vermeliyiz : return type void kalabilir, sadece yazdirma istiyor
		System.out.println("Sayilarin carpimi "+ (m*n)); //Sayilarin carpimi 2376
		
	}

	public static void toplama(int x, int y) { // x ve y yerine sayi1 ve sayi2 de kullanabilirdik
		// method is created with parameters x and y 
		//4. adim erisimduzenleyici (access modifier) :public yaptik
		//ve return type a karar vermeliyiz : return type void kalabilir, sadece yazdirma istiyor
		System.out.println("Sayilarin toplami "+(x+y)); //Sayilarin toplami 98
	}

}
