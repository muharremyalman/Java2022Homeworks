package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);
		
		System.out.println("Eleman saayısı : "+mesaj.length());
		System.out.println("5. eleman : "+mesaj.charAt(4)); //5.eleman
		System.out.println(mesaj.concat(" Yaşasın!")); //... Yaşasın!
		System.out.println(mesaj.startsWith("B")); //True False
		System.out.println(mesaj.endsWith(".")); //true false
		char[] karakterler = new char[5];
		mesaj.getChars( 0,  5, karakterler,0); //void operasyon karakter verir
		System.out.println(mesaj.indexOf("av"));//mesaj içerisinde av kacıncı yerde ilk buldugu
		System.out.println(mesaj.lastIndexOf("a"));//sondan
		
		
	}

}
