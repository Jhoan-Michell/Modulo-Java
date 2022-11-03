package moduloTarefasJava;

import java.util.Scanner;

public class While_T3_Idade {

	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
		
		boolean loop = true;
		int idade;
		double media = 0 ,resultado = 0, contador = 0;
		
		
		while (loop) {
			
		System.out.print("Informe a idade: ");
		idade = input.nextInt();
				
		if (idade > 0) {
			contador += 1;
			media += idade;
			resultado = media / contador;
		}
		else {
			System.out.println("A media das idades é:\n " + resultado);
		}
	  }
	input.close();	
	}
}
