package moduloTarefasJava;

import java.util.Scanner;
public class T13alturaSexo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int sexo;
		float altura;
		double peso;
		
		System.out.print("Digite seu sexo \n(1 - Feminino) (2 - Masculino)\n");
		sexo = input.nextInt();
		
	
		if (sexo >2 || sexo == 0) {
			System.err.print("Valor invalido... digite os valores que estão na tela");
		    } 
			if (sexo == 1) {
				System.out.println("Digite sua altura: ");
				altura = input.nextFloat();
				peso = 62.1 * altura - 44.7;
				System.out.println("Seu peso ideal e: "+ peso);
			}
			else if (sexo == 2) {
				System.out.println("Digite sua altura: ");
				altura = input.nextFloat();
				peso = 72.7 * altura - 58;
				System.out.println("Seu peso ideal e: "+ peso);
			}
		input.close();	
		}
}
