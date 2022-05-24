package calculomediafundamental;

import java.util.Scanner;

public class mediafundamental {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		//declaracao variaveis
		int ra, a1 = 0, a2 = 0, a3 = 0;
		
		//laco de repeticao
		do {
			//exibicao de texto
			System.out.println("informe seu ra:");
			
			//atribuicao de valor
			ra = leia.nextInt();
			
			//condicao
			if (ra == 0) {
				System.out.println("ra invalido");

				//condicao negativa
			} else {
				System.out.println("primeira nota:");
				a1 = leia.nextInt();
				System.out.println("\nsegunda nota:");
				a2 = leia.nextInt();
				System.out.println("\nterceita nota:");
				a3 = leia.nextInt();
			}
			
			//finalizando repeticao
		} while (ra == 0);
		
		// atribuicao de valor
		float media = (a1 + a2 + a3) / 3;
		
		//condicao
		if (media >= 8) {
			System.out.println("aluno aprovado!");
		} else if (medoa < 8 && media > 6) {
			System.out.println("precisa de recuperacao!");
		} else if (media <= 6) {
			System.out.println("esta em recuperacao!");
		}
		//encerrando
		leia.close();

	}
}
