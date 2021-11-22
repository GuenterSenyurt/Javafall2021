package day16_scope_arrays;

import java.util.Iterator;

public class C02_LoopVariables {

	public static void main(String[] args) {

    int  sayi = 10;
    
   
    
    for (int i = 0; i < 6; i++) {
    	
    	String isim= "Ali";
    	System.out.println(sayi+ " "+ isim);
		
	}
		

	//System.out.println(isim);	 
	//System.out.println(i);	
    
    // Loop icerisinde olusturulan variable lar loop disinda kullanilamazlar
    // Bunun icin loop disinda da ihtiyacimiz olan bir degisken varsa 
    // loop tan once olusturulur ve emniyette kalmaki icin initialize yapariz
    
    
    for (int i = 0; i < 10; i++) {
		String isim = "Veli";
		System.out.println(isim);
		//int sayi = 100;  //duplicate 
	}
		
   //  System.out.println(isim);   //Hata verir 
	}

}
