package day03;

public class C03_DataCasting_ExplicitNarrowing {

	public static void main(String[] args) {


		int sayi1 = 32767;
		
		short sayi2 = (short) sayi1; //Add cast to short, explicit narrowing
		
		System.out.println(sayi2); //32767 is the maximum number without error
		
		
		

	}
	

}
