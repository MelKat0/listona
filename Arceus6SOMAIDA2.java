package mileumaatividades;

import java.util.Scanner;

public class Arceus6SOMAIDA2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int idade, soma = 0, i = 1; 

		while (i<=20) {
			System.out.println("Insira a idade da " + i + "° pessoa: ");
			idade = ler.nextInt();
			soma = soma + idade;
			i++;

		}
		System.out.println("A soma das idades é: " + soma);
		ler.close();
	}

}
