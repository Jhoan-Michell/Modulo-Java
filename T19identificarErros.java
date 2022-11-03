package moduloTarefasJava;

public class T19identificarErros {

	public static void main(String[] args) {
		
		
		//Tarefa 19 identificar erros (trechos)//
		
		/* a) 
			se (idade >= 65); 
  			mostre ("melhor idade");
		*/
		
		int idade = 70;
		
		if (idade >= 65) {
			System.out.println("Melhor idade"); //'Mostre' pelo Escreva... a saida da propia linguagem
		}
	
		/* b)
		 	se (genero = 1) 
  			mostre ("Masculino")
			senão (genero == 2)
  			mostre ("Feminino");
		 */
		
		int genero = 1;
		
		// erro de '=' corregido a exactamente igual a '=='
		if (genero == 1) {
			System.out.println("Masculino");
		}
		// erro na condição do else. 'Se ELSE não precisa declarar a condição'
		else {
			System.out.println("Femenino");
		}
		
		 /* c)
			se preco > 10.50
    		preco = preco * 1,2;
			senão
    		preco = preco * 1.35;
		 */
		
		double preco = 10;
		
		// erro de fechar a condição do IF pelos parenteses
		if (preco > 10.50) {
			preco = preco * 1.2; // e erro do '1,2' corregido a virgula pelo ponto a '1.2'
		}
		else {
			preco = preco * 1.35;
		}
	}
}
