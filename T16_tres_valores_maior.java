package moduloTarefasJava;

import java.util.Scanner;

public class T16_tres_valores_maior {

	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
		
		int v1, v2, v3;
		
		System.out.print("Informe o valor 1: ");
		v1 = input.nextInt();
		
		System.out.print("Informe o valor 2: ");
		v2 = input.nextInt();
		
		System.out.print("Informe o valor 3: ");
		v3 = input.nextInt();
		input.close();
		
		if (v1 > 0 && v2 > 0 && v3 > 0) {
			
			if (v1 > v2) {
				if (v1 > v3) {
					System.out.print("O valor maior e: " + v1);
				}
			}
			else if (v2 > v1) {
				 	if (v2 > v3) {
				 		System.out.print("O valor maior e: " + v2);
			}	
			else {
				System.out.print("O valor maior e: " + v3);
			}
		}
	}
}
}