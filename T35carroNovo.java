package moduloTarefasJava;

import java.util.Scanner;
public class T35carroNovo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double custoFabrica, custoConsumidor;
		double porcentageDis, imposto;
		
		porcentageDis = 0.05;
		imposto = 0.15;
		
		System.out.print("Digite o valor de Custo de fabrica: ");
		custoFabrica = input.nextDouble();
		
		input.close();
		
		if (custoFabrica <= 12000) {
			custoConsumidor = custoFabrica + (custoFabrica * porcentageDis);
			System.out.print("O custo ao consumidor e de: "+ custoConsumidor);
		}
		else if (custoFabrica > 12000 && custoFabrica <= 25000) {
			porcentageDis *= 2;
			custoConsumidor = custoFabrica + ((custoFabrica * porcentageDis)+ custoFabrica * imposto);
			System.out.print("O custo ao consumidor e de: "+ custoConsumidor);
		}
		else {
			porcentageDis *= 3;
			imposto += 0.05;
			custoConsumidor = custoFabrica + ((custoFabrica * porcentageDis)+ custoFabrica * imposto);
			System.out.print("O custo ao consumidor e de: "+ custoConsumidor);
		}
		
		
	}

}
