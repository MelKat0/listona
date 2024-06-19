package mileumaatividades;

import java.util.Scanner;

public class Arceus5SOMAUSU {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int num,soma = 0;

		for (int i = 0; i<10; i++) {
			System.out.println("Digite um número: ");
			num = ler.nextInt();
			soma = soma + num;
		}
		System.out.println("A soma dos valores é: " + soma);
		ler.close();
	}

}
