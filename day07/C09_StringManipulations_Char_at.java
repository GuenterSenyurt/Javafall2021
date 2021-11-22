package day07;

import java.util.Locale;

public class C09_StringManipulations_Char_at {

	public static void main(String[] args) {
		
	String kurs = "Techproeducation";
	System.out.println(kurs.charAt(12)); //t 
	System.out.println(kurs.charAt(0)); // T
	
	System.out.println(kurs.toLowerCase());//techproeducation
	
	String isim = "aLI";
	//bunu Ali olarak yazdiralim.
	System.out.println(""+ isim.toUpperCase().charAt(0)+ isim.toUpperCase().charAt(1)+ isim.toLowerCase().charAt(2)); // Ali
	System.out.println(isim.toLowerCase(Locale.forLanguageTag("tr"))); //al?
	
	System.out.println(isim.toUpperCase().charAt(0)+ isim.toUpperCase().charAt(1)+ isim.toLowerCase().charAt(2)); //246 
	 //because each entity is a character and they add up like numbers here, not char or String 

	}

}
