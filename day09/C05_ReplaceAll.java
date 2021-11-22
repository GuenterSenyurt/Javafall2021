package day09;

public class C05_ReplaceAll {

	public static void main(String[] args) {

    String str = "*Java 98ogrenmek c..ok k876olay";
    
    // replaceAll methoduyla "Java ogrenmek cok kolay yazdiralim"
    // regex Regular expressions kullanalim 
    
    str = str.replaceAll("\\d", "");
    
    System.out.println(str); //*Java ogrenmek c..ok kolay
    
    str=str.replaceAll("\\s", "x"); //*Javaxogrenmekxc..okxkolay
		
    System.out.println(str); 
    
    str = str.replaceAll("\\W", "");
    
    System.out.println(str); //Javaxogrenmekxcokxkolay
    
    str = str.replace("x", " ");
    
    System.out.println(str); //Java ogrenmek cok kolay
    
	}

}
