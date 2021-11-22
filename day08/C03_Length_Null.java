package day08;

public class C03_Length_Null {

	@SuppressWarnings("null")
	public static void main(String[] args) {


		String isim = "";
		System.out.println(isim.length()); // 0
		
		String isim1 = null;
		System.out.println(isim1.length());  // NullPointerException
		//Exception in thread "main" java.lang.NullPointerException
		//at day08.C03_Length_Null.main(C03_Length_Null.java:12)
		
		//String isim2;
		//System.out.println(isim2.length());  // isim2 must be initialized first or it wont work
		
       
	}

}
