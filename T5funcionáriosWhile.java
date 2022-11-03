package moduloTarefasJava;

import java.util.Scanner;
public class T5funcionáriosWhile {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		int codigo;
		double horasTrabalhadas;
		char turno;
		char categoriaCargo;
		
		int funcionarios = 1;
		boolean laco = true;
		boolean laco2 = true;
		
		while (funcionarios <= 10) {
			   
			   System.out.print("Digite seu codigo de funcionario: ");
			   codigo = input.nextInt();
			   System.out.print("Digite suas horas trabalhadas: ");
			   horasTrabalhadas = input.nextDouble();
			   
			   while (laco) {
				   System.out.print("As categorias validas são: 'G' ou 'O' \nDigite a sua categoria: ");
				   
			   }
			
				
			
		}
	}

}
