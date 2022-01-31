/*
 * 2- Faça um programa que leia um número real e o imprima.
 */

package exerciciosFixacaoDeConteudo;

import java.util.Scanner;

 public class Ex2 {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		
		float num;
		
		System.out.println("Informe um número: ");
		num = leia.nextFloat();
		leia.close();
		
		System.out.println("\nO número informado foi: " + num);

	}

}