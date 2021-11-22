package day16_scope_arrays;

public class C03_Arrays {

	public static void main(String[] args) {

		// soru 1-Elemanlari “Ali” , Veli”, Ayse” ve Fatma” olan bir array olusturun
		
		String arr[] = new String [4];
		arr[0]= "Ali";
		arr[1]= "Veli";
		arr[2]= "Ayse";
		arr[3]= "Fatma";
		
		String arr2[]= {"Ali","Veli","Ayse","Fatma"};
		
		System.out.println(arr); //[Ljava.lang.String;@762efe5d
		System.out.println(arr2); //[Ljava.lang.String;@71dac704
		
		
		arr[2]= "Hasan";
		arr[3]= "Fadil";
		
		System.out.println(arr[0]); // Ali
		System.out.println(arr[2]); // Hasan
		System.out.println(arr[3]); // Fadil
		
		//System.out.println(arr[arr.length]); 
		/*
		 Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
	at day16_scope_arrays.C03_Arrays.main(C03_Arrays.java:28)
		 
		 */
		System.out.println(arr[arr.length-1]); //Fadil
		
		
		
		
	}

}
