package beginner1021;

import java.util.Scanner;
public class Notas_moedas {
	public static void main(String[] args) {
		/**
		 * Leia um valor de ponto flutuante com duas casas decimais. 
		 * Este valor representa um valor monetário. A seguir, calcule 
		 * o menor número de notas e moedas possíveis no qual o valor pode 
		 * ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2. 
		 * As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. 
		 * A seguir mostre a relação de notas necessárias.
		 */
		Scanner input = new Scanner(System.in);
		double money = input.nextDouble();
		System.out.println("NOTAS:");
		
		int cem = (int) money/100;
		money = money%100.00;
		System.out.println(cem+" nota(s) de R$ 100.00");
		
		int cinquenta =(int) money/50;
		money = money%50.00;
		System.out.println(cinquenta+" nota(s) de R$ 50.00");
		
		int vinte =(int) money/20;
		money = money%20.00;
		System.out.println(vinte+" nota(s) de R$ 20.00");
		
		int dez =(int) money/10;
		money = money%10.00;
		System.out.println(dez+" nota(s) de R$ 10.00");
		
		int cinco =(int) money/5;
		money = money%5.00;
		System.out.println(cinco+" nota(s) de R$ 5.00");
		
		int dois = (int)money/2;
		money = money%2.00;
		System.out.println(dois+" nota(s) de R$ 2.00");
		
		money = money*100;
		System.out.println("MOEDAS:");
		
		int um = (int)money/100;
		money = money%100.00;
		System.out.println(um+" moeda(s) de R$ 1.00");
		
		int cinqCent = (int) money/50;
		money = money%50.00;
		System.out.println(cinqCent+" moeda(s) de R$ 0.50");
		
		int vinteCinco = (int)money/25;
		money = money%25.00;
		System.out.println(vinteCinco+" moeda(s) de R$ 0.25");
		
		int dezCent = (int) money/10;
		money = money%10.00;
		System.out.println(dezCent+" moeda(s) de R$ 0.10");
		
		int cincoCent = (int)money/5;
		money = money%5.00;
		System.out.println(cincoCent+" moeda(s) de R$ 0.05");
		
		int umCent = (int)money/1;
		System.out.println(umCent+" moeda(s) de R$ 0.01");
		input.close();
	}
}
