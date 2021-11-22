package day08;

public class IntegertoBinaryString {

	public static void main(String[] args) {
		
		
		int x=7;
				
		int y=14;
		

		System.out.println(Integer.toBinaryString(x));     // 0111
		System.out.println(Integer.toBinaryString(y));     // 1110
		
        System.out.println(Integer.toBinaryString(x & y));  // 0110
        System.out.println(x &y); // 6 = 0110
	}

}
