package mileumaatividades;

import java.util.Scanner;

public class Arceus3NOME2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String nome;
		int i = 0;
		
		System.out.print("Escreva o nome de usuário: ");
		nome = ler.next();
		
		while (i<10) {
			System.out.println(nome);
			i++;
		}
		ler.close();
	}

}
