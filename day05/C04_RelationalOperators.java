package day05;

public class C04_RelationalOperators {

	public static void main(String[] args) {

    System.out.println(6*6<6); //false
		
    System.out.println(23<=66); //true
    
    System.out.println(6*6<6 && 23<=66); //false
    
    System.out.println((6*6<6) && (23<=66)); //false
    
    System.out.println(6*6<6 || 23<=66); //true
    
    System.out.println(! (6*6<6 && 23<=66)); //true
    
    System.out.println(!! (6*6<6 && 23<=66)); //false
    
    System.out.println(!!! (6*6<6 && 23<=66)); //true
    
    // && ile & ayni isi görür ama aralarinda nuans vardir
    //&& olursa ilk false ifadeyi görür görmez islemi sonlandirir false yazar
    //& olursa sonuna dek gider yani daha fazla zaman harcar
    
    System.out.println((6*6<6) && (23<=66) && false); //false
    System.out.println((6*6<6) & (23<=66) & false); //false
    
    System.out.println(7 & 14); //6  00111 & 01110 = 00110 = 6 //bitwise operation
    System.out.println(7 & 10); //2  00111 & 01010 = 00010 = 2
    
    //System.out.println(7 && 14); does not work because &&
    
    System.out.println('A' & 'g'); //65  //'A' ASCII = 65 =  00100001, g = 103 = 01100111 --> sonuc = 00100001 = 65 
    System.out.println('h' & 14); //8   // 'h' ASCII = 104 = 01101000 , 14 = 00001110 --> 00001000 = 8
    
    System.out.println('a'<'c'); //true
    
	}

}
