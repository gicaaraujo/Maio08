package maio08;

import java.util.Scanner;

public class Ativ2 {

	public static void main(String[] args) {

		int a[] = new int [5], numero, soma=0;

		Scanner ler = new Scanner(System.in);

		for(int i=0; i <= 4; i++) {
			System.out.println("Informe um número: " +i );
			a[i] = ler.nextInt();
			soma= soma+a[i];
			System.out.println("O resultado da soma é: " + soma);
		}
		if ( soma >15) {
			System.out.println(" O resultado é maior que 15. ");
		}
		else if ( soma ==15) {
			System.out.println(" O resultado é igual a 15. ");
		}
		else {
			System.out.println("O resultado é menor que 15. ");


		}













	}

}
