package beginner1013;

import java.lang.Math;
import java.util.Scanner;
public class Maior {
	public static void main(String[] args) {
		/**
		 * Faça um programa que leia três valores 
		 * e apresente o maior dos três valores lidos seguido da mensagem “eh o maior”. 
		 * Utilize a fórmula:
		 * MaiorAB = (a+b+abs(a-b))/2
		 * Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). 
		 * Um segundo passo, portanto é necessário para chegar no resultado esperado.
		 */
		try {
			Scanner input = new Scanner(System.in);
			int a = input.nextInt();
			int b = input.nextInt();
			int c = input.nextInt();
			
			int maiorAB =(a+b+Math.abs(a-b))/2;
			int maior = (maiorAB + c + Math.abs(maiorAB - c))/2; 
			System.out.println(maior+" eh o maior");
			input.close();
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
}
