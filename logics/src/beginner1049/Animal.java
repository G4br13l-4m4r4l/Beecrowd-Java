package beginner1049;

import java.util.Scanner;
public class Animal {
	public static void main(String[] args) {
		/**
		 * este problema, você deverá ler 3 palavras que definem o tipo de animal 
		 * possível segundo o esquema abaixo, da esquerda para a direita.  
		 * Em seguida conclua qual dos animais seguintes foi escolhido,
		 * através das três palavras fornecidas.
		 */
		
		Scanner input = new Scanner(System.in);
		String first = input.nextLine();
		String second = input.nextLine();
		String third = input.nextLine();
		
		if(first.trim().toLowerCase().equals("veterbrado")) {
			if(second.trim().toLowerCase().equals("ave")) {
				if(third.trim().toLowerCase().equals("onivoro")) {
					System.out.println("pomba");
				}else {
					System.out.println("aguia");
				}
			
			}else {
				if(third.trim().toLowerCase().equals("onivoro")) {
					System.out.println("homem");
				}else{
					System.out.println("vaca");
				}
				
			}
		}else{
			if(second.trim().toLowerCase().equals("inseto")) {
				if(third.trim().toLowerCase().equals("hematofago")) {
					System.out.println("pulga");
				}else {
					System.out.println("lagarta");
				}
			}else {
				if(third.trim().toLowerCase().equals("hematofago")) {
					System.out.println("sanguessuga");
				}else {
					System.out.println("minhoca");
				}
			}
		}
		input.close();
	}
}
