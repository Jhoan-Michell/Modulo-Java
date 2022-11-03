package moduloTarefasJava;

import java.util.Scanner;
public class T9idadeParaVoto {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int anoNacimento;
		int anoActual = 2022;
		int idade;
	
		System.out.print("Digite seu ano de nacimento: ");
		anoNacimento = input.nextInt();
		input.close();
		
		idade = anoActual - anoNacimento;
		
		if (idade >= 18) {
			System.out.print("Voce SIM podera votar este ano");
		}
		else {
			System.out.print("Voce NÃO podera votar este ano");
		}
	}

}
