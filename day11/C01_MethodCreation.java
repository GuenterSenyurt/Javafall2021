package day11;

import java.util.Scanner;

public class C01_MethodCreation {

	public static void main(String[] args) {
		// Kullanici ismini ve soyismini girsin
		//iki farkli method olusturun 
		//methodlardan biri girilen kelimeleri birlestirsin:
		//Basharf büyük digerleri kücük olarak birlestirsin
		//diger method isim ve soyisminin ilk harfaleri buyuk digerleri yildiz olarak birlestirsin
		//kullanici isminin acik mi gizli mi yazilmasini istiyor?
		//ve programda kalan kisimda isim ve soyisim kullanicinin istedigi sekilde kullanin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen once isim ve sonra soyisim girin \nsonra enter a basin");
		
		String isim= scan.next();
		String soyisim= scan.next();
		
		System.out.println("Isminizin acik sekilde yazilmasini istiyorsaniz 1\n"
				+ " gizli kalsin istiyorsaniz 2 yaziniz.");
		
		int tercih = scan.nextInt();
		String birlesmisIsim=null; //Emrah Saglam, E**** S*****
		//String bir degiskenin kalibini olusturuyoruz ama ici bos, biz biliyoruz icinin  bos oldugunu
		//cunku daha sonra dolduracagiz
		
		if (tercih ==1) {
			birlesmisIsim = acikIsim(isim, soyisim);
			
		} else if (tercih==2) {
			birlesmisIsim =isimGizle(isim, soyisim);
		}else System.out.println("Lutfen 1 veya 2 yi seciniz.");
		
		//Bu satirdan itibaren kullanicinin isim ve soyismi kullanici tercihine bagli olarak kaydedildi
		
		System.out.println("kullanicin tercihi : "+birlesmisIsim);
		//Bu kod gerekli degil, sadece methodlar istedigimiz isi yapiyor mu gormek icin yazildi
		
	}

	public static String isimGizle(String isim, String soyisim) {
		isim=isim.substring(0, 1).toUpperCase()+ isim.substring(1).replaceAll("\\w", "*");
		soyisim=soyisim.substring(0, 1).toUpperCase()+ soyisim.substring(1).replaceAll("\\w", "*");
		return isim +" "+soyisim;
		
		
	}

	public static String acikIsim(String isim, String soyisim) {
		
		isim=isim.substring(0, 1).toUpperCase()+ isim.substring(1).toLowerCase();
		soyisim=soyisim.substring(0, 1).toUpperCase()+ soyisim.substring(1).toLowerCase();
		
		return isim +" "+soyisim;
		
		
	}

}
