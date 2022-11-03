package moduloTarefasJava;

import java.util.Scanner;

public class T33Endocrino {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
	double IMC;
	float peso;
	float altura;
	double altura2;
	
	System.out.print("Digite seu peso: ");
	peso = input.nextFloat();
	
	System.out.print("Digite sua altura: ");
	altura = input.nextFloat();
	
	altura2 = Math.pow(altura,2);
	IMC = peso / altura2;
	

	input.close();
	
	if (IMC < 20) {
		System.out.println("Seu Indice de Massa Corporal e de: "+ IMC +" E sua faixa de risco e: 'Abaixo do peso'");
	}
	else if (IMC >= 20 && IMC <= 25) {
		System.out.println("Seu Indice de Massa Corporal e de: "+ IMC +" E sua faixa de risco e: 'Normal'");
	}
	else if (IMC > 25 && IMC <= 30) {
		System.out.println("Seu Indice de Massa Corporal e de: "+ IMC +" E sua faixa de risco e: 'Excesso de peso'");
	}
	else if (IMC > 30 && IMC <= 35) {
		System.out.println("Seu Indice de Massa Corporal e de: "+ IMC +" E sua faixa de risco e: 'Obesidade'");
	}
	else {
		System.out.println("Seu Indice de Massa Corporal e de: "+ IMC +" E sua faixa de risco e: 'Obesidade morbida'");
	}
	}
}
