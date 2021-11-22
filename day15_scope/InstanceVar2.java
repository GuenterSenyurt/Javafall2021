package day15_scope;

public class InstanceVar2 {
	
	 String adres="Ankara";
	    String dogumYeri;
	    double notOrtalamasi;
	    double yasOrt = 12.3;
	    char cinsiyet ='E';
	    char karakter;
	    boolean ogrenciMi=true;
	    boolean izinliMi;
	
	

	public static void main(String[] args) {

   //scope: instance variable lara main method dan direk ulasilabilir mi? HAYIR
		//nasil ulasilabilir ? OBJE olusturarak
		
		InstanceVar2 ali = new InstanceVar2();
		System.out.println(ali.adres); //Ankara
		System.out.println(ali.dogumYeri); //null
		System.out.println(ali.notOrtalamasi); //0.0
		System.out.println(ali.yasOrt); //12.3
		System.out.println(ali.cinsiyet); //E
		System.out.println(ali.karakter); // bosluk
		System.out.println(ali.ogrenciMi); //true
		System.out.println(ali.izinliMi); //false

	
		
		staticMethod();// 100.0
		
		// staticOlmayanMethod();  // static olmayan bir method main icerisinden direk olarak cagrilamaz
		                           // object ile cagrilabilir
		
		
		InstanceVar2 obje = new InstanceVar2();
		obje.staticOlmayanMethod(); // 99.0
		
		
}
	
	
public static void staticMethod() {	
	InstanceVar2 veli = new InstanceVar2();
	
	veli.notOrtalamasi=100;
	
	System.out.println(veli.notOrtalamasi);
	
	// staticOlmayanMethod();  //static bir method tan static olmayan bir methoda direk ulasilamaz
	

	InstanceVar2 obje2 = new InstanceVar2(); //static bir method icinden static olmayan bir methodu obje olusturarak cagirabiliriz
	obje2.staticOlmayanMethod(); //99.0

}

public void staticOlmayanMethod() {	
	
	InstanceVar2 hasan = new InstanceVar2();
	
	hasan.notOrtalamasi = 99;
	
	System.out.println(hasan.notOrtalamasi);
			
	

}

}
	
