package day03;

public class C02_DataCasting_AutoWidening {

	public static void main(String[] args) {
		
		byte sayi1 = 44;
		short sayi2 = sayi1; //Data casting from byte to short --> AUTO WIDENING, no problem
		System.out.println("sayi2 : "+sayi2); //sayi2 : 44
		
		int sayi3 = 55;
		double sayi4 = sayi3; //Data casting from int to double --> AUTO WIDENING, no problem, but double has 
		System.out.println("sayi4 : "+sayi4); //sayi4 : 55.0
		
		

	}

}
