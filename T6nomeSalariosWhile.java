package moduloTarefasJava;

import java.util.Scanner;
public class T6nomeSalariosWhile {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		double salarioCarlos;
		double salarioJoao;
		double poupancaCarlos;
		double rendaFixaJoao;
		int mes = 1;
		
		System.out.print("Digite o seu salario: ");
		salarioCarlos = input.nextDouble();
		input.close();
		
		salarioJoao = 1/3 * salarioCarlos;
		poupancaCarlos = salarioCarlos + (salarioCarlos * 0.02);
		rendaFixaJoao = salarioJoao + (salarioCarlos * 0.05);
		
		
		while (mes > 0) {
			   if (rendaFixaJoao >= poupancaCarlos) {
				   System.out.println("Mes: " + mes +" A renda fixa de joão e de: " + rendaFixaJoao + " E a poupansa de Carlos e de: " + poupancaCarlos); 
			       break;
			 } 
			 else 
			 {
				System.out.println("Mes: " + mes +" A renda fixa de joão e de: " + rendaFixaJoao + " E a poupansa de Carlos e de: " + poupancaCarlos);
				poupancaCarlos = poupancaCarlos + (poupancaCarlos * 0.02);
				rendaFixaJoao = rendaFixaJoao + (rendaFixaJoao * 0.05);
				mes += 1;
			 continue;
			 }
		}
	}

}
