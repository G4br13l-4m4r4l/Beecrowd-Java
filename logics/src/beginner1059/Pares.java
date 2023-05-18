package beginner1059;


public class Pares {
	public static void main(String[] args) {
		
		/**
		 * Faça um programa que mostre os números pares entre 1 e 100, inclusive.
		 */
		
		for(int i =0;i<=100;i++) {
			if(i == 0) {
				continue;
			}else if(i%2 == 0) {
				System.out.println(i);
			}
		}
	}
}
