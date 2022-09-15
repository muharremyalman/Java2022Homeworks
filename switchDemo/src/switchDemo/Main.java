package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'B';

		switch (grade) {
		case 'A':
			System.out.println("Mükemmel : Geçtiniz");
			break;
		case 'B':
			System.out.println("Çok Güzel : Geçtiniz");
			break;
		case 'C':
			System.out.println("İyi : Geçtiniz");
			break;
		case 'D':
			System.out.println("Fena Değil : Geçtiniz");
			break;
		case 'F':
			System.out.println("Maalesef : Kaldınız");
			break;
		default: // Bu harflerin dışında girerse
			System.out.println("Geçersiz Not Girdiniz");
			
			// Eclipse IDE FORMAT DOCUMENT CONTROL+SHIFT+F
			
			//Aynı Çıktı verilmek istenirse
			
			//case 'B':
			//case 'C':
			
		}
	}

}
