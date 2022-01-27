/*
 * 2-	Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
 */

package lacorepeticaecondicionalentrega;

import java.util.Scanner;

public class Exercicio2LacoRepeticao {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero;
		int par = 0;
		int impar = 0;
		
		for(int cont = 0; cont <= 9; cont++) {
			
			System.out.println("Digite um número:");
			numero = leia.nextInt();
			
			if(numero % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}
		
		System.out.println("Foram digitados " + par + " números pares e " + impar + " números ímpares.");
		
	}

}
