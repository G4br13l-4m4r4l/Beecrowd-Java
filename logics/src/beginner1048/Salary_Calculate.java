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
		double aumento;
		if(salario >= 0.0 && salario <=400.00) {
			aumento = salario * 0.15;
			double salarioNovo = salario + aumento;
			System.out.printf("Novo salario: %.2f%nReajuste ganho: %.2f%nEm percentual: 15 %% %n", salarioNovo, aumento);
		}else if(salario>=400.01 && salario<=800.00) {
			aumento = salario * 0.12;
			double salarioNovo = salario + aumento;
			System.out.printf("Novo salario: %.2f%nReajuste ganho: %.2f%nEm percentual: 12 %% %n", salarioNovo, aumento);
		}else if(salario>=800.01 && salario<=1200.00) {
			aumento = salario * 0.10;
			double salarioNovo = salario + aumento;
			System.out.printf("Novo salario: %.2f%nReajuste ganho: %.2f%nEm percentual: 10 %% %n", salarioNovo, aumento);
		}else if(salario>=1200.01 && salario<=2000.00) {
			aumento = salario * 0.7;
			double salarioNovo = salario + aumento;
			System.out.printf("Novo salario: %.2f%nReajuste ganho: %.2f%nEm percentual: 7 %% %n", salarioNovo, aumento);
		}else {
			aumento = salario * 0.4;
			double salarioNovo = salario + aumento;
			System.out.printf("Novo salario: %.2f%nReajuste ganho: %.2f%nEm percentual: 4 %% %n", salarioNovo, aumento);
		}
		input.close();
	}
}
