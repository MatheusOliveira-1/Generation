/*4-Fa�a um programa em que permita a entrada de um n�mero qualquer
 *  e exiba se este n�mero � par ou �mpar. Se for par exiba tamb�m a
 *  raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.
 */

package lacorepeticaecondicionalentrega;

import java.util.Scanner;

public class Exercicio4LacoCondicional {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
				
		double numero;
		
		System.out.println("Digite um n�mero: ");
		numero = leia.nextDouble();
		leia.close();
		
		if(numero % 2 == 0) {
			
			System.out.println("Este n�mero � par!\nA raiz quadrade de " + numero + " � " + (Math.sqrt(numero)));
		
		} else {
			
			System.out.println("Este n�mero � �mpar!\n" + numero + "� = " + (Math.pow(numero, 2)));
		}
		

	}

}
