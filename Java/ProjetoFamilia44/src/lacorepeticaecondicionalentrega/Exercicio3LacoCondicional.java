/*
 * 3-	Faça um programa que receba a idade de uma pessoa e 
 *      mostre na saída em qual categoria ela se encontra:
 *      
•	10-14 infantil
•	15-17 juvenil
•	18-25 adulto

 */

package lacorepeticaecondicionalentrega;

import java.util.Scanner;

public class Exercicio3LacoCondicional {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade;
		String categoria = "";
		
		System.out.println("Informe a sua idade:");
		idade = leia.nextInt();
		leia.close();
		
		if (idade >= 10 && idade <= 14) {
			categoria = "'infantil'";
			
		} else if (idade >= 15 && idade <= 17) {
			categoria = "'juvenil'";
		
		}else if (idade >= 18 && idade <= 25) {
			categoria = "'adulto'";
		
		} else {
			System.out.println("\nVocê não se encontra em nenhuma categoria!");
		}
		
		if(categoria != "") {
			
			System.out.println("\nVocê se encontra na categoria "+ categoria + ".");
		}
	}

}
