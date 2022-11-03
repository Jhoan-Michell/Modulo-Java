package moduloTarefasJava;

import java.util.Scanner;

public class T24divisívelPor3E7 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int numero;
		int divisivel, divisivel7;
		
		System.out.print("Digite o numero: ");
		numero = input.nextInt();
		input.close();
		
		divisivel = numero % 3;
		divisivel7 = numero % 7;
		
		if (divisivel == 0 || divisivel7 == 0) {
		
		    if (divisivel == 0) {
		    	System.out.println("O numero informado e Divisivel por 3.");
		    }
		    if (divisivel7 == 0) {
		    	System.out.println("O numero informado e Divisivel por 7.");
		    }
		    else if (divisivel7 != 0){
		    	System.out.println("Não e divisivel por 7.");
		    }
		    else if (divisivel != 0) {
		    	System.out.println("Não e divisivel por 3.");	
		    }
		}
	}
}
