package beginner1048;

import java.util.Scanner;
public class Salary_Calculate {
	public static void main(String[] args) {
		/**
		 * A empresa ABC resolveu conceder um aumento de salários a seus funcionários 
		 * de acordo com a tabela abaixo:
		 * Salário	Percentual de Reajuste
		 * 0 - 400.00          15%
		 * 400.01 - 800.00     12%
		 * 800.01 - 1200.00    10%
		 * 1200.01 - 2000.00   7%
		 * Acima de 2000.00    4%
		 * Leia o salário do funcionário e calcule e mostre o novo salário, 
		 * bem como o valor de reajuste ganho e o índice reajustado, em percentual.
		 */
		Scanner input = new Scanner(System.in);
		double salario = input.nextDouble();
		
		
		input.close();
	}
}
