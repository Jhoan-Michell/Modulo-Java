package moduloTarefasJava;

import java.util.Scanner;

public class While_T4_Audiencia {

	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
		
		boolean loop = true;
		int nroChannel;
		int nroPeople;
		int home4 = 0, home5 = 0, home7 = 0, home12 = 0;
		double audiencia = 0;
		
		while (loop) {
			double porcentagem4, porcentagem5, porcentagem7, porcentagem12;
			
			System.out.print("Informe o numero de pessoas assitiendo a TV: ");
			nroPeople = input.nextInt();
			
			System.out.print("( 4, 5, 7, 12) Informe o numero do Canal: ");
			nroChannel = input.nextInt();
			
			
			
			switch (nroChannel) {
			case 4: {
				home4 += 1;
				audiencia += nroPeople;
				porcentagem4 = ((audiencia / 100)* home4) * 100;
				continue;
			}
			case 5: {
				home5 += 1;
				audiencia += nroPeople;
				porcentagem5 = ((audiencia / 100)* home5) * 100;
				continue;
			}
			case 7: {
				home7 += 1;
				audiencia += nroPeople;
				porcentagem7 = ((audiencia / 100)* home7) * 100;
				continue;
			}
			case 12: {
				home12 += 1;
				audiencia += nroPeople;
				porcentagem12 = ((audiencia / 100)* home12) * 100;
				continue;
			}
			case 0: {
				porcentagem4 = ((audiencia / 100)* home4) * 100;
				porcentagem5 = ((audiencia / 100)* home5) * 100;
				porcentagem7 = ((audiencia / 100)* home7) * 100;
				porcentagem12 = ((audiencia / 100)* home12) * 100;
				System.out.println("Os dados estão no sistema e o resultado canal: 4 é:\n" + porcentagem4 + "% de numero de casas: " + home4);
				System.out.println("Os dados estão no sistema e o resultado canal: 5  é:\n" + porcentagem5 + "% de numero de casas: " + home5);
				System.out.println("Os dados estão no sistema e o resultado canal: 5  é:\n" + porcentagem7 + "% de numero de casas: " + home7);
				System.out.println("Os dados estão no sistema e o resultado canal: 12  é:\n" + porcentagem12 + "% de numero de casas: " + home12);
				loop = false;
				break;	
			}
		}
	}
	input.close();	
  }
}
