package mileumaatividades;

import java.util.Scanner;

public class Arceus8MAIORIDA {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int idade, i = 1, valor = 0; 

		while (i<=20) {
			System.out.println("Insira a idade da " + i + "° pessoa: ");
			idade = ler.nextInt();
			i++;

			if (idade > 18) {
				valor++;
			}
		}
		System.out.println("A quantidade de pessoas maiores de idade é: " + valor);
		ler.close();
	}

}