/*
 * 2- Faça um programa que receba 6 números inteiros e mostre: 
 * • Os números pares digitados;  
 * • A soma dos números pares digitados; 
 * • Os números ímpares digitados; 
 * • A quantidade de números ímpares digitados.

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
		
			System.out.println("Digite o " + (x + 1) + "º número:");
			numero[x] = leia.nextInt();
		
			if(numero[x] % 2 == 0) {
				
				somaPar += numero[x];
			} else {
				contImpar++;
			}
		
		}
		
		System.out.print("\nOs números pares digitados foram: ");
		
		for(int x  = 0; x < 6; x++) {
			
			if (numero[x] % 2 == 0) {
				System.out.print("[" + numero[x] + "]");
			}
		}
		System.out.print("\nA soma dos números pares digitados é: " + somaPar);
		
		System.out.print("\nOs números ímpares digitados foram: ");
		
		for(int x  = 0; x < 6; x++) {
			
			if (numero[x] % 2 != 0) {
				System.out.print("[" + numero[x] + "]");
			}
			
			
		}
		
		System.out.print("\nForam digitados " + contImpar + " números ímpares");
	}

}
