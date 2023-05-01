package beginner1042;

import java.util.Scanner;
public class Sort_Simples {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		int n3 = input.nextInt();
		
		int min2=0,min3 =0, min1 = Math.min(n1,Math.min(n2, n3));
		
		if(min1 == n1) {
			min2 = Math.min(n2, n3);
			min3 = Math.max(n2, n3);
		}
		
		if(min1 == n2) {
			min2 = Math.min(n1, n3);
			min3 = Math.max(n1, n3);
		}
		
		if(min1 == n3) {
			min2 = Math.min(n1, n2);
			min3 = Math.max(n1, n2);
		}
		System.out.printf("%d%n%d%n%d%n%n", min1,min2,min3);
		System.out.printf("%d%n%d%n%d%n",n1,n2,n3);
		input.close();
	}
}
