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
		int h1 = Integer.parseInt(hi[0]);
		int m1 = Integer.parseInt(hi[1]);
		int s1 = Integer.parseInt(hi[2]);
		
		int d2 = Integer.parseInt(df[1]);
		int h2 = Integer.parseInt(hf[0]);
		int m2 = Integer.parseInt(hf[1]);
		int s2 = Integer.parseInt(hf[2]);
		
		int q1,q2, tempo;
		
		q1 = s1+m1*60+h1*3600+d1*86400;
		q2 = s2+m2*60+h2*3600+d2*86400;
		tempo = q2- q1;
		
		System.out.printf("%d dia(s)\n",(tempo/86400));
		tempo = tempo%86400;
		System.out.printf("%d hora(s)\n", (tempo/3600));
		tempo = tempo%3600;
		System.out.printf("%d segundo(s)\n", tempo);
		input.close();
	}
}
