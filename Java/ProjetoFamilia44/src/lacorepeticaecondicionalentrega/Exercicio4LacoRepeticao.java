/*
 * 4-	Uma empresa desenvolveu uma pesquisa para saber as características 
 * psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
 * era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
 * (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
 * agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150 
 * pessoas, calcule e mostre: (WHILE)
•	o número de pessoas calmas; 
•	o número de mulheres nervosas; 
•	o número de homens agressivos; 
•	o número de outros calmos;
•	o número de pessoas nervosas com mais de 40 anos; 
•	o número de pessoas calmas com menos de 18 anos.

 */

package lacorepeticaecondicionalentrega;

import java.util.Scanner;

public class Exercicio4LacoRepeticao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		int pessoa = 0;
		int idade;
		int sexo;
		int temperamento;
		int pCalmo = 0;
		int mNerv = 0;
		int hAgres = 0;
		int oCalmo = 0;
		int nerv40 = 0;
		int calm18 = 0;

		while (pessoa < 20) {
			pessoa++;
			sexo = 0;
			temperamento = 0;
			idade = 0;
			
			System.out.println("\t\tINDIVÍDUO " + pessoa);
			
			while(idade <= 0) {
				System.out.println("\nInforme a sua idade:");
				idade = leia.nextInt();
				
				if(idade <= 0) {
					System.out.println("A idade deve ser maior que 0.");
				}
			}

			while (sexo < 1 || sexo > 3) {
				System.out.println("\nInforme o seu sexo: ");
				System.out.println("1-Feminino \n2-Masculino \n3-Outros");
				sexo = leia.nextInt();

				if (sexo < 1 || sexo > 3) {
					System.out.println("\nOpção inválida!");
				}

			}
			while (temperamento < 1 || temperamento > 3) {
				System.out.println("\nInforme seu temperamento:");
				System.out.println("1-Calmo \n2-Nervoso \n3-Agressivo");
				temperamento = leia.nextInt();

				if (temperamento < 1 || temperamento > 3) {
					System.out.println("\nOpção inválida!");
				}

			}

			if (temperamento == 1) {

				pCalmo++;
			}

			if (sexo == 1 && temperamento == 2) {
				mNerv++;
			}

			if (sexo == 2 && temperamento == 3) {
				hAgres++;
			}

			if (sexo == 3 && temperamento == 1) {
				oCalmo++;

			}

			if (temperamento == 2 && idade > 40) {

				nerv40++;
			}

			if (temperamento == 1 && idade < 18) {

				calm18++;
			}
			
		}
		
		System.out.println("Número de pessoas calmas: " + pCalmo);
		System.out.println("Número de mulheres nervosas: " + mNerv);
		System.out.println("Número de homens agressivos: " + hAgres);
		System.out.println("Número de outros calmos: " + oCalmo);
		System.out.println("Número de pessoas nervosas com mais de 40 anos: " + nerv40);
		System.out.println("Número de pessoas calmas com menos de 18 anos: " + calm18);
		
	}

}
