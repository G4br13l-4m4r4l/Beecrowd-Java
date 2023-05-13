package beginner1051;

import java.util.Scanner;
public class Imposto_de_Renda {
	public static void main(String[] args) {
		
		/**
		 * Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. 
		 * Em seguida,calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda, 
		 * segundo a tabela abaixo.
		 * 
		 * de 0.00 até 2000.00     -   isento
		 * de 2000.01 até 3000.00  -   8%
		 * de 3000.01 até 4500.00  -   18%
		 * acima de 4500.01        -   28%
		 */
		Scanner input = new Scanner(System.in);
		double salario = input.nextDouble();
		
		input.close();
	}
}
