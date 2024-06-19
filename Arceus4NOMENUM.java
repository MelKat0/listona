package mileumaatividades;

import java.util.Scanner;

public class Arceus4NOMENUM {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		String nome;
		int num, i = 0, n;

		System.out.print("Digite um nome: ");
		nome = ler.next();
		System.out.print("Digite um número: ");
		num = ler.nextInt();
		System.out.print("Escreva a quantidade de repetições dos termos: ");
		n = ler.nextInt();

		while (i < n) {
			System.out.println(nome);
			System.out.println(num);
			i++;			
		}
		ler.close();
	}

}
