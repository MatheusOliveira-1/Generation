/*
 * 3-	Solicitar a idade de várias pessoas e imprimir: Total de pessoas
 *  	com menos de 21 anos. Total de pessoas com mais de 50 anos. O programa
 *  	termina quando idade for =-99. (WHILE)
 */

package lacorepeticaecondicionalentrega;

import java.util.Scanner;

public class Exercicio3LacoRepeticao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		int idade = 0;
		int menos21 = 0;
		int mais50 = 0;

		while (idade != -99) {

			System.out.println("Informe sua idade:");
			idade = leia.nextInt();

			if (idade < 21 && idade > 0) {
				menos21++;
			}

			if (idade > 50) {
				mais50++;
			}
		}

		System.out.println("\nTotal de pessoas com menos de 21 anos: " + menos21);
		System.out.println("\nTotal de pessoas com mais de 50 anos: " + mais50);
	}

}
