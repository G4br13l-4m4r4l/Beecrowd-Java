package beginner1044;

import java.util.Scanner;
public class Multiplos {
	public static void main(String[] args) {
		/**
		 * Leia 2 valores inteiros (A e B). 
		 * Após, o programa deve mostrar uma mensagem "Sao Multiplos" 
		 * ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si.
		 */
		Scanner input = new Scanner(System.in);
		int A = input.nextInt();
		int B = input.nextInt();
		
		if(B%A == 0 || A%B == 0) {
			System.out.println("Sao Multiplos");
		}else {
			System.out.println("Nao sao Multiplos");
		}
		input.close();
	}
}
