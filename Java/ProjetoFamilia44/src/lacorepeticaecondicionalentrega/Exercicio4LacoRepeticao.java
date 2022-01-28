/*
 * 4-	Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas 
 * psicol�gicas dos indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas
 * era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as op��es
 * (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
 * agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150 
 * pessoas, calcule e mostre: (WHILE)
�	o n�mero de pessoas calmas; 
�	o n�mero de mulheres nervosas; 
�	o n�mero de homens agressivos; 
�	o n�mero de outros calmos;
�	o n�mero de pessoas nervosas com mais de 40 anos; 
�	o n�mero de pessoas calmas com menos de 18 anos.

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
			
			System.out.println("\t\tINDIV�DUO " + pessoa);
			
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
					System.out.println("\nOp��o inv�lida!");
				}

			}
			while (temperamento < 1 || temperamento > 3) {
				System.out.println("\nInforme seu temperamento:");
				System.out.println("1-Calmo \n2-Nervoso \n3-Agressivo");
				temperamento = leia.nextInt();

				if (temperamento < 1 || temperamento > 3) {
					System.out.println("\nOp��o inv�lida!");
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
		
		System.out.println("N�mero de pessoas calmas: " + pCalmo);
		System.out.println("N�mero de mulheres nervosas: " + mNerv);
		System.out.println("N�mero de homens agressivos: " + hAgres);
		System.out.println("N�mero de outros calmos: " + oCalmo);
		System.out.println("N�mero de pessoas nervosas com mais de 40 anos: " + nerv40);
		System.out.println("N�mero de pessoas calmas com menos de 18 anos: " + calm18);
		
	}

}
