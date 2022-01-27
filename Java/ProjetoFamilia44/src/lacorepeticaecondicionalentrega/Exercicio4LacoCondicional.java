/*4-Faça um programa em que permita a entrada de um número qualquer
 *  e exiba se este número é par ou ímpar. Se for par exiba também a
 *  raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.
 */

package lacorepeticaecondicionalentrega;

import java.util.Scanner;

public class Exercicio4LacoCondicional {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
				
		double numero;
		
		System.out.println("Digite um número: ");
		numero = leia.nextDouble();
		leia.close();
		
		if(numero % 2 == 0) {
			
			System.out.println("Este número é par!\nA raiz quadrade de " + numero + " é " + (Math.sqrt(numero)));
		
		} else {
			
			System.out.println("Este número é ímpar!\n" + numero + "² = " + (Math.pow(numero, 2)));
		}
		

	}

}
