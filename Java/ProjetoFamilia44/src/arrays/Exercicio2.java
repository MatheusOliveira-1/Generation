/*
 * 2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
 * � Os n�meros pares digitados;  
 * � A soma dos n�meros pares digitados; 
 * � Os n�meros �mpares digitados; 
 * � A quantidade de n�meros �mpares digitados.

 */

package arrays;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int[] numero = new int [6];
		int somaPar = 0;
		int contImpar = 0;
		
		for(int x = 0; x < 6; x++) {
		
			System.out.println("Digite o " + (x + 1) + "� n�mero:");
			numero[x] = leia.nextInt();
		
			if(numero[x] % 2 == 0) {
				
				somaPar += numero[x];
			} else {
				contImpar++;
			}
		
		}
		
		System.out.print("\nOs n�meros pares digitados foram: ");
		
		for(int x  = 0; x < 6; x++) {
			
			if (numero[x] % 2 == 0) {
				System.out.print("[" + numero[x] + "]");
			}
		}
		System.out.print("\nA soma dos n�meros pares digitados �: " + somaPar);
		
		System.out.print("\nOs n�meros �mpares digitados foram: ");
		
		for(int x  = 0; x < 6; x++) {
			
			if (numero[x] % 2 != 0) {
				System.out.print("[" + numero[x] + "]");
			}
			
			
		}
		
		System.out.print("\nForam digitados " + contImpar + " n�meros �mpares");
	}

}
