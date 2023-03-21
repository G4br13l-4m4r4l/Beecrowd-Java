package beginner1002;

import java.util.Scanner;
public class AreaCirculo {

	public static void main(String[] args) {
		/**
         *A fórmula para calcular a área de uma circunferência é: area = π . raio2.
         *Considerando para este problema que π = 3.14159:
         *Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π.
         */
		Scanner input = new Scanner(System.in);
	    double π = 3.14159;
	    double raio = input.nextDouble();
	    double A = π*(raio*raio);
	    System.out.printf("A=%.4f%n",A);
		input.close();
	}
}
