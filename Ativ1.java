package maio08;

import java.util.Scanner;

public class Ativ1 {

	public static void main(String[] args) {

		String a [] = new String [5];

		Scanner ler = new Scanner(System.in);

		for (int i = 0; i<5; i++) {
			System.out.println("Informe um nome " + i+ "..:");
			a[i] = ler.next();
		}
		for (int i = 0; i<5; i++) {
			System.out.println(a[i]);
		}

		ler.close();











	}

}
