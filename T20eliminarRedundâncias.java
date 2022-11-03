package moduloTarefasJava;

public class T20eliminarRedundâncias {

	public static void main(String[] args) {
		
		//Elimine os testes reduntantes do trecho de código abaixo: 
		
		/* Exemplo 1
		  
		  se (a>b) entao 
		  	  escreva("o maior e:", a);
		  senao
		  	  se (b>=a) entao	
		  	  	  escreva("o maior e:", b);
		 	  fimse
		  fimse	  
		 */
		
		int a, b;
		a = 10;
		b = 20;
		
		if (a > b) {
			System.out.println("O maior e: " + a);
		}
		else {
			System.out.println("O maior e: " + b);
		}
		
		/* Exemplo 1
		  
		  se (x > 10) entao 
		  	  escreva("valor maior do que: 10");
		  senao
		  	  se (x <= 10 && x > 5) entao	
		  	  	  escreva("Menor ou igual a 10 e maior do que 5");
		 	  senao 
		 	      se (x <= 5) entao
		 	          escreva("Menor ou igual a 5");
		 	      fimse
		      fimse
		  fimse    	  
		 */
		
		int x = 10;
		
		if (x > 10) {
			System.out.println("Valor maior do que: 10");
		}
		else if (x <= 10 && x > 5) {
			System.out.println("Menor ou igual a 10 e maior do que 5");
		}
		else {
			System.out.println("Menor ou igual a 5");
		}
		
	}	

}
