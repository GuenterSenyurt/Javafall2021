package day08;

public class C04_Lenght_charAt {

	public static void main(String[] args) {

		 String str1 = "Ali Kahyaoglu";
	        System.out.println(str1.length()); //13
	        
	        System.out.println(str1.charAt(str1.length()-1));  //u
		
	        
		String str2 = "";
		System.out.println(str2.length()); // 0
		
		@SuppressWarnings("unused")
		String str3 = null;
		//System.out.println(str3.length()); //java.lang.NullPointerException
		
        //String str3 = null; null pointer olusturursak bunu simdi degil
		//daha sonra kullanacagimizi belirtmis oluruz.
		//Yani str3 olusturduk ama henuz deger atamadik ama atayacagiz sonra
		
		@SuppressWarnings("unused")
		String str4; //will be accepted but
		//System.out.println(str4.length()); hata verir, initialize etmek gerektigini yazar
		
		
	
	}

}
