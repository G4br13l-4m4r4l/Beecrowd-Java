package beginner1036;

import java.util.Scanner;
public class Bhaskara {
	public static void main(String[] args) {
		/**
		 * Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara. 
		 * Se não for possível calcular as raízes, mostre a mensagem correspondente “Impossivel calcular”, 
		 * caso haja uma divisão por 0 ou raiz de numero negativo.
		 * x = (-b ± √(b² – 4ac)) / (2a)
		 */
		Scanner input = new Scanner(System.in);
		double A = input.nextDouble();
		double B = input.nextDouble();
		double C = input.nextDouble();
		
		double delta = Math.pow(B, 2)-(4*A*C);
		double R1 = (-B + Math.sqrt(delta))/(2*A);
		double R2 = (-B - Math.sqrt(delta))/(2*A);
		
		if(delta>0 && A!=0) {
			System.out.printf("R1 = %.5f%n", R1);
			System.out.printf("R2 = %.5f%n", R2);
		}else {
			System.out.println("Impossivel calcular");
		}
		input.close();
	}
}
