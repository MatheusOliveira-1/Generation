/*6-Escrever um programa que receba vários números inteiros
 *  no teclado. E no final imprimir a média dos números múltiplos
 *   de 3. Para sair digitar 0(zero).(DO...WHILE)
 */

package lacorepeticaecondicionalentrega;

import java.util.Scanner;

public class Exercicio6LacoRepeticao {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float numero;
		float cont = 0;
		float soma = 0;
		
		System.out.println("Digite um número:");
		numero = leia.nextFloat();
		
		do {
			
			if (numero % 3 == 0) {
				cont++;
				soma += numero;
			}
			System.out.println("Digite um número:");
			numero = leia.nextFloat();		
					
		}while(numero != 0);
		
		System.out.println("A média dos números múltiplos de 3 é :" + (soma / cont));

	}

}
