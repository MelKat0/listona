package mileumaatividades;

import java.util.Scanner;

public class Arceus3NOME {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		String nome;

		System.out.print("Escreva o nome de usuário: ");
		nome = ler.next();

		for (int i = 0; i<10; i++) {
			System.out.println(nome);
		}
		ler.close();
	}

}
