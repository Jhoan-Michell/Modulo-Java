package moduloTarefasJava;

import java.util.Scanner;

public class switchCase_T4_Operacoes_numeros {

	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
	
		int n1, n2;
		
		System.out.print("Informe o numero desejado: ( Do '1' até '4' )");
		n1 = input.nextInt();
		
		System.out.print("Informe o ultimo numero: ( Do '1' até '4' ): ");
		n2 = input.nextInt();
		input.close();
		
		
		switch (n1) {
		case 1: {
			System.out.println("Você escolheu " + n1 + " Media entre os numeros digitados: \n" + (n1 + n2)/2);
			break;
		}
		case 2: {
			System.out.println("Você escolheu " + n1 + " Diferencia do maior pelo menor:");
			if (n1 > n2) {
				System.out.print("A diferencia para ser igual é de: " + (n1 - n2));
			}
			else {
				System.out.print("A diferencia para ser igual é de: " + (n2 - n1));
			}
			break;
		}
		case 3: {
			System.out.print("Você escolheu " + n1 + " Produto entre os numeros digitados: " + (n1*n2));
			break;
		}
		case 4: {
			System.out.print("Você escolheu " + n1 + " Produto entre os numeros digitados: " + (n1/n2));
		}
	  }
   }
}
