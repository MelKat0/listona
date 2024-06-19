package mileumaatividades;

import java.util.Scanner;

public class Arceus7MEDIAIDA {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int idade, soma = 0, media = 0; 

		for (int i = 1; i<=20; i++) {
			System.out.println("Insira a idade da " + i + "° pessoa: ");
			idade = ler.nextInt();
			soma = soma + idade;

		}
		media = soma/20;
		System.out.println("A média das idades é: " + media);
		ler.close();
	}

}