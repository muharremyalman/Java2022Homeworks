package arraysDemo;

public class Main {

	public static void main(String[] args) {
		String ogrenci1="Muharrem";
		String ogrenci2="Elif";
		String ogrenci3="Zekiye";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		
		System.out.println("---------");
		
		
		String[] ogrenciler = new String[3];
		ogrenciler[0]="Muharrem";
		ogrenciler[1]="Elif";
		ogrenciler[2]="Zekiye";
		
		
		for(int i=0;i<ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
		}
		
		System.out.println("---------");
		
		//Kodun diğer versiyonu
		for(String ogrenci:ogrenciler) {//ogrenciler dizisindeki her bir elemanı gez
			System.out.println(ogrenci);
		}

	}

}
