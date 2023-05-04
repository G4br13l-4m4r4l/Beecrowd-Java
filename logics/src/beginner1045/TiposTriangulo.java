package beginner1045;

import java.util.Scanner;
public class TiposTriangulo {
	public static void main(String[] args) {
		/**
		 * Leia 3 valores de ponto flutuante A, B e C e 
		 * ordene-os em ordem decrescente, de modo que o 
		 * lado A representa o maior dos 3 lados. 
		 * A seguir, determine o tipo de triângulo que estes 
		 * três lados formam, com base nos seguintes casos, 
		 * sempre escrevendo uma mensagem adequada
		 */
		
		Scanner input = new Scanner(System.in);
		
		try {
			double a = input.nextDouble();
			double b = input.nextDouble();
			double c = input.nextDouble();
			
			double A = Math.max(a, Math.max(b, c));
			double C = Math.min(a, Math.min(b, c));
			double B = Math.min(a, Math.max(a, b));
			
			if(B+C<=A) {
				System.out.println("NAO FORMA TRIANGULO");
			}else if(Math.pow(A, 2)==Math.pow(B, 2)+Math.pow(C, 2)) {
				System.out.println("TRIANGULO RETANGULO");
			}else if(Math.pow(A, 2)>Math.pow(B, 2)+Math.pow(C, 2)) {
				System.out.println("TRIANGULO OBTUSANGULO");
			}else if(Math.pow(A, 2)<Math.pow(B, 2)+Math.pow(C, 2)) {
				System.out.println("TRIANGULO ACUTANGULO");
			}
			if(A==B && B==C && A==C) {
				System.out.println("TRIANGULO EQUILATERO");
			}else if(A==B || B==C || A==C) {
				System.out.println("TRIANGULO ISOSCELES");
			}

		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			input.close();
		}		
		
	}
}
