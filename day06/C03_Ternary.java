package day06;

public class C03_Ternary {

	public static void main(String[] args) {

    int x = 10;
    
     String tekmiciftmi = x%2 == 0 ? "Cift sayi" : "Tek sayi";
     System.out.println(tekmiciftmi); //Cift sayi
     
     System.out.println(x%2 == 0 ? "Cift sayi" : "Tek sayi"); //Cift sayi
     
     //ternary iki turlu kullanilabilir
     //ya donen sonuca gore bir var olusturulup assign edilir
     //veya direk syso icine yazilip sonucu yazdiririz
     
     
     
     
     //eger ternary de donecek sonuclar ayni data turunden degilse
     //atama yapamayiz, sadece syso ile yazdirabiliriz
     System.out.println(x>5 ? "Aferin" : 4); //Aferin
     
     //String sonuc = x>5 ? "Aferin" :4;   //bu kod calismaz
     
     
     
     

	}

}
