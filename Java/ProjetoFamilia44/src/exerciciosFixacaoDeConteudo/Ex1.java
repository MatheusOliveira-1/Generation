/*
 * 1- Faça um programa que leia um número inteiro e o imprima.
 */

package exerciciosFixacaoDeConteudo;

import java.util.Scanner;

 public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int num;
		
		System.out.println("Informe um número: ");
		num = leia.nextInt();
		leia.close();
		
		System.out.println("\nO número informado foi: " + num);

	}

}
