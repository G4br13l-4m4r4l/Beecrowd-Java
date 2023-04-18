package beginner1036;

import java.util.Scanner;
public class Bhaskara {
	public static void main(String[] args) {
		/**
		 * Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara. 
		 * Se não for possível calcular as raízes, mostre a mensagem correspondente “Impossivel calcular”, 
		 * caso haja uma divisão por 0 ou raiz de numero negativo.
		 */
		Scanner input = new Scanner(System.in);
		double A = input.nextDouble();
		double B = input.nextDouble();
		double C = input.nextDouble();
		
		input.close();
	}
}
