/*
 * 5-	Crie um programa que leia um n�mero do teclado at� que
 *  	encontre um n�mero igual a zero. No final, mostre a soma dos
 *   	n�meros digitados.(DO...WHILE)
 */

package lacorepeticaecondicionalentrega;

import java.util.Scanner;

public class Exercicio5LacoRepeticao {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num = 0;
		int soma = 0;
		
		do {
			soma += num;
			
			System.out.println("\nDigite um n�mero:");
			num = leia.nextInt();			
			
		}while (num != 0);

		System.out.println("A soma dos n�meros digitados �: " + soma );
	}
	
}
