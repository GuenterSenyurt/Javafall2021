package day04;

public class C01_MathOperations {

	public static void main(String[] args) {


		System.out.println(4*(2+5)/2); //14
		
		System.out.println(4*(2+5)/3); //9  the result is integer because all numbers are integer
		
		System.out.println(4*(2.0+5)/2); //14.0 the result is double because one number is double
		
		System.out.println(4*(2+5)/3.4); //8.23529411764706 result is double
		
		System.out.println(3.40000000/3.4); // 1.0 
		
		double result = (3+5)*44/11;
		
		System.out.println(result); //32.0 result is a double 
		// at first the mathematical operation is done
		// then will the result to variable result assigned as double
	
		System.out.println((double)5 *55); //275.0  casting (double casting--> number 5 has become a real numberk)
		System.out.println(5 *55); //275
		System.out.println(5.0 *55); //275.0
		

	}

}
