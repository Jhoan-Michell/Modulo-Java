package moduloTarefasJava;
import java.util.Scanner;
public class FOR_T3_estadistica {

	public static void main(String[] args) {
		 String cidade = "", inCidade = "";
		 int mediaVehiculos = 0, acciMenor = 0, acciAnterior = 0, acciSiguinte = 0, acciMaior = 0;
		 String[] city = {null, " ", " ", " ", " ", " "};
		
		 Scanner input = new Scanner(System.in);
		 
		 for (int i = 1; i <= 5; i++) {
		 System.out.println("Informe "+i+"° cidade de pesquiça: ");
		 city[i] = input.nextLine();
		 
		 System.out.println("informe o codigo da cidade: '"+ city[i]+"'");
		 int codigo = input.nextInt();
		 
		 System.out.println("informe o numero de vehiculos de paseo na cidade '"+ city[i]+"'");
		 int nrovehiculosPaseo = input.nextInt();
		 
		 System.out.println("informe o numero de accidentes de transito na cidade '"+ city[i]+"'");
		 int accidentes = input.nextInt();
		 
		 mediaVehiculos += nrovehiculosPaseo;
		 
		 switch (i) {
		case 1: {
			acciAnterior = accidentes;
			}
		case 2: {
			 	acciSiguinte = accidentes;
			if (acciAnterior < acciSiguinte) {
				cidade = city[1];
				acciMenor = acciAnterior;
			}
			else {
				cidade = city[i];
				acciMenor = acciSiguinte;
			}
		}
		case 3: {
			acciSiguinte = accidentes;
			if (acciMenor < acciSiguinte) {
				cidade = cidade;
				acciMenor = acciMenor;
			}
			else {
				acciMenor = acciSiguinte;
				cidade = city[i];
			}
		}
		case 4: {
			acciSiguinte = accidentes;
			if (acciMenor < acciSiguinte) {
				cidade = cidade;
				acciMenor = acciMenor;
			}
			else {
				cidade = city[i];
				acciMenor = acciSiguinte;
			}
		}
		case 5: {
			acciSiguinte = accidentes;
			if (acciMenor < acciSiguinte) {
				cidade = cidade;
				acciMenor = acciMenor;
			}
			else {
				cidade = city[i];
				acciMenor = acciSiguinte;
			}
		}
			
		 }
		 
		 switch (i) {
			case 1: {
				acciAnterior = accidentes;
				}
			case 2: {
				 	acciSiguinte = accidentes;
				if (acciAnterior > acciSiguinte) {
					inCidade = city[1];
					acciMaior = acciAnterior;
				}
				else {
					inCidade = city[i];
					acciMaior = acciSiguinte;
				}
			}
			case 3: {
				acciSiguinte = accidentes;
				if (acciMaior > acciSiguinte) {
					inCidade = inCidade;
					acciMaior = acciMaior;
				}
				else {
					acciMaior = acciSiguinte;
					inCidade = city[i];
				}
			}
			case 4: {
				acciSiguinte = accidentes;
				if (acciMaior > acciSiguinte) {
					inCidade = inCidade;
					acciMaior = acciMaior;
				}
				else {
					cidade = city[i];
					acciMaior = acciSiguinte;
				}
			}
			case 5: {
				acciSiguinte = accidentes;
				if (acciMaior > acciSiguinte) {
					inCidade = inCidade;
					acciMaior = acciMaior;
				}
				else {
					inCidade = city[i];
					acciMaior = acciSiguinte;
				}
			}
				
			 }
		 input.nextLine();
		}
	mediaVehiculos = mediaVehiculos / 5;
	System.out.println("A media de vehiculos de paseo nas 5 cidades juntas é de: "+ mediaVehiculos);
	System.out.println("A cidade: "+ cidade + " com o indice menor de accidentes de transito é: "+ acciMenor);
	System.out.println("A cidade: "+ inCidade + " com o indice menor de accidentes de transito é: "+ acciMaior);
   }
}
