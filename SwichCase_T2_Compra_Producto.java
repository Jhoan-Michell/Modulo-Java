package moduloTarefasJava;

import java.util.Scanner;
public class SwichCase_T2_Compra_Producto {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int codigo, quantidadeProducto;
		double precoFinal, totalNota, precoUnitario;
		double desconto = 0.05;
		
		System.out.print("informe o codigo do producto: ");
		codigo = input.nextInt();
		
		System.out.print("Informe a quantidade de producto comprados: ");
		quantidadeProducto = input.nextInt();
		
		switch (codigo) {
		case 1,2,3,4,5,6,7,8,9,10: {
			precoUnitario = 10;
			totalNota = 250 * desconto;
		
			
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + codigo);
		}
		
	}

}
