package moduloTarefasJava;

import java.util.Scanner;
public class T17Triângulo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		float medida1, medida2, medida3;
		
		System.out.print("Digite a primeria medida do triangulo: ");
		medida1 = input.nextFloat();
		
		System.out.print("Digite a segunda medida do triangulo: ");
		medida2 = input.nextFloat();
		
		System.out.print("Digite a ultima medida do triangulo: ");
		medida3 = input.nextFloat();
		
		input.close();
		
		if (medida1 == medida2 && medida3 == medida1) {
			System.out.print("Triângulo Equilátero, pois possui os 3 lados iguais.");
		} else if (medida1 == medida2 || medida2 == medida3 || medida1 == medida3) {
			System.out.print("Triângulo Isóscele, pois possui 2 lados iguais.");
		} else {
			System.out.print("Triângulo Escaleno, pois possui 3 lados diferentes.");
		}

	}
}
