package day11;

public class C03_MethodOverloading {

	public static void main(String[] args) {
		
		//Java'da ayni isimde birden fazla method olur mu? -YES,yes,yes
		//Java birkac ayni isimdeki methodlardan hangisini kullacagini nereden bilir?: 
		//Once isimleri ayni olan methodlarin argument sayisina bakar 
		//Sonra argument parametre eslesmesine bakar
		//sonra en optimum eslesmeyi yapar
		//OVERLOADING:ismi ayni fakat parametreleri farkli olan methodlar olusturmaya denir
		//a.substring(1), a.substring(2,5) gibi
		//METHOD SIGNATURE: methodun ismi, parametrelerin sayisi ve siralanisi
		    // 1. Method name
		    // 2. number of method parameters 
		    // 3. the order of parameters
		
		//Eger 2 veya 3 degistirilirse ama 1 ayni kalmak sartiyla -->OVERLOADING
		//Eger 1,2 ve 3 degistirilirse --> CHANGE OF METHOD SIGNATURE
		   
		   
		
		int sayi1 = 4;
		int sayi2 = 5;
		int sayi3 = 10;
		int sayi4 = 20;
				
		topla(2,4);
		

	}

	private static void topla(int sayi1, int sayi2, int sayi3, int sayi4) {
		System.out.println("dort sayinin toplami : "+(sayi1+sayi2+sayi3+sayi4));
		
	}

	private static void topla(int sayi1, int sayi2, int sayi3) {
		System.out.println("uc sayinin toplami : "+(sayi1+sayi2+sayi3));
		
	}

	private static void topla(int sayi1, double sayi2) {
		System.out.println("iki sayinin toplami id : "+(sayi1+sayi2));
		
	}
	private static void topla(int sayi1, int sayi2) {
		System.out.println("iki sayinin toplami ii : "+(sayi1+sayi2));
		
	}
	
	private static void topla(double sayi1, int sayi2) {
		System.out.println("iki sayinin toplami di : "+(sayi1+sayi2));
		
	}
	private static void topla(double sayi1, double sayi2) {
		System.out.println("iki sayinin toplami dd: "+(sayi1+sayi2));

}}
