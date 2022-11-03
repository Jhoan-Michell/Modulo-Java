package moduloTarefasJava;

import java.util.Scanner;
public class SwichCase_T1_Preco_Productos {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
	
		float preco;
		int categoria;
		double nvoPreco;
		double aumento = 0.05;
		double imposto = 0.05;
		
		
		System.out.print("Qual é o preço: ");
		preco = input.nextFloat();
		
		System.out.print("Informe a Categoria do producto: ");
		categoria = input.nextInt();
	
		input.close();
		
	if (preco <= 25) {
		
		switch (categoria) {
		case 1: {
			nvoPreco = preco * aumento;
			imposto += 0.03;
			nvoPreco = nvoPreco - (nvoPreco * imposto);
		}
		case 2: {
			aumento += 0.03;
			nvoPreco = preco * aumento;
			nvoPreco = nvoPreco - (nvoPreco * imposto);
		}
		case 3: {
			aumento += 0.05;
			nvoPreco = preco * aumento;
			imposto += 0.03;
			nvoPreco = nvoPreco - (nvoPreco * imposto);
		}
		
		if (nvoPreco <= 50) {
			System.out.println("A clasificação do producto é: 'Barato' ");
			break;
		}
		else if (nvoPreco > 50 && nvoPreco < 120) {
			System.out.println("A clasificação do producto é: 'Normal' ");
			break;
		}
		else {
			System.out.println("A clasificação do producto é: 'Caro' ");
			break;
		}
	}
  
	if (preco > 25) {
		
		switch (categoria) {
		case 1: {
			aumento += 0.07;
			nvoPreco = preco * aumento;
			imposto += 0.03;
			nvoPreco = nvoPreco - (nvoPreco * imposto);
		}
		case 2: {
				aumento += 0.10;
				nvoPreco = preco * aumento;
				nvoPreco = nvoPreco - (nvoPreco * imposto);
		}
		case 3: {
			aumento += 0.13;
			nvoPreco = preco * aumento;
			imposto += 0.03;
			nvoPreco = nvoPreco - (nvoPreco * imposto);
		}
		
		if (nvoPreco <= 50) {
			System.out.println("A clasificação do producto é: 'Barato' ");
			break;
		}
		else if (nvoPreco > 50 && nvoPreco < 120) {
			System.out.println("A clasificação do producto é: 'Normal' ");
			break;
		}
		else {
			System.out.println("A clasificação do producto é: 'Caro' ");
			break;
		}
	}
  }
}
}
}
