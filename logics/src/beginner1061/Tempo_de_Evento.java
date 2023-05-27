package beginner1061;

import java.util.Scanner;

public class Tempo_de_Evento {
	public static void main(String[] args) {
		/**
		 * Pedrinho está organizando um evento em sua Universidade. 
		 * O evento deverá ser no mês de Abril, iniciando e terminando dentro do mês. 
		 * O problema é que Pedrinho quer calcular o tempo que o evento vai durar, 
		 * uma vez que ele sabe quando inicia e quando termina o evento.
		 * Sabendo que o evento pode durar de poucos segundos a vários dias, 
		 * você deverá ajudar Pedrinho a calcular a duração deste evento.
		 */
		
		Scanner input = new Scanner(System.in);
		String di[] = input.nextLine().split(" ");
		String hi[] = input.nextLine().replaceAll(" ","").split(":");
		String df[] = input.nextLine().split(" ");
		String hf[] = input.nextLine().replaceAll(" ","").split(":");
		
		int d1 = Integer.parseInt(di[1]);
		int h1 = Integer.parseInt(hi[1]);
		int s1 = Integer.parseInt(hi[2]);
		input.close();
	}
}
