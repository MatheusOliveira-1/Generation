/*
 * 8) Construa um sistema para ler uma variável numérica N e imprimi-la
 *  somente se a mesma for maior que 100, caso contrário imprimi-la com o valor zero.
 */

package lacoCondicional;

import java.util.Scanner;

public class Exercicio8 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int n = 0;
		
		System.out.println("Digite um número: ");
		n = leia.nextInt();
		
		if(n > 100) {
			System.out.println(n);
		
		} else {
			n = 0;
			
			System.out.println(n);
		}
		
	}

}
