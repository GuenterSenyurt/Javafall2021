package day07;

public class C08_StringManipulations_concat {

	public static void main(String[] args) {
		
       //Concatenation : isim.concat(soysim) gibi..		
	
		String isim = "Ali";
		String soyisim = "Can";
		Integer x = 111;
		
		System.out.println(isim + ""+ soyisim); //AliCan
		System.out.println(isim + " "+ soyisim); //Ali Can
		System.out.println(isim.concat(soyisim)); //AliCan
		System.out.println(isim.concat(" ").concat(soyisim));// Ali Can
		System.out.println(isim.concat(" ").concat(soyisim).concat(" ").concat(x.toString()));//Ali Can 111
	}

}
