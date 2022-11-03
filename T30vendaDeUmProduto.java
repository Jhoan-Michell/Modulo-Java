package moduloTarefasJava;

import java.util.Scanner;

public class T30vendaDeUmProduto {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		double valorProducto;
		double valorVenta;
		double lucro;
		
		System.out.print("Digite o valor da venta: ");
		valorProducto = input.nextDouble();
		input.close();
		
		lucro = 0.45;
		
		if (valorProducto < 20) {
			valorVenta = valorProducto * lucro;
			System.out.println("O valor de venta e: "+ valorVenta);
		}
		else {
			lucro -= 0.15;
			valorVenta = valorProducto * lucro;
			System.out.println("O valor de venta e: "+ valorVenta);
		}
	}

}
