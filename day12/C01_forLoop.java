package day12;

public class C01_forLoop {

	public static void main(String[] args) {
		   // Soru 2 ) 10 ile 30 arasindaki(10 ve 30 dahil) 
        //          sayilari aralarinda virgul olarak ayni satirda yazdirin
        
        for (int i = 10; i <= 30 ; i++) {
            if (i==30) {
                System.out.print( i );
            } else {
                System.out.print( i + ", ");
            }
            
        }
        System.out.println();// bos syso sadece alt satira gecmek icin kullanilir
        
        for (int i = 10; i <= 29 ; i++) {
            
                System.out.print( i + ", ");
            
            
        }
        System.out.println(30);
        //10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30
        //10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30

	}

}
