package day15_scope;

public class InstanceVar {
	
	int notMat=50;
	int notFen; //ille de deger atamak gerekmez
	
	//instance variable larin scope unda main method yoktur
	//yani buraya main method tan direk olarak ulasilamaz
			

	public static void main(String[] args) {

     // System.out.println(notMat); //main method static oldugundan static olmayan variable
                                  //main method'da direk kullanilamaz ve direk goruntulenemez
		
     //main method tan instance variable a ulasmak icin obje olusturmak sarttir.
     
     // Scanner scan //scan is an object = new // new is a keyword Scanner(System.in);
     
     
     InstanceVar celil = new InstanceVar();
     System.out.println(celil.notMat); //50
     
     InstanceVar nihal = new InstanceVar();
     
     nihal.notMat = 70;
     
     System.out.println(nihal.notMat); //70
     
     System.out.println(celil.notMat); //50
     
     //celil in notunu degistirmek istiyorsak celil.notMat a deger atanmali
     
     celil.notMat= 90;
     
     System.out.println(celil.notMat);//90
     
     System.out.println(nihal.notMat); //70 hala degeri ayni ve 70 
     
     // method2(); //method2 static olmadigi icin main method dan direk cagrilamaz
     
     celil.method2(); //method2 deki notFen : 0
                      //method2'deki duzeltilmis notFen :100 
	}
	
	
	public static void staticMethod() {
		

	  //   System.out.println(notFen); //instance variable lara static method dan direk ulasilamaz	
	}


	public void method2() {

	     System.out.println("method2 deki notFen : "+notFen); //instance variable lara static olmayan methodlardan direk ulasilabilir
	     
	     notFen=100;
	     System.out.println("method2'deki duzeltilmis notFen :"+notFen);
	     
	}
	
	
	
	}
	
