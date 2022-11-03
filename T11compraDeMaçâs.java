package moduloTarefasJava;

import java.util.Scanner;
public class T11compraDeMaçâs {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int nroMacaCompradas;
		double duzia = 0.25;
		double valorCompra;
		
		System.out.print("Digite o nro de maçãs compradas: ");
		nroMacaCompradas = input.nextInt();
		input.close();
		
		if (nroMacaCompradas >= 18) {
			valorCompra = nroMacaCompradas * duzia;
			System.out.print("Maçã compradas: " + nroMacaCompradas + "\no valor total da compra e de: " + valorCompra);
		}
		else {
			valorCompra = nroMacaCompradas * 0.30;
			System.out.print("Maçã compradas: " + nroMacaCompradas + "\no valor total da compra e de: " + valorCompra);
		}
		
	}

}
