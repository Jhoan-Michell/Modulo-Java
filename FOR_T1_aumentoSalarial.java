package moduloTarefasJava;

public class FOR_T1_aumentoSalarial {

	public static void main(String[] args) {

		double salarioAcumulado, reajusteSalarial = 0;
		int anoFinal = 2017;
		double aumento = 0.015;
		
		for (int i = 2000; i <= anoFinal; i++) {
			
			float salarioInicial = 1000;
			
			if (i == 2000) {
			System.out.println("Ano: " + i + " Salario Incial: " + salarioInicial + " Seu Porcentual de aumento é: 0.0" + " Salario Acumulado" + salarioInicial);
			}
			else if (i == 2001) {
				reajusteSalarial = salarioInicial * aumento;
				salarioAcumulado = salarioInicial + reajusteSalarial;
				System.out.println("Ano: " + i + " Salario Incial: " + salarioInicial + " %: " + aumento + " Reajuste Salarial: " + reajusteSalarial + " Salario Acumulado: " + salarioAcumulado);
			}
			else {
				reajusteSalarial = salarioInicial * aumento;
				salarioAcumulado = salarioInicial + reajusteSalarial;
				aumento += 2;
				reajusteSalarial = salarioAcumulado * aumento;
				salarioAcumulado = salarioAcumulado + reajusteSalarial;
				System.out.println("Ano: " + i + " %: " + aumento + " Reajuste Salarial: " + reajusteSalarial + " Salario Acumulado: " + salarioAcumulado);
			}
		}
    }
}

