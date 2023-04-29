package beginner1040;

import java.util.Scanner;
public class MediaAluno {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double n1 = input.nextDouble();
		double n2 = input.nextDouble();
		double n3 = input.nextDouble();
		double n4 = input.nextDouble();
		
		double media = ((n1*2)+(n2*3)+(n3*4)+(n4*1))/(4+4);
		
		System.out.printf("Media: %.1f%n", media);
		if(media>=7.0) {
			System.out.println("Aluno aprovado.");
		}else if(media <= 6.9 && media >= 5.0){
			System.out.println("Aluno em exame.");
			double notaExame = input.nextDouble();
			System.out.printf("Nota do exame: %.1f%n", notaExame);
			Recuperacao(media, notaExame);
		}else {
			System.out.println("Aluno reprovado.");
		}
		
		input.close();
	}
	
	public static void Recuperacao(double mediaInicial, double notaExame) {
		
		double mediaFinal = (mediaInicial+notaExame)/2;
		if(mediaFinal>=5.0) {
			System.out.printf("Aluno aprovado.%nMedia final: %.1f%n",mediaFinal); 
		}else {
			System.out.printf("Aluno reprovado.%nMedia final: %.1f%n",mediaFinal);
		}
		
	}
}
