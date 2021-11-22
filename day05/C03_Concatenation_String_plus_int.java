package day05;

public class C03_Concatenation_String_plus_int {

	public static void main(String[] args) {
		String str1 = "Java";
		String str2 = "Guzel";
		int sayi1 = 5;
		int sayi2 = 4;
		
		
		System.out.println(str1+" "+ str2 + " " + sayi2+ sayi1); //Java Guzel 45
		
		System.out.println(""+ sayi1 +sayi2); //54
		
		System.out.println(str1+ " "+ (sayi1+sayi2)+sayi2); // Java 94
		
		System.out.println(str1 + " " + (sayi1-sayi2)+(sayi1+sayi2));  //Java 19
		
		System.out.println(""+ sayi1 +sayi2+ " "+ str2); //54 Guzel

	}

}
