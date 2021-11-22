package day05;

public class C02_WrapperClass {

	public static void main(String[] args) {
		
		
		int sayi1 = 10;
		Integer sayi2 = 20;
		
		// sayi1. yazdigimizda hic bir method  cikmaz , cunku sayi1 primitive data type dir
		
        // sayi2.  yazdigimizda ise bircok method cikar , cunku sayi1 Integer olup Wrapper class data type dir.
		
		String tel1 = "3578987";
		String tel2 = "3245434";
		
		System.out.println(tel1 + tel2); // 35789873245434
		
		//eger bu sayilari toplamak istersek Wrapper class yardim eder
		
		System.out.println(Integer.valueOf(tel1)+Integer.valueOf(tel2)); //6824421 
		
		System.out.println(Integer.MIN_VALUE); //-2147483648
		System.out.println(Integer.MAX_VALUE); //2147483647
		System.out.println(Double.MAX_VALUE); // 1.7976931348623157E308
		System.out.println(Double.MIN_VALUE); // 4.9E-324
		System.out.println(Double.MAX_VALUE * Double.MIN_VALUE); //8.881784197001251E-16
		
		String caddeNo = "B203";
		String sokakNo = "1564";
		
		System.out.println(Integer.valueOf(caddeNo)+Integer.valueOf(sokakNo)); 
		// stops execution --> because there is NumberFormatException due to "B203"
		
		
		
		
	}

}
