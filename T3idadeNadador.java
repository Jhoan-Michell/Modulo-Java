package moduloTarefasJava;

import java.util.Scanner;

public class T3idadeNadador {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int idade;
		
		System.out.print("Digite sua Idade: ");
		idade = input.nextInt();
		
		input.close();
		
		if (idade < 5) {
			System.out.print("Sua categoria de nadador e: Iniciante");	
		}
		else if (idade >= 5 && idade <= 7) {
			System.out.print("Sua categoria de nadador e: Infantil");	
		}
		else if (idade >= 8 && idade <= 10) {
			System.out.print("Sua categoria de nadador e: Juvenil");	
		}
		else if (idade >= 11 && idade <= 15) {
			System.out.print("Sua categoria de nadador e: Adolescente");
		}
		else if (idade >= 16 && idade <= 30) {
			System.out.print("Sua categoria de nadador e: Adulto");
		}
		else {
			System.out.print("Sua categoria de nadador e: Senior");
		}	
		
	}

}
