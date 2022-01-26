/*
 * 4) Faça um sistema que leia um número inteiro e mostre uma mensagem
 *  indicando se este número é par ou ímpar, e se é positivo ou negativo.
 */

package lacoCondicional;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um número");
		numero = leia.nextInt();
		
		if(numero % 2 == 0) {
			System.out.print("Este número é par e ");
			
		} else {
			System.out.print("Este número é ímpar e ");
		}
		
		if(numero >= 0) {
			System.out.print("positivo.");
			
		} else {
			System.out.print("negativo.");
		}
	}
	
}
