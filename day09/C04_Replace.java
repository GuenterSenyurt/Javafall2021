package day09;

public class C04_Replace {

	public static void main(String[] args) {
		
		String str = "Java ogrenmek cok zevkli";
		
		System.out.println(str.replace(" ","")); //Javaogrenmekcokzevkli
		
		System.out.println(str.replace("ogrenmek", "kod yazmak")); //Java kod yazmak cok zevkli
		
		System.out.println(str.replace("e","a")); //Java ogranmak cok zavkli

	}

}
