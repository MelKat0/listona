package mileumaatividades;

import java.util.Scanner;

public class Arceus6SOMAIDA {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int idade, soma = 0; 

		for (int i = 1; i<=20; i++) {
			System.out.println("Insira a idade da " + i + "° pessoa: ");
			idade = ler.nextInt();
			soma = soma + idade;

		}
		System.out.println("A soma das idades é: " + soma);
		ler.close();
	}

}
