package day16_scope_arrays;

import java.util.Arrays;

public class C04_Arrays {

	public static void main(String[] args) {

   int arr[] = {2,4,5,6,78,89};
   
   //yukaridaki array in tum elementleri yazdiralim
   
   
   for (int i = 0; i < arr.length; i++) { 
	System.out.print(arr[i]+" "); //2 4 5 6 78 89
	
	
}
   System.out.println();
   
   System.out.println(Arrays.toString(arr)); //	[2, 4, 5, 6, 78, 89]
		

	}

}
