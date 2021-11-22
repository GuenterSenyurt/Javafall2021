package day08;

public class C02_StringManipulations_EqualsIgnoreCase {

	public static void main(String[] args) {
		//equalsIgnorecase iki String i karsilastirirken
		//sadece icerige bakar, case sensitive degildir

		String str1= "ali";
		String str2= "can";
		String str3= "Ali Can";
		String str4= str1+" "+str2;
		
		System.out.println(str4); // ali can 
		System.out.println(str3==str4); // false 
		              // hem degerler hem de referanslari farkli
		System.out.println(str3.equals(str4)); //false
		                //degerler farkli
		
		System.out.println(str3.equalsIgnoreCase(str4)); //true
		     // icerik ayni, case sensitive degil
		
		

	}

}
