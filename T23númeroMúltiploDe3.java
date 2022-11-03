package moduloTarefasJava;

import java.util.Scanner;

public class T23númeroMúltiploDe3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
	//Desenvolva um programa que dado um número, 
	//imprima uma das mensagens: é múltiplo de 3 ou não é múltiplo de 3.
	
		int numero;
		int multiplo;
		
		System.out.print("Digite o numero: ");
		numero = input.nextInt();
		input.close();
		
		multiplo = numero % 3;
		
		if (multiplo == 0) {
			System.out.println("O numero e multiplo de 3.");
		}
		else {
			System.out.println("O numero não e multiplo de 3.");
		}
	}
}
