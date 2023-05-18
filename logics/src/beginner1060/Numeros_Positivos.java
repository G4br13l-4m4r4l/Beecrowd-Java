package beginner1060;

import java.util.Scanner;
public class Numeros_Positivos {
	public static void main(String[] args) {
			/**
			 * Faça um programa que leia 6 valores. 
			 * Estes valores serão somente negativos ou positivos (desconsidere os valores nulos). 
			 * A seguir, mostre a quantidade de valores positivos digitados.
			 */
			Scanner input = new Scanner(System.in);
			int a =input.nextInt();
			int b = input.nextInt();
			int c = input.nextInt();
			int d = input.nextInt();
			int e = input.nextInt();
			int f = input.nextInt();
			
			int cont =0;
			int[] lista = {a,b,c,d,e,f};
			
			for(int x = 0; x<=lista.length;x++ ) {
				if(lista[x]>=0) {
					cont++;
				}
			}
			System.out.println(cont+" valores positivos");
			
			input.close();
		
	}
}
