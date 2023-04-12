package beginner1018;

import java.util.Scanner;
public class Cedulas {
	public static void main (String[] args) {
		
		/**
		 * Leia um valor inteiro. 
		 * A seguir, calcule o menor número de notas possíveis (cédulas) no qual 
		 * o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. 
		 * A seguir mostre o valor lido e a relação de notas necessárias.
		 */
		
		Scanner input = new Scanner(System.in);
		int money = input.nextInt();
		
		System.out.println(money);
		int sobra = money/100;
		System.out.println(sobra + " nota(s) de R$ 100,00");
		money = money%100;
		
		sobra = money/50;
		System.out.println(sobra + " nota(s) de R$ 50,00");
		money = money%50;
		
		sobra = money/20;
		System.out.println(sobra + " nota(s) de R$ 20,00");
		money = money%20;
		
		sobra = money/10;
		System.out.println(sobra + " nota(s) de R$ 10,00");
		money = money%10;
		
		sobra = money/5;
		System.out.println(sobra + " nota(s) de R$ 5,00");
		money = money%5;
		
		sobra = money/2;
		System.out.println(sobra + " nota(s) de R$ 2,00");
		money = money%2;
		
		sobra = money/1;
		System.out.println(sobra + " nota(s) de R$ 1,00");
		input.close();
	}
}
