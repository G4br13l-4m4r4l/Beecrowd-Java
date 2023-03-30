package beginner1008;

import java.util.Scanner;
public class Salary {
	public static void main(String[] args) {
		/**
		 * Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas, 
		 * o valor que recebe por hora e calcula o salário desse funcionário. 
		 * A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
		 */
		
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int qtdHours = input.nextInt();
		double perHour = input.nextDouble();
		
		double salary = perHour*qtdHours;
		
		System.out.println("NUMBER = "+number);
		System.out.printf("SALARY = U$ %.2f%n", salary);
		input.close();
	}
}
