package mileumaatividades;

import java.util.Scanner;

public class Arceuss10MAIOROIT2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int num, i = 0, n = 0; 

		while (i<20) {
			System.out.println("Insira um valor: ");
			num = ler.nextInt();
			i++;

			if (num>8) {
				n++;
			}
		}
		System.out.println("O número de valores abaixo de 8 é: " + n);
		ler.close();
	}

}
