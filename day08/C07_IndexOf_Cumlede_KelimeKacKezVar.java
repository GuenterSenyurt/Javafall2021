package day08;

import java.util.Scanner;

public class C07_IndexOf_Cumlede_KelimeKacKezVar {

	public static void main(String[] args) {
		
		    Scanner scan=new Scanner(System.in);
	        System.out.println("Lutfen bir cumle giriniz");
	        
	        String cumle=scan.nextLine();
	        System.out.println("Lutfen varligini kontrol etmek icin bir kelime giriniz");
	        String kelime=scan.next();
	        int index = cumle.indexOf(kelime);
	        
	        if (index<0) {
	        	System.out.println("Girilen kelime cumlede yok.");
	        }else if (cumle.indexOf(kelime, index+(kelime.length()))<0) {
	        	
	        	//(kelime.length() yerine sadece 1 yazabilirdik
	        	//cumle.indexOf(kelime, index+1))<0 yazilabilirdi
		
		    System.out.println("Girilen kelime cumlede 1 kez kullanilmis.");

	}else System.out.println("girilen kelime birden fazla kullanilmis.");
	        
	        scan.close();

}}
