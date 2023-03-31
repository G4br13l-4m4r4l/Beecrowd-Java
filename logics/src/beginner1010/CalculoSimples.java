package beginner1010;

import java.util.Scanner;
public class CalculoSimples {
	public static void main(String[] args) {
		/**
		 * Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, 
		 * o valor unitário de cada peça 1, o código de uma peça 2, 
		 * o número de peças 2 e o valor unitário de cada peça 2. 
		 * Após, calcule e mostre o valor a ser pago.
		 */
		Scanner input = new Scanner(System.in);
		int cod1 = input.nextInt();
		int qtd1 = input.nextInt();
		double prec1 = input.nextDouble();
		
		int cod2 = input.nextInt();
		int qtd2 = input.nextInt();
		double prec2 = input.nextDouble();
		
		double valor = (qtd1*prec1)+(qtd2*prec2);
		System.out.printf("VALOR A PAGAR: R$ %.2f%n",valor);
		input.close();
	}
}
