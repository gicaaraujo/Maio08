package maio08;

import java.util.Scanner;

public class Ativ3 {

	public static void main(String[] args) {

		int a[] = new int [5];
		int b[] = new int [5];
		int c[] = new int [10];

		Scanner ler = new Scanner(System.in);


		for (int i = 0; i<5; i++) {
			System.out.println("Informe um valor do vetor A: " +i);
			a[i] = ler.nextInt();
		}

		System.out.println("Seus valores foram guardados no vetor A ");

		for (int i = 0; i<5; i++) {
			System.out.println("Informe um valor do vetor B: " +i);
			b[i] = ler.nextInt();
		}
		for (int i = 0; i<5; i++) {
			c[i] = a[i];
			c[i+5] = b[i];
		}
		for (int i = 0; i<10; i++) {
			System.out.println( c[i]);
		}


		ler.close();
	}

}
