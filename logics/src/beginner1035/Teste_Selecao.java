package beginner1035;

import java.util.Scanner;
public class Teste_Selecao {
	public static void main(String[] args) {
		/**
		 * Leia 4 valores inteiros A, B, C e D. A seguir, 
		 * se B for maior do que C e se D for maior do que A, 
		 * e a soma de C com D for maior que a soma de A e B e se C e D, ambos, 
		 * forem positivos e se a variável A for par escrever a mensagem "Valores aceitos", 
		 * senão escrever "Valores nao aceitos".
		 */
		Scanner input = new Scanner(System.in);
		int A = input.nextInt();
		int B = input.nextInt();
		int C = input.nextInt();
		int D = input.nextInt();
		input.close();
	}
}
