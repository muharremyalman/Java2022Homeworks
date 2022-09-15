package loopDemo;

public class Main {

	public static void main(String[] args) {
		//For
		for(int i=1;i<=10;i++) {//i=i+1 veya i++ bir arttır demektir. Sayaç 1 den başla; i 10 dan küçük olduğu sürece; birer arttır; i+=2 2şer arttır vs.
			System.out.println(i); // i 10'a gelene kadar döngü devam eder, tekrar gider 11 10dan büyük mü döngü dışına çıkar kod varsa çalışmaya devam eder.
		}
		System.out.println("For Döngüsü Bitti");
		
		int i = 1;
		
		//While
		while(i<10) {
			System.out.println(i);
			i++; // i+=2 tek sayıları yazdırırdım. 1den 9a kadar sayar 
		}
			System.out.println("While Döngüsü Bitti");
		
			//Do-While
			int j = 100;
			do {
				
					System.out.println(j);
					j+=2; 
					
				}while(j<10);
			System.out.println("While Döngüsü Bitti");
			//Do- While ile While döngüsü farkı while döngüsünde şart çalışırsa bloğa girer
	}

}
