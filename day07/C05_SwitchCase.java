package day07;

import java.util.Scanner;

public class C05_SwitchCase {

	public static void main(String[] args) {
		// Gun numarasina gore haftaici veya haftasonu yazdirsin
		
		System.out.println("Haftanin gununu sayi olarak giriniz :");
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int SECENEK;
		
		if (a>=1 && a<=5) { SECENEK=1; 
			
		} else if ( a>=6 && a<=7) {SECENEK=2;

		} else {SECENEK=3;}
		
		
		switch (SECENEK) {
		case 1:  System.out.println("Haftaici");
			break;
		case 2 : System.out.println("Haftasonu");
			break;

		case 3 :System.out.println("Gecersiz gun");
			break;
		}

		/*
		 //gun numarasina gore hafta ici veya hafta sonu yazdiralim
		 //ALTERNTIF COZUM
        
        
        int gunNo=8;
        
        switch(gunNo) {
        
        case 1:         
        case 2: 
        case 3:
        case 4:
        case 5:
            System.out.println("Hafta Ici");
            break;
        case 6: 
        case 7:
            System.out.println("Hafta Sonu");
            break;
        default:
            System.out.println("Lutfen gecerli bir gun numarasi yaziniz");
        
        }
    }
}
		 
		 
		 
		 
		 
		 
		 
		 */
		
		
		
	}

}
