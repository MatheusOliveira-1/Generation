/*
 * 1- Fa�a um programa que leia um n�mero inteiro e o imprima.
 */

package exerciciosFixacaoDeConteudo;

import java.util.Scanner;

 public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int num;
		
		System.out.println("Informe um n�mero: ");
		num = leia.nextInt();
		leia.close();
		
		System.out.println("\nO n�mero informado foi: " + num);

	}

}
