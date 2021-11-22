package day07;

public class C02_NestedTernary {

	public static void main(String[] args) {
		// Soru2 : Kullanicidan bir harf isteyin
		// kucuk harf ise consola “Kucuk Harf” ,
		// buyuk harfse consola “Buyuk Harf”
		// yoksa “girdiginiz karakter harf degil” yazdirin.
		
		
		
		char karakter = '?';
		
		String sonuc = karakter>='a' && karakter <='z' ? "Kucuk harf": (karakter>='A' && karakter <='Z') ? "Buyuk harf" : "girilen karakter harf degildir"	;	
		
		System.out.println(sonuc);
		
		
		
		

	}

}
