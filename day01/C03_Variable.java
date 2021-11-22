package day01;

public class C03_Variable {

	public static void main(String[] args) {
	
	int sayi1 = 10;
	int sayi2 = 20;
	
	String sayi3 = "10";
	String sayi4 = "40";
	
	System.out.println(sayi1 +sayi2); //30
	System.out.println(sayi1 +sayi3); //1010
	System.out.println(sayi1 + " "+sayi2);	//10 20
	System.out.println(sayi1 +" " +sayi2+sayi1);//10 2010	
	System.out.println(sayi1 +" " +(sayi2+sayi1));//10 30
		
		String harf1 ="A";
		char harf2 = 'A';
	
	System.out.println(sayi1+sayi2+harf2); //95 --> char returns an ASCII number 
	System.out.println(sayi1+sayi2+harf1); //30A
	
	System.out.println(harf1+sayi1+sayi2); //A1020 -->Concatenation yanyana yazdirir
	System.out.println(sayi1+harf1+sayi2); //10A20 -->Concatenation 
	
	
	}

}
