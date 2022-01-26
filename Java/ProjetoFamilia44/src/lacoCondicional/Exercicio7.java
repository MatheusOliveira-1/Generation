/*
 * 7) Receber valores de base e altura de um triângulo
 *  e verificar se são valores válidos (positivos maiores que zero).
 *   Em caso afirmativo, calcular a área do triângulo.
 */

package lacoCondicional;

import java.util.Scanner;

public class Exercicio7 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float base;
		float altura;
		float area;
		
		System.out.println("Informe a medida da base do triângulo");
		base = leia.nextFloat();
		
		System.out.println("Informe a medida da altura do triângulo");
		altura = leia.nextFloat();		
		
		if(altura % 2 == 0 && base % 2 == 0 && altura > 0 && base > 0) {
			area = (base * altura ) / 2;
			System.out.println("A medida da área do triângulo é de: " + area);
			
		} else {
			System.out.println("Os valores da base e altura devem ser positivos e maiores que 0!");
		}
	}

}
