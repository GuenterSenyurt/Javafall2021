package day04;

public class C02_MathOperations {

	public static void main(String[] args) {
	
		int a = 20;
		int b = 40;
		
		String c = "ARD";
		String d = "BRT";
		String e = "WSA";
		
	System.out.println(a+b+c);//60ARD  
	
	System.out.println(a+d+b);//20BRT40
	
	System.out.println(c+d+a+b);//ARDBRT2040
	
	System.out.println(c+(a+b)+d);//ARD60BRT
		
	System.out.println(a*b+c);//800ARD
	
	System.out.println(d+b*a);//BRT800
	}

}
