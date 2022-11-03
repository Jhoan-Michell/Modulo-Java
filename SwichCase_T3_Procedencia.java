package moduloTarefasJava;

import java.util.Scanner;

public class SwichCase_T3_Procedencia {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
	
		int codigoOrigem;
		float preco;
		
		System.out.print("Informe o codigo: ");
		codigoOrigem = input.nextInt();
		
		System.out.print("Digite o preco de producto: ");
		preco = input.nextFloat();
		input.close();
		
		switch (codigoOrigem) {
		case 1: {
			System.out.print("O codigo do producto é de origem: 'Sul' ) com preco de: "+ preco);
			break;
		}
		case 2: {
			System.out.print("O codigo do producto é de origem: 'Norte' ) com preco de: "+ preco);
			break;
		}
		case 3: {
			System.out.print("O codigo do producto é de origem: 'Leste' ) com preco de: "+ preco);
			break;
		}
		case 4: {
			System.out.print("O codigo do producto é de origem: 'Oeste' ) com preco de: "+ preco);
			break;
		}
		case 5,6: {
			System.out.print("O codigo do producto é de origem: 'Nordeste' ) com preco de: "+ preco);
			break;
		}
		case 7,8,9: {
			System.out.print("O codigo do producto é de origem: 'Sudeste' ) com preco de: "+ preco);
			break;
		}
		case 10,11,12,13,14,15,16,17,18,19,20 : {
			System.out.print("O codigo do producto é de origem: 'Centro-Oeste' ) com preco de: "+ preco);
			break;
		}
		case 21,22,23,24,25,26,27,28,29,30: {
			System.out.print("O codigo do producto é de origem: 'Nordeste' ) com preco de: "+ preco);
			break;
		}
	}
  }
}
