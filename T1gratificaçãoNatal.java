package moduloTarefasJava;

import java.util.Scanner;

public class T1gratificaçãoNatal {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		float horasFaltas;
		float horasExtras;
		float horas;
		
		System.out.print("Digite suas horas Extras: ");
		horasExtras = input.nextFloat();
		
		System.out.print("Digite suas horas Faltas: ");
		horasFaltas = input.nextFloat();
		
		input.close();
		
		horas = (horasExtras - (2/3 *(horasFaltas))) * 60;
		
		if (horas >= 2401) 
		{
			System.out.println("Tuas horas extras são: "+ horas + " e tua gratificação de natal e: R$ 500");	
		} 
		else if (horas >= 1801 && horas <= 2400) 
		{
			System.out.println("Tuas horas extras são: "+ horas + " e tua gratificação de natal e: R$ 400");
		}	
		else if (horas >= 1201 && horas <= 1800)
		{
			System.out.println("Tuas horas extras são: "+ horas + " e tua gratificação de natal e: R$ 300");
		}
		else if (horas >= 600 && horas <= 1200)
		{
			System.out.println("Tuas horas extras são: "+ horas + " e tua gratificação de natal e: R$ 200");
		}
		else 
		{
			System.out.println("Tuas horas extras são: "+ horas + " e tua gratificação de natal e: R$ 100");
		}
				
	}

}
