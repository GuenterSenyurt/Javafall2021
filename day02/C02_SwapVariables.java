package day02;

public class C02_SwapVariables {

	public static void main(String[] args) {
	
		
		// write a swap program that changes values of number1 and number2
		
		int number1= 20;
		int number2 = 34;
		
		int number3;
		
		int number4;
		number3 = number1;
		number4 = number2;
		
		number2 = number3;
		number1= number4;
		
		System.out.println("number1 : "+ number1); //number1 : 34
		System.out.println("number2 : "+ number2); //number2 : 20
		
		
		//alternative swap method 
		
		System.out.println("number1 : "+ ((number1-number2)+number2)); //number1 : 34
		System.out.println("number2 : "+ ((number2-number1)+number1)); //number2 : 20
		
		number1 = number1-number2+number2;
		number2 = number2-number1+number1;
		
		System.out.println(number1); //34
		System.out.println(number2); //20
	}

}
