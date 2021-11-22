package day09;

public class C06_Regex_Regular_Expressions {

	public static void main(String[] args) {
		
		String cumle = "Java     coooook          zevkli";
		cumle =cumle.replaceAll("\s+"," ");
		
		System.out.println(cumle); //Java coooook zevkli
		
		cumle = cumle.replaceAll("[A-Z]", "");
		
		System.out.println(cumle);
		
		String cumle2 = "DENSIZLER ORDUSU gibi";
		
		cumle2 = cumle2.replaceAll("[A-L]", "");
		
		System.out.println(cumle2); //NSZR ORUSU gibi
	}

}
