package beginner1004;

import java.util.Scanner;
public class Simple_product {

	public static void main(String[] args) {
		
		/**
		 * Leia dois valores inteiros. 
		 * A seguir, calcule o produto entre estes dois valores e atribua esta operação à variável PROD. 
		 * A seguir mostre a variável PROD com mensagem correspondente. 
		 */
		Scanner input = new Scanner(System.in);
	
		int a = input.nextInt();
		int b = input.nextInt();
		
		int PROD = a*b;
		System.out.println("PROD = "+PROD);
		input.close();
	}	
}
