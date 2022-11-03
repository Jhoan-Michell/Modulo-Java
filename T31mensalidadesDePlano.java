package moduloTarefasJava;

import java.util.Scanner;
public class T31mensalidadesDePlano {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int idade;
		
	System.out.print("Digite sua idade: ");
	idade = input.nextInt();
	
	input.close();
	
	if (idade <= 10) {
		System.out.println("O valor que voce deverá pagar e de R$: 30,00");
	}
	else if (idade > 10 && idade <= 29) {
		System.out.println("O valor que voce deverá pagar e de R$: 60,00");
	}
	else if (idade > 29 && idade <= 45) {
		System.out.println("O valor que voce deverá pagar e de R$: 120,00");
	}
	else if (idade > 45 && idade <= 59) {
		System.out.println("O valor que voce deverá pagar e de R$: 150,00");
	}
	else if (idade > 59 && idade <= 65) {
		System.out.println("O valor que voce deverá pagar e de R$: 250,00");
	}
	else {
		System.out.println("O valor que voce deverá pagar e de R$: 400,00");
	}
  }
}
