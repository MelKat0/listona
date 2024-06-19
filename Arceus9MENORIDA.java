package mileumaatividades;

import java.util.Scanner;

public class Arceus9MENORIDA {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		String nome, nomenovo = "";
		int idade, idadenovo = Integer.MAX_VALUE, i=1; 

		while (i<=10) {
			System.out.println("Insira a idade da " + i + "° pessoa: ");
			idade = ler.nextInt();
			System.out.println("Insira o nome da " + i + "° pessoa: ");
			nome = ler.next();

			if (idade <idadenovo) {
				idadenovo = idade;
				nomenovo = nome;
			}
			i++;
		}
		System.out.println("A pessoa mais nova é: " + nomenovo);
		ler.close();
	}

}