package day16_scope_arrays;

public class C01_LocalVariables {
	
	String okulIsmi;
	
	

	public static void main(String[] args) {
		
		// Java local variable'lara default deger atamasi yapmaz
		//Kodlarimizda sorun yasamamak icin
		//olusturdugumuz local variable lara uygun bir deger atamamizda fayda var
		
		
		int sayi = 0;
		System.out.println(sayi); //0
		
		
		
		//int sayi;       //bir local de ayni isimde birden fazla variable olusturulamaz
		//String sayi;    //data turu farkli olsa da Java buna izin vermez
		
		
		@SuppressWarnings("unused")
		String herhangibirsey; // I know that I did not use the String variable herhangibirsey
		String isim = "Ali";
		System.out.println(isim); //Ali
		
		 staticMethod(); // Veli

	}

	public static void staticMethod() {
		
	//	sayi; //bir localde olusturulan variable (method larin static olup olmamasina 
		       //bagli olmaksizin farkli localde kullanilamaz
		
		String isim = "Veli";  //isim isminde String variable ikinci kez kullandik
		                        // Java itiraz etmedi
		System.out.println(isim);
	
	}
	
}
