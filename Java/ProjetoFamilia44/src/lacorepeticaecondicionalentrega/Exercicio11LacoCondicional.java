/*
 * 1-	Faça um programa que receba três inteiros e diga qual deles é o maior.
 */

package lacorepeticaecondicionalentrega;

import java.util.Scanner;

public class Exercicio11LacoCondicional {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		
		int n1;
		int n2;
		int n3;
		int maior = 0;
		
		System.out.println("Digite o primeiro número");
		n1 = leia.nextInt();
		
		System.out.println("Digite o segundo número");
		n2 = leia.nextInt();
		
		System.out.println("Digite o terceiro número");
		n3 = leia.nextInt();
		leia.close();
		
		if (n1 >= n2 && n1 >= n3) {
			maior = n1;
		
		} else if (n2 >= n1 && n2 >= n3){
			maior = n2;
		
		} else {
			maior = n3;
		}
		
		System.out.println("O maior número é: "+ maior );
		
	}

}
