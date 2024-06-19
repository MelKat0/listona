package mileumaatividades;

import java.util.Scanner;

public class Arceus8MAIORIDA2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int idade, valor = 0; 

		for (int i = 1; i <=20; i++) {
			System.out.println("Insira a idade da " + i + "° pessoa: ");
			idade = ler.nextInt();

			if (idade > 18) {
				valor++;
			}
		}
		System.out.println("A quantidade de pessoas maiores de idade é: " + valor);
		ler.close();
	}

}