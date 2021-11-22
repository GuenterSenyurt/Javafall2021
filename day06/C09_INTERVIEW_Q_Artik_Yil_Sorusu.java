package day06;

import java.util.Scanner;

public class C09_INTERVIEW_Q_Artik_Yil_Sorusu {

	public static void main(String[] args) {
		
		//Kullanici bir yil girsin
		//Kural 1 : 4 ile bolunemeyen yillar artik yil degildir
		//Kural 2 : 4 ile bolunup 100 ile bolunemeyen yillar artik yildir
		//Kural 3 : 4 un kati olup 100 ile bolunebilen yillardan sadece
		// 400 ile bolunebilen yillar artik yildir
		
	
		
		   Scanner scan = new Scanner(System.in);
			
			System.out.println("Bir yil girin ve artik yil mi oldugunu test edin :"); 
			
			int yil = scan.nextInt();
			
			/*
			if (yil%4 !=0) {System.out.println("Girdiginiz yil "+ yil+ " artik yil degildir!");
				
			} 
			 if (yil%4 ==0 && yil%100 !=0) {System.out.println("Girdiginiz yil "+ yil+ " artik yildir!");
					
				} 
			 if (yil%4 ==0 && yil%100 ==0) {
				if (yil%400 ==0) {System.out.println("Girdiginiz yil "+ yil+ " artik yildir!");
					
				} else {System.out.println("Girdiginiz yil "+ yil+ " artik yil degildir!");

				}
			}
	         */
			
			artikYil(yil);
		
			
			scan.close();
			
			
			
	}



	public static void artikYil(int yil) {
		
		if (yil%4 != 0) {System.out.println("Girdiginiz yil "+ yil+ " artik yil degildir!\n"+
		             "Cunku bu yil 4 ile bolunemiyor.\n"+
				"//1. Kural");
		//1. kurali sagliyor
		
		} 
		 if (yil%4 ==0 && yil%100 !=0) {System.out.println("Girdiginiz yil "+ yil+ " artik yildir!\n"+
		      "Cunku bu yil 4 ile bolunebiliyor ve 100 ile bolunemiyor.\n"+
				 "//2. Kural");
		//2. kurali sagliyor
			} 
		 if (yil%4 ==0 && yil%100 ==0) {
			if (yil%400 ==0) {System.out.println("Girdiginiz yil "+ yil+ " artik yildir!\n"+
		     "Cunku bu yil 4 ve 100 ile bolunebiliyor ve ayni zamanda 400 ile bolunebiliyor.\n"+
					"//3. Kural");
				
			} else {System.out.println("Girdiginiz yil "+ yil+ " artik yil degildir!\n"+
			 "Cunku bu yil 4 ve 100 ile bolunebilmesine ragmen 400 ile bolunemiyor.\"+"
			 + "//3. Kural");
        //3. kurali sagliyor
			}
		}
		
		
	}
	
		 
	}
	

