package moduloTarefasJava;

import java.util.Scanner;

public class T26númerosNegativos {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int n1, n2, n3;
		int numero;
		numero = 0;
		
		System.out.print("Informe o valor numero 1: ");
		n1 = input.nextInt();
		
		System.out.print("Informe o valor numero 2: ");
		n2 = input.nextInt();
		
		System.out.print("Informe o valor numero 3: ");
		n3 = input.nextInt();
		
		input.close();
		
		if (n1 < 0 && n2 < 0 && n3 < 0) {
			numero += 1;
		}
		
		if (n1 < 0 || n2 < 0 || n3 < 0) {
			numero += 1;
		
			if (n1 < 0 && n2 < 0) {
				numero += 1;
			}
			else if (n2 < 0 && n3 <0) {
				numero += 1;
			}
			else if (n1 < 0 && n3 < 0) {
				numero += 1;
			}

		// ---------- Quadro de Saida --------//
	System.out.println("Numeros negativos: " + numero);
	}
  }
}
