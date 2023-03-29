package beginner1007;

import java.util.Scanner;
public class Diferenca {

	public static void main(String[] args) {
		/**
         * Leia quatro valores inteiros A, B, C e D. A seguir, 
         * calcule e mostre a diferença do produto de A e B pelo produto 
         * de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
         */
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d = input.nextInt();
		
		
		int dif = ((a*b)-(c*d));
		input.close();
		
		System.out.println("DIFERENCA = "+ dif);
	}
}
