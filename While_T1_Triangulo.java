package moduloTarefasJava;

import java.util.Scanner;

public class While_T1_Triangulo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		double medidaLados, base, area;
		boolean loop = true;
		
		while (loop) {
		
		System.out.print("Informe a medida dos lados do triangulo: ");
		medidaLados = input.nextInt();
		
			while (medidaLados <= 0) {
				System.err.print("A entrada de dados inválidos, ou seja, medidas menores ou iguais à zero. \nNão seram permitidas\n");
				break;
			}
			
			if (medidaLados > 0) {
				base = medidaLados;
				medidaLados = Math.pow(medidaLados, 2);
				area = (base * medidaLados) / 2;
				System.out.println("A area do seu triangulo é: " + area +"cm");
				break;
			}
	   }
		input.close();
	}
}
