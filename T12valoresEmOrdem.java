package moduloTarefasJava;

import java.util.Scanner;

public class T12valoresEmOrdem {

	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
		
		int valor1, valor2, valor3;
		
		
		System.out.print("Informe o primer valor: ");
		valor1 = input.nextInt();
		
		System.out.print("Informe o segundo valor: ");
		valor2 = input.nextInt();
		
		System.out.print("Informe o ultimo valor: ");
		valor3 = input.nextInt();
		input.close();
		
		
		if (valor1 < valor2) {
			if (valor2 < valor3) {
				System.out.println("Os valores foram ordenados em forma crecente: "+ valor1 + ", "+ valor2 + ", "+ valor3);
			}
			else if (valor2 < valor3) {
				System.out.println("Os valores foram ordenados em forma crecente: "+ valor1 + ", "+ valor3 + ", "+ valor2);
			}
			else {
				System.out.println("Os valores foram ordenados em forma crecente: "+ valor3 + ", "+ valor1 + ", "+ valor2);
			}
		}
		else if (valor2 < valor3) {
			if (valor1 < valor3) {
				System.out.println("Os valores foram ordenados em forma crecente: "+ valor2 + ", "+ valor1 + ", "+ valor3);
			}
			else {
				System.out.println("Os valores foram ordenados em forma crecente: "+ valor2 + ", "+ valor3 + ", "+ valor1);
			}
		}
		else {
			System.out.println("Os valores foram ordenados em forma crecente: "+ valor3 + ", "+ valor2 + ", "+ valor1);
		}
	}
}
