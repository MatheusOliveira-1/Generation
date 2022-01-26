/*1. Faça um sistema que leia a idade de uma pessoa expressa em anos,
 *  meses e dias e mostre-a expressa apenas em dias. 
 */

package programacaoSequencial;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		int idade;
		int ano;
		int dia;
		int mes;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Quantos anos você tem?");
		ano = leia.nextInt();
		
		System.out.println("São " + ano + " ano(s) e quantos meses?");
		mes = leia.nextInt();
		
		System.out.println("São " + mes + " mes(es) e quantos dias?");
		dia = leia.nextInt();
		
		idade = (ano * 365) + (mes * 30) + dia;
		
		System.out.println("Você tem " + idade + " dia(s) de vida!");
		
	}

}
