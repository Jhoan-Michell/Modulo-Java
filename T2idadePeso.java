package moduloTarefasJava;

import java.util.Scanner;

public class T2idadePeso {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int idade;
		float peso;
		
		System.out.print("Digite sua Idade: ");
		idade = input.nextInt();
		
		System.out.print("Digite seu Peso: ");
		peso = input.nextFloat();
		
		input.close();
		
		if (idade < 20)
		{
			if (peso <= 60) {
				System.out.print("Seu Grupo de risco e: 9");
			}
			else if (peso > 60 && peso <= 90) {
				System.out.print("Seu Grupo de risco e: 8");
			}
			else 
			{
				System.out.print("Seu Grupo de risco e: 7");
			}
		}
		
		if (idade >= 20 && idade <= 50) 
		{
			if (peso <= 60) {
				System.out.print("Seu Grupo de risco e: 6");
			}
			else if (peso > 60 && peso <= 90) { 
				System.out.print("Seu Grupo de risco e: 5");
			}
			else {
				System.out.print("Seu Grupo de risco e: 4");
			}	
		}
		
		if (idade > 50)
		{
			if (peso <= 60) {
				System.out.print("Seu Grupo de risco e: 3");
			}
			else if (peso > 60 && peso <= 90) {
				System.out.print("Seu Grupo de risco e: 2");
			}
			else {
				System.out.print("Seu Grupo de risco e: 1");
			}
		}
		
	}

}
