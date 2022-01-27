/*5-Fa�a um programa que mostre um Menu com op��es de um card�pio
 *  de restaurante para uma pessoa. A pessoa vai escolher o prato desejado: 
Ap�s escolher o prato, o programa dever� fazer uma pergunta ao usu�rio, se 
ele aceita pagar a gorjeta do gar�om 10% sobre o valor do prato. Se o usu�rio 
aceitar, mostrar o valor final (valor do prato + 10%), caso contr�rio, mostrar
 o valor final (somente o valor do prato).
 
Codigo		 Prato		 	Valor 
1 		Picanha 		25,00 
2 		Lasanha 		20,00 
3 		Strogonoff 		18,00 
4 		Bife Acebolado 	15,00 
5 		P�o com ovo 		5,00 
*/

package lacorepeticaecondicionalentrega;

import java.util.Scanner;

public class Exercicio5LacoCondicional {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int codigo;
		int gorjeta;
		float prato = 0;
		
		System.out.println("POR FAVOR ESCOLHA UMA OP��O ABAIXO\n");
		System.out.println("C�DIGO	 PRATO		 	VALOR ");
		System.out.println("1 	Picanha 		25,00 ");
		System.out.println("2 	Lasanha 		20,00 ");
		System.out.println("3 	Strogonoff 		18,00 ");
		System.out.println("4 	Bife Acebolado 		15,00 ");
		System.out.println("5 	P�o com ovo 		5,00 ");
		codigo = leia.nextInt();
		
		switch (codigo) {
		
			case 1:
				prato = 25;
				System.out.println("Prato escolhido: Picanha");
				break;
			case 2:
				prato = 20;
				System.out.println("Prato escolhido: Lasanha");
				break;
			case 3:
				prato = 18;
				System.out.println("Prato escolhido: Strogonoff");
				break;
			case 4:
				prato = 15;
				System.out.println("Prato escolhido: Bife Acebolado");
				break;
			case 5:
				prato = 5;
				System.out.println("Prato escolhido: P�o com ovo");
				break;
			default:
				System.out.println("Op��o inv�lida!");
				break;
		}
		
		System.out.println("Aceita pagar gorgeta ao gar�om? \nDigite 1 para SIM ou 2 para N�O");
		gorjeta = leia.nextInt();
		leia.close();
		
		switch (gorjeta) {
				
			case 1:
				System.out.println("O valor final a ser pago � R$" + (prato + (prato *= 0.10))); 
				break;
				
			case 2:
				System.out.println("O valor final a ser pago � R$" + prato);
				break;
		
		}
	}
	
}
