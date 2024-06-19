package mileumaatividades;

import java.util.Scanner;

public class Arceuss10MAIOROIT {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int num, n = 0; 

		for (int i = 0; i<20; i++) {
			System.out.println("Insira um valor: ");
			num = ler.nextInt();

			if (num>8) {
				n++;
			}
		}
		System.out.println("O número de valores abaixo de 8 é: " + n);
		ler.close();
	}

}
