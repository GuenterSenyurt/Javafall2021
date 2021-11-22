package day08;

public class C01_INTERVIEW_Q_StringManipulations_equals {

	public static void main(String[] args) {


	String s = "wertz";
	
	if ("wertz".equals(s)) {System.out.println(100);} //100
		
	else System.out.println(500);
		
	String m = "wertz"+"";
	
	if ("wertz".equals(s)) {System.out.println(100);} //100
	
	else System.out.println(500);
	
	if (s==m) {System.out.println(100);} //100
	
	else System.out.println(500);
	
	String str1= "Ali";
	String str2= "Can";
	String str3= "Ali Can";
	String str4= str1+" "+str2;
	
	System.out.println(str4); // Ali Can
	
	/////////////////INTERVIEW QUESTION ////////////////////////
	System.out.println(str3==str4);        //false
	                   // because str3 and str4 are different objects, they have different references
	System.out.println(str3.equals(str4)); //true
	                   //same values looks only into values not their references..
	
	//String variable'larda  == hem degere hem de referansina bakar,
	//dolayisiyla objeler farkli oldugunda genelde false doner
	//str1.equals(str2) ise referanslara degil SADECE DEGERE bakar,
	//eger case sensitive olarak String degerleri ayni ise true doner
	
	
	
	
	}

}
