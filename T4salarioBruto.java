package moduloTarefasJava;

import java.util.Scanner;
public class T4salarioBruto {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		double salarioBruto;
		double salarioFinal;
		double imposto = 0.07;
		
		System.out.print("Digite o seu salario: ");
		salarioBruto = input.nextDouble();
		
		input.close();
		
		salarioFinal = salarioBruto -(salarioBruto * imposto);
		
		if (salarioFinal <= 350) {
			System.out.print("Seu salario - imposto e: "+ salarioFinal + "\ne, sua gratificação e de R$ 100 " + "\nSalario Final: " + (salarioFinal + 100));
		}
		else if (salarioFinal > 350 && salarioFinal <= 600) {
			System.out.print("Seu salario - imposto e: "+ salarioFinal + "\ne, sua gratificação e de R$ 75 " + "\nSalario Final: " + (salarioFinal + 75));
		}
		else if (salarioFinal > 600 && salarioFinal <= 900) {
			System.out.print("Seu salario - imposto e: "+ salarioFinal + "\ne, sua gratificação e de R$ 50 " + "\nSalario Final: " + (salarioFinal + 50));
		}
		else {
			System.out.print("Seu salario - imposto e: "+ salarioFinal + "\ne, sua gratificação e de R$ 35 " + "\nSalario Final: " + (salarioFinal + 35));
		}
	}

}
