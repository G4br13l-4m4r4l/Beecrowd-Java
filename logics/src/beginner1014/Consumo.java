package beginner1014;

import java.util.Scanner;
public class Consumo {
	public static void main(String[] args) {
		/**
		 * Calcule o consumo médio de um automóvel sendo fornecidos 
		 * a distância total percorrida (em Km) e o total 
		 * de combustível gasto (em litros).
		 */
		try {
			Scanner input = new Scanner(System.in);
			int distancia = input.nextInt();
			double combustivel = input.nextDouble();
			
			double consumoMedio = (double) distancia/combustivel;
			
			System.out.printf("%.3f km/l%n ",consumoMedio);
			input.close();
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
}
