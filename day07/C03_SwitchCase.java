package day07;

public class C03_SwitchCase {

	public static void main(String[] args) {
		// gun numarasina gore gun isimlerini yazdiralim
		
		int gunNO = 2;
		
		switch (gunNO) {
		case 1: System.out.println("Pazartesi");
		case 2: System.out.println("Sali");
		case 3: System.out.println("Carsamba");
		case 4: System.out.println("Persembe");
		case 5: System.out.println("Cuma");
		case 6: System.out.println("Cumartesi");
		case 7: System.out.println("Pazar");
			break;

		default:
			break;
		}

		/*
		Sali
		Carsamba
		Persembe
		Cuma
		Cumartesi
		Pazar
		*/
	}  
	

}
