package beginner1065;


import java.util.Scanner;

public class Pares_de_cinco {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int cont =0;
		for(int i=0;i<5;i++) {
			int n = input.nextInt();
			
			if(n%2==0) {
				cont++;
			}
		}
		
		System.out.println(cont+" valores pares");
		input.close();
	}
}
