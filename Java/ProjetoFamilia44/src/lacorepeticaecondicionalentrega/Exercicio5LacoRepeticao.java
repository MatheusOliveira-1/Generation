/*
 * 5-	Crie um programa que leia um número do teclado até que
 *  	encontre um número igual a zero. No final, mostre a soma dos
 *   	números digitados.(DO...WHILE)
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
			
			System.out.println("\nDigite um número:");
			num = leia.nextInt();			
			
		}while (num != 0);

		System.out.println("A soma dos números digitados é: " + soma );
	}
	
}
