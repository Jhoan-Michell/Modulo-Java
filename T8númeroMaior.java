package moduloTarefasJava;

import java.util.Scanner;
public class T8númeroMaior {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		float valor1;
		float valor2;
		
		System.out.print("Digite o primer valor: ");
		valor1 = input.nextFloat();
		
		System.out.print("Digite o ultimo valor: ");
		valor2 = input.nextFloat();
		
		input.close();
		
		if (valor1 == valor2) {
			System.err.print("Valores iguaeis não seram lidos... digite novamente");
		}
		else if (valor1 > valor2) {
			System.out.print("O primer valor: " + valor1 + " e maior ao segundo valor");
		}
		else {
			System.out.print("O segundo valor: " + valor2 + " e maior ao primer valor");
		}
	}

}
