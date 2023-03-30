package beginner1009;

import java.util.Scanner;
public class Salary_Bonus {
	public static void main(String[] args) {
		/**
		 * Faça um programa que leia o nome de um vendedor, 
		 * o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). 
		 * Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, 
		 * informar o total a receber no final do mês, com duas casas decimais.
		 */
		Scanner input = new Scanner(System.in);
		String nome = input.nextLine();
		double salary = input.nextDouble();
		double montante = input.nextDouble();
		
		double salaryFinal = (montante*0.15)+salary;
		System.out.printf("TOTAL = R$ %.2f%n", salaryFinal);
		input.close();
	}
}
