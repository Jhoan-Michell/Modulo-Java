package moduloTarefasJava;

import java.util.Scanner;

public class While_T2_Menu_Opcoes {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int op;
		boolean loop = true;
		double salario, reaSalario;
			
		
		 	while (loop) {
		 		System.out.print("Escolha a opção que desejar\n1- Imposto, 2- Novo Salario, 3- Classificação, -4 Finalizar Programa: ");
				op = input.nextInt();
				
				if (op <= 0 || op > 4) {
					System.err.println("opção não valido... digite novamente");
					continue;
				}
				
		 		switch (op) {
				case 1: {
					double imposto = 0.05;
					System.out.print("Informe o seu salario: ");
					salario = input.nextFloat();
					if (salario <= 500) {
						reaSalario = salario * imposto;
						salario = salario - reaSalario;
						System.out.println("Com um imposto de: " + imposto + " Seu salario é de: " + salario);
						break;
					}
					else if (salario > 500 && salario <= 850) {
						imposto += 0.05;
						reaSalario = salario * imposto;
						salario = salario - reaSalario;
						System.out.println("Com um imposto de: " + imposto + " Seu salario é de: " + salario);
						break;
					}
					else {
						imposto += 0.10;
						reaSalario = salario * imposto;
						salario = salario - reaSalario;
						System.out.println("Com um imposto de: " + imposto + " Seu salario é de: " + salario);
						break;
					}
				}
				case 2: {
					System.out.print("Informe o seu salario: ");
					salario = input.nextFloat();
					double aumento = 250;
					if (salario > 1500) {
						System.out.println("Com um salario de: " + salario + " Você tem um aumento de R$:" + aumento);
						System.out.println("Salario liquido: " + (salario + aumento));
						break;
					}
					else if (salario > 750 && salario <= 1500) {
						aumento -= 200;
						System.out.println("Com um salario de: " + salario + " Você tem um aumento de R$:" + aumento);
						System.out.println("Salario liquido: " + (salario + aumento));
						break;
					}
					else if (salario > 450 && salario <= 750) {
						aumento -= 175;
						System.out.println("Com um salario de: " + salario + " Você tem um aumento de R$:" + aumento);
						System.out.println("Salario liquido: " + (salario + aumento));
						break;
					}
					else {
						aumento -= 150;
						System.out.println("Com um salario de: " + salario + " Você tem um aumento de R$:" + aumento);
						System.out.println("Salario liquido: " + (salario + aumento));
						break;
					}
				}
				case 3: {
					System.out.print("Informe o seu salario: ");
					salario = input.nextFloat();
					if (salario <= 700) {
						System.out.println("A classificação do seu salario é:\n'Mal Remunerado'");
						break;
					}
					else {
						System.out.println("A classificação do seu salario é:\n'Bem remunerado'");
						break;
					}
				}
				case 4: {
					System.out.println("Você escolheu terminar o programa...");
					System.out.println("Tenha bom dia :)");
					loop = false;
					break;
				}
		 	}
		 }	
	   input.close();
	}
  }
