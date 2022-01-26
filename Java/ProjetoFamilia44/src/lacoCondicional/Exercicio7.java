/*
 * 7) Receber valores de base e altura de um tri�ngulo
 *  e verificar se s�o valores v�lidos (positivos maiores que zero).
 *   Em caso afirmativo, calcular a �rea do tri�ngulo.
 */

package lacoCondicional;

import java.util.Scanner;

public class Exercicio7 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float base;
		float altura;
		float area;
		
		System.out.println("Informe a medida da base do tri�ngulo");
		base = leia.nextFloat();
		
		System.out.println("Informe a medida da altura do tri�ngulo");
		altura = leia.nextFloat();		
		
		if(altura % 2 == 0 && base % 2 == 0 && altura > 0 && base > 0) {
			area = (base * altura ) / 2;
			System.out.println("A medida da �rea do tri�ngulo � de: " + area);
			
		} else {
			System.out.println("Os valores da base e altura devem ser positivos e maiores que 0!");
		}
	}

}
