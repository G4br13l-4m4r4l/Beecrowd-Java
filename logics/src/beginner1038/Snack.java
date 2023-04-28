package beginner1038;

import java.util.Scanner;
public class Snack {
	public static void main(String[] args) {
		/**
		 * Com base na tabela abaixo, escreva um programa que leia 
		 * o código de um item e a quantidade deste item. 
		 * A seguir, calcule e mostre o valor da conta a pagar.
		 */
		
		Scanner input = new Scanner(System.in);
		int cod = input.nextInt();
		
		int quant = input.nextInt();
		double total = 0.0;
		switch(cod) {
			case 1:
				total = 4.00*quant;
				break;
			case 2:
				total = 4.50*quant;
				break;
			case 3:
				total = 5.00*quant;
				break;
			case 4:
				total = 2.00*quant;
				break;
			case 5:
				total = 1.50*quant;
				break;
		}
		System.out.printf("Total: R$ %.2f%n",total);
		input.close();
	}
}
