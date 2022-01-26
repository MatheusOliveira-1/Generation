/*
 * 3) Desenvolva um sistema em que:
•Leia 4 (quatro) números;
•Calcule o quadrado de cada um;
•Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
•Caso contrário, imprima os valores lidos e seus respectivos quadrados.

 */

package lacoCondicional;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double n1;
		double n2;
		double n3;
		double n4;
		
		System.out.println("Informe o valor do primeiro número");
		n1 = leia.nextFloat();
		

		System.out.println("Informe o valor do segundo número");
		n2 = leia.nextFloat();
		

		System.out.println("Informe o valor do terceiro número");
		n3 = leia.nextFloat();
		

		System.out.println("Informe o valor do quarto número");
		n4 = leia.nextFloat();
		
		n1 = Math.pow(n1, 2);
		n2 = Math.pow(n2, 2);
		n3 = Math.pow(n3, 2);
		n4 = Math.pow(n4, 2);
		
		if(n3 >= 1000) {
			System.out.println("\n" + n3);
		} else {
			System.out.println("\n" + (Math.sqrt(n1)) + "² = " + n1);
			System.out.println((Math.sqrt(n2)) + "² = " + n2);
			System.out.println((Math.sqrt(n3)) + "² = " + n3);
			System.out.println((Math.sqrt(n4)) + "² = " + n4);
		}
	}

}
