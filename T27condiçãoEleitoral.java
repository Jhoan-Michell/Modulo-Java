package moduloTarefasJava;

import java.util.Scanner;

public class T27condiçãoEleitoral {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int idade;
		
		System.out.print("Informe sua idade: ");
		idade = input.nextInt();
		
		input.close();
		
		if (idade < 16) {
			System.out.println("Sendo sua idade: " + idade + " Não pode votar");
		}
		else if (idade >= 16 && idade < 18 || idade >= 65) {
			System.out.println("Sendo sua idade: " + idade + " Sua condição eleitoral e: Facultativo");
		}
		else if (idade >= 18 && idade <= 64) {
			System.out.println("Sendo sua idade: " + idade + " Sua condição eleitoral e: Obrigatorioz");
		}
	}
}
