/*
 * 4) Fa�a um sistema que leia um n�mero inteiro e mostre uma mensagem
 *  indicando se este n�mero � par ou �mpar, e se � positivo ou negativo.
 */

package lacoCondicional;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um n�mero");
		numero = leia.nextInt();
		
		if(numero % 2 == 0) {
			System.out.print("Este n�mero � par e ");
			
		} else {
			System.out.print("Este n�mero � �mpar e ");
		}
		
		if(numero >= 0) {
			System.out.print("positivo.");
			
		} else {
			System.out.print("negativo.");
		}
	}
	
}
