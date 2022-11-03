package moduloTarefasJava;

import java.util.Scanner;
public class T18angulosDoTriângulo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		float angulo1, angulo2, angulo3;
		
		System.out.print("Digite o valor do primer angulo: ");
		angulo1 = input.nextFloat();
		
		System.out.print("Digite o valor do segundo angulo: ");
		angulo2 = input.nextFloat();
		
		System.out.print("Digite o valor do ultimo angulo: ");
		angulo3 = input.nextFloat();
		input.close();
		
		if (angulo1 == 90 || angulo2 == 90 || angulo3 == 90) {
			System.out.print("Triângulo Retângulo, pois possui um ângulo reto. (igual a 90º)");
		}
		else if (angulo1 > 90 || angulo2 > 90 || angulo3 > 90) {
			System.out.print("Triângulo Obtusângulo, pois possui um ângulo obtuso. (maior que 90º)");
		}
		else {
			System.out.print("Triângulo Acutângulo, pois possui três ângulos agudos. (menor que 90º)");
		}
	}
}
