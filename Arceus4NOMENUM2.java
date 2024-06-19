package mileumaatividades;

import java.util.Scanner;

public class Arceus4NOMENUM2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String nome;
		int num, n;
		
		System.out.print("Digite um nome: ");
		nome = ler.next();
		System.out.print("Digite um número: ");
		num = ler.nextInt();
		System.out.print("Escreva a quantidade de repetições dos termos: ");
		n = ler.nextInt();
		
		for (int i = 0; i<n; i++) {
			System.out.println(nome);
			System.out.println(num);			
		}
		ler.close();
	}

}
