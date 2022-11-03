package moduloTarefasJava;
/*
 * Criar um programa que a partir da idade e peso do paciente calcule 
 * a dosagem de determinado medicamento e imprima a receita informando 
 * quantas gotas do medicamento o paciente deve tomar por dose. 
 * Considere que o medicamento em questão possui 500 mg por ml, e 
 * que cada ml corresponde a 20 gotas.
   Adultos ou adolescentes desde 12 anos, inclusive, se tiverem peso igual 
   devem tomar 1000 mg; com peso abaixo de 60 Kg devem tomar 875 mg.
   Para crianças e adolescentes abaixo de 12 anos a dosagem é calculada
    pelo peso corpóreo conforme a tabela a seguir:
 */
import java.util.Scanner;
public class T34impressãoDeReceita {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int idade;
		float peso;
		int dosagem = 1000;
		int gotas;
		
		System.out.print("Informe sua idade: ");
		idade = input.nextInt();
		
		System.out.print("Informe seu peso: ");
		peso = input.nextFloat();
		input.close();
		
		if (idade >= 12 && peso >= 60) {
			gotas = dosagem / 25;
			System.out.print("Conforme seu peso informado, o calculo da sua dosasegem é de gotas: " + gotas);
		}
		else if (idade >= 12 && peso < 60) {
			gotas = (dosagem - 125) / 25;
			System.out.print("Conforme seu peso informado, o calculo da sua dosasegem é de gotas: " + gotas);
		}
		else if (idade < 12 && peso > 30){
			gotas = (dosagem - 250) / 25;
			System.out.print("Conforme seu peso informado, o calculo da sua dosasegem é de gotas: " + gotas);
		}
		else if (idade < 12 && peso > 24 && peso <= 30) {
			gotas = (dosagem - 500) / 25;
			System.out.print("Conforme seu peso informado, o calculo da sua dosasegem é de gotas: " + gotas);
		}
		else if (idade < 12 && peso > 16 && peso <= 24) {
			gotas = (dosagem - 625) / 25;
			System.out.print("Conforme seu peso informado, o calculo da sua dosasegem é de gotas: " + gotas);
		}
		else if (idade < 12 && peso > 9 && peso <= 16) {
			gotas = (dosagem - 750) / 25;
			System.out.print("Conforme seu peso informado, o calculo da sua dosasegem é de gotas: " + gotas);
		}
		else if (idade < 12 && peso >= 5 && peso <= 9) {
			gotas = (dosagem - 875) / 25;
			System.out.print("Conforme seu peso informado, o calculo da sua dosasegem é de gotas: " + gotas);
		}
	}

}
