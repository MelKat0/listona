package mileumaatividades;

import java.util.Scanner;

public class Arceus5SOMAUSU2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num,soma = 0, i = 0;
		
		while(i<10) {
			System.out.println("Digite um número: ");
			num = ler.nextInt();
			soma = soma + num;
			i++;
		}
		System.out.println("A soma dos valores é: " + soma);
		ler.close();
	}

}
