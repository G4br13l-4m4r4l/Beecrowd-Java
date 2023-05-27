package beginner1064;

import java.util.Scanner;

public class Positivos_media {
	public static void main(String[] args) {
		/**
		 * Leia 6 valores. Em seguida, 
		 * mostre quantos destes valores digitados foram positivos. Na próxima linha, 
		 * deve-se mostrar a média de todos os valores positivos digitados, 
		 * com um dígito após o ponto decimal.
		 */
		
		Scanner input = new Scanner(System.in);
		
		double media =0;
		int count = 0;
		
		for(int i =0;i<6;i++) {
			double N = input.nextDouble();
			
			if(N<0) {
				count++;
				media+=N;
			}
		}
		
		media = media/count;
		
		System.out.println(count+" valores positivos");
		System.out.printf("%.1f\n", media);
		input.close();
	}
}
