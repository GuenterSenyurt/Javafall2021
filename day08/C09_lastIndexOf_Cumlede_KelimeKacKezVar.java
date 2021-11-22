package day08;

import java.util.Scanner;

public class C09_lastIndexOf_Cumlede_KelimeKacKezVar {

	public static void main(String[] args) {


	    Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        
        String cumle=scan.nextLine();
        System.out.println("Lutfen varligini kontrol etmek icin bir kelime giriniz");
        String kelime=scan.next();
        int ilkindex = cumle.indexOf(kelime);
        int sonindex = cumle.lastIndexOf(kelime);
        
        if (ilkindex==-1) {
        	System.out.println("Girilen kelime cumlede yok.");
        }else if (ilkindex == sonindex) {
        	//Yani kelime cumlede tek birkez kullanilmis
        	System.out.println("Girilen kelime cumlede 1 kez kullanilmis.");
        	
        }else System.out.println("girilen kelime birden fazla kullanilmis.");
        
        scan.close();
		
		
		
		

	}

}
