package beginner1047;

import java.util.Scanner;
public class Time_Game_Minutes {
	public static void main(String[] args) {
		/**
		 * Leia a hora inicial, minuto inicial, hora final e minuto final de um jogo. 
		 * A seguir calcule a duração do jogo.
		 * Obs: O jogo tem duração mínima de um (1) minuto e duração máxima de 24 horas.
		 */
		Scanner input = new Scanner(System.in);
		int A = input.nextInt();
		int B = input.nextInt();
		int C = input.nextInt();
		int D = input.nextInt();
		
		int Hour1 = (A*60)+B;
		int Hour2 = (C*60)+D;
		int result = 0;
		
		
		if(Hour2>Hour1) {
			result = Hour2 -Hour1;
			System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n",(result/60), (result%60));
		}else if(Hour1 > Hour2) {
			result = ((24*60)-Hour1)+Hour2;
			System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n",(result/60), (result%60));
		}else {
			System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n",24, 0);
		}
		
		
		input.close();
	}
}
