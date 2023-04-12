package beginner1019;

import java.util.Scanner;
public class ConversaoTempo {
	public static void main(String[] args) {
		/**
		 * Leia um valor inteiro, 
		 * que é o tempo de duração em segundos de um determinado evento em uma fábrica, 
		 * e informe-o expresso no formato horas:minutos:segundos.
		 */
		Scanner input = new Scanner(System.in);
		
		int tempo = input.nextInt();
		
		int horas = tempo/60;
		int minutos =  tempo%60;
		int segundos = minutos%60;
		
		
		System.out.printf("%d:%d:%d",horas,minutos,segundos);
		
		input.close();
	}
}
