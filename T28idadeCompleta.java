package moduloTarefasJava;

import java.util.Scanner;

public class T28idadeCompleta {

	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
		
		int dataNacimento;
		int dataActual;
		int idade;
		
		
		System.out.print("Informe o ano da sua data de nacimento: ");
		dataNacimento = input.nextInt();
		
		System.out.print("Digite o ano actual: ");
		dataActual = input.nextInt();
		
		input.close();
		
		idade = dataActual - dataNacimento;
		
		if (dataNacimento >= 1900 && dataActual >1999) {
			System.out.print("Sua idade e: "+ idade);
		}	
	}
}