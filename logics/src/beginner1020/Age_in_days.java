package beginner1020;

import java.util.Scanner;
public class Age_in_days {
	public static void main(String[] args) {
		/**
		 * Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias
		 * Obs.: apenas para facilitar o cálculo, 
		 * considere todo ano com 365 dias e todo mês com 30 dias. 
		 * Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364. 
		 * Este é apenas um exercício com objetivo de testar raciocínio matemático simples.
		 */
		Scanner input = new Scanner(System.in);
		int time = input.nextInt();
		
		int ano = time/365;
		time = time%365;
		
		int mes = time/30;	
		int dias =  time%30;
		
		System.out.printf("%d ano(s)%n%d mes(es)%n%d dia(s)", ano, mes, dias);
		input.close();
	}
}
