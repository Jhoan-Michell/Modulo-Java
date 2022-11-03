package moduloTarefasJava;

import java.util.Scanner;

public class T25creditoParaAlunos {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		double salarioBruto, valorEmprestimo, emprestimo;
		double valorParcelas;
		int nroParcelas;
		
		System.out.print("Informe seu salario bruto: ");
		salarioBruto = input.nextFloat();
		
		System.out.print("Digite o valor de emprestimo: ");
		valorEmprestimo = input.nextDouble();
		 
		System.out.print("Digite o nro de parcelas: ");
		nroParcelas = input.nextInt();
		
		input.close();
		
		emprestimo = salarioBruto * 0.30;
		valorParcelas = valorEmprestimo / nroParcelas;
		
		if (valorEmprestimo > emprestimo) {
			System.out.println("O valor de emprestimo ultrapassa o valor do emprestimo disponivel: R$ "+ emprestimo);
		}
		else {
			System.out.println("Seu emprestimo esta sendo processado, no valor de: R$ "+ valorEmprestimo  +"\nCom numero de parcelas de: "+ nroParcelas + "\nCom um valor de parcelas de: R$ "+ valorParcelas);
		}
	}

}
