package moduloTarefasJava;

import java.util.Scanner;

public class FOR_T2_tabuada {

	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
		
		int numero, tabuada;
		
		
		System.out.print("Informe o numero da tabuada: ");
		numero = input.nextInt();
		input.close();
		
		for (int m = 1; m > 0 && m <=10; m++) {
			tabuada = numero * m;
			System.out.println(+ numero + " x " + m + " = " + tabuada);
		}
	}
}
