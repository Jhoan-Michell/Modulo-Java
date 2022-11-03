package moduloTarefasJava;

import java.util.Scanner;

public class T7_conjunto_De_Valores {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double n1;
		
		do {
			
			System.out.print("Digite seu valor: ");
			n1 = input.nextDouble();
			
			if (n1 <= 0) {
			System.err.print("Valores negativos ou igual a zero não seram lidos... Comence e digite novamente");
			break;
			}
			
			System.out.println("O cuadrado do seu valor e: " + Math.pow(n1, 2));
			System.out.println("O cubo do seu valor e: " + Math.pow(n1, 3));
			System.out.println("A raiz cuadradra do valor e: " + Math.sqrt(n1));
		
		} while (n1 > 0);
		input.close();
	}
}
