/*2. Faça um sistema que leia a idade de uma pessoa expressa em dias
 *  e mostre-a expressa em anos, meses e dias. 
 */

package programacaoSequencial;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		int totalDias;
		int ano;
		int dia;
		int mes;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Quantos dias de vida você tem?");
		totalDias = leia.nextInt();
		
		ano = totalDias / 365;
		mes = (totalDias % 365) / 30;
		dia = (totalDias % 365) % 30;
		
		System.out.println("Você tem " + ano + " ano(s), " + mes + " mes(es) e " + dia + " dia(s) de vida!");
		
	}

}
