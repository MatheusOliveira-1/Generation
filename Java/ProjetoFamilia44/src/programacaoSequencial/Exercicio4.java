/*4. Escreva  um sistema que leia tr�s n�meros inteiros e positivos (A, B, C)
 *  e calcule a seguinte express�o: D = (R + S) / 2, onde R = (A + B)� e S = (B + C)�.
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
	
	System.out.println("O valor de D �: "+ d);
	
	}
		
}
