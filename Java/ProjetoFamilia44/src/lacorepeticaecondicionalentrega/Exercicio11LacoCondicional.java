/*
 * 1-	Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
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
		
		System.out.println("Digite o primeiro n�mero");
		n1 = leia.nextInt();
		
		System.out.println("Digite o segundo n�mero");
		n2 = leia.nextInt();
		
		System.out.println("Digite o terceiro n�mero");
		n3 = leia.nextInt();
		leia.close();
		
		if (n1 >= n2 && n1 >= n3) {
			maior = n1;
		
		} else if (n2 >= n1 && n2 >= n3){
			maior = n2;
		
		} else {
			maior = n3;
		}
		
		System.out.println("O maior n�mero �: "+ maior );
		
	}

}
