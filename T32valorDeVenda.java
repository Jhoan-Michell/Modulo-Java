package moduloTarefasJava;

import java.util.Scanner;
public class T32valorDeVenda {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		double valorVenta;
		double lucro;
		
		System.out.print("Digite o valor de venta: ");
		valorVenta = input.nextFloat();
		
		input.close();
		
		lucro = 0.70;
		
		if (valorVenta < 10) {
			valorVenta = valorVenta * lucro;
			System.out.print("O valor da venta e: "+ valorVenta);
		}
		else if (valorVenta >= 10 && valorVenta < 30) {
			lucro -= 0.20;
			valorVenta = valorVenta * lucro;
			System.out.print("O valor da venta e: "+ valorVenta);
		}
		else if (valorVenta >= 30 && valorVenta < 50) {
			lucro -= 0.30;
			valorVenta = valorVenta * lucro;
			System.out.print("O valor da venta e: "+ valorVenta);
		}
		else {
			lucro -= 0.40;
			valorVenta = valorVenta * lucro;
			System.out.print("O valor da venta e: "+ valorVenta);
		}
	}

}
