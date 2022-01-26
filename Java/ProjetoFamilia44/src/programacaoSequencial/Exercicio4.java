/*4. Escreva  um sistema que leia três números inteiros e positivos (A, B, C)
 *  e calcule a seguinte expressão: D = (R + S) / 2, onde R = (A + B)² e S = (B + C)².
 */
   
package programacaoSequencial;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	
	double a;
	double b;
	double c;
	double d;
	double r;
	double s;
	
	System.out.println("Informe o valor de A: ");
	a = leia.nextInt();
	
	System.out.println("Informe o valor de B: ");
	b = leia.nextInt();
	
	System.out.println("Informe o valor de C: ");
	c = leia.nextInt();
	
	r = Math.pow((a + b), 2);
	s = Math.pow((b + c), 2);
	
	d = (r + s) / 2;
	
	System.out.println("O valor de D é: "+ d);
	
	}
		
}
