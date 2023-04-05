package beginner1015;

import java.util.Scanner;
public class Distancia_dois_pontos {
	public static void main(String[] args) {
		
		/**
		 * Leia os quatro valores correspondentes aos eixos x 
		 * e y de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2) 
		 * e calcule a distância entre eles, 
		 * mostrando 4 casas decimais após a vírgula, segundo a fórmula:
		 * Distancia = Math. sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2))
		 */
		try {
			Scanner input = new Scanner(System.in);
			double x1 = input.nextDouble();
			double y1 = input.nextDouble();
			double x2 = input.nextDouble();
			double y2 = input.nextDouble();
			
			double distancia = Math. sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
			
			System.out.printf("%.4f%n", distancia);
			input.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
