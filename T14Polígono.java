package moduloTarefasJava;

import java.util.Scanner;
public class T14Polígono {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int nrLados;
		float medida;
		float base;
		double altura;
		double valorArea;
		
		System.out.println("Valores validos: 3, 4, 5. \n Digite o numero de lados do Poligono: ");
		nrLados = input.nextInt();
		
		System.out.print("Digite a medida dos lados: ");
		medida = input.nextFloat();
		input.close();
		
		
		if (nrLados == 3) {
			base = medida;
			altura = Math.pow(medida, 2);
			valorArea = (base * altura) /2;
			System.out.print("TRIÂNGULO, com um valor de area de: "+ valorArea +"cm");
		}
		else if (nrLados == 4) {
			valorArea = Math.pow(medida, 2);
			System.out.print("QUADRADO, com um valor de area de: "+ valorArea +"cm");
		}
		else if (nrLados == 5) {
			System.out.print("Seu poligono regular e um: PENTÁGONO.");
		}
		
	}

}
