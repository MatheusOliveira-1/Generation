/*
 * 2- Fa�a um programa que leia um n�mero real e o imprima.
 */

package exerciciosFixacaoDeConteudo;

import java.util.Scanner;

 public class Ex2 {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		
		float num;
		
		System.out.println("Informe um n�mero: ");
		num = leia.nextFloat();
		leia.close();
		
		System.out.println("\nO n�mero informado foi: " + num);

	}

}