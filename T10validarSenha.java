package moduloTarefasJava;

import java.util.Scanner;
public class T10validarSenha {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int senha = 1234;
		int senhaUsu;
		
		System.out.print("Digite a sua senha: ");
		senhaUsu = input.nextInt();
		input.close();
		
		if (senhaUsu == senha) {
			System.out.print("Senha valida... ACESSO PERMITIDO");
		}
		else {
			System.err.print("senha invalida... ACESSO NEGADO");
		}
	}

}
