package moduloTarefasJava;

import java.util.Scanner;

public class T29médiaAluno {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		float nota1, nota2, nota3;
		float mediaNotas;
		double nroAulas, faltaAula;
		double mediaAulas;
		
		System.out.print("Digite o valor da primeira prova: ");
		nota1 = input.nextFloat();
		System.out.print("Digite o valor da segunda prova: ");
		nota2 = input.nextFloat();
		System.out.print("Digite o valor da ultima prova: ");
		nota3 = input.nextFloat();
		
		System.out.print("Numero de aulas ministradas: ");
		nroAulas = input.nextInt();
		System.out.print("Numero de faltas do aluno: ");
		faltaAula = input.nextInt();
		input.close();
		
		mediaNotas = (nota1 + nota2 + nota3) /3;
		mediaAulas = (faltaAula / nroAulas) * 100;
		
		
			
		if (mediaAulas >= 25) {
			System.err.print("Voce foi reporvado por excesso de faltas... Porcentagems de falta: " + mediaAulas +"%");
		}
		else if (mediaNotas >= 7) {
			System.out.println("Você esta 'Aprovado' e sua media e: " + mediaNotas);
		}
		else if (mediaNotas > 3 && mediaNotas < 7) {
			System.out.println("Como esta en Status de: 'Examen' , pois sua a media é de: " + mediaNotas);
		}
		else {
			System.out.println("Você esta 'Reprovado' pois sua media é de: " + mediaNotas);
		}	
	}
}
