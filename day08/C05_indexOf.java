package day08;

public class C05_indexOf {

	public static void main(String[] args) {

    //Verilen String'te istenen karakterin kullanildigi ilk index'i yazdirir
		
		String str = "Calisan JAVA ogrenebilir";
		System.out.println(str.indexOf(str)); //0 
		// 0.ci yerde demektir
		System.out.println(str.indexOf('s')); //4
		// 4.cu konumda demektir
		System.out.println(str.indexOf('J')); //8
		 // 8.ci konum 
		
		int index = str.indexOf("g"); 
		System.out.println(index); //14
             // indexOf() methodu her zaman int degerini doner

		int index2 = str.indexOf("z"); 
		System.out.println(index2); // -1 
		    //Bir String icinde olmayan bir karakter veya String parcasi
		    //ararsak Java -1 sonucunu yazdirir
		
		int index3 = str.indexOf("zzz"); 
		System.out.println(index3); // -1
		
		int index4 = str.indexOf("araba"); 
		System.out.println(index4); // -1 
		// char sequence can also be asked
		// the first character of the sequence will be returned
		 
		int index5 = str.indexOf("Calisan"); 
		System.out.println(index5); // 0 
		
		int index6 = str.indexOf("JAVA"); 
		System.out.println(index6); //8 
		
		int index7 = str.indexOf("e",11); 
		System.out.println(index7); //16 
		
		int index8 = str.indexOf("e",17); 
		System.out.println(index8); //18
		
		int index9 = str.indexOf("",17); 
		System.out.println(index9); //17
		
		int index10 = str.indexOf(""); 
		System.out.println(index10); // 0
		
		int index11 = str.indexOf("i",5); 
		System.out.println(index11); //20
		     // looks for i after the 5th character and
		    // finds it in the 20 th place
	}

}
