/*7. Um sistema de equações lineares do tipo: ax + by = c, dx + ey = f
 , pode ser resolvido segundo mostrado abaixo : 
   
Escreva um sistema que lê os coeficientes a,b,c,d,e e f e
 calcula e mostra os valores de x e y. 
*/

package programacaoSequencial;

import java.util.Scanner;

public class Exercicio7 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int x;
		int y;
		
		System.out.println("Informe o valor de 'a':");
		a = leia.nextInt();
		
		System.out.println("Informe o valor de 'b':");
		b = leia.nextInt();
		
		System.out.println("Informe o valor de 'c':");
		c = leia.nextInt();
		
		System.out.println("Informe o valor de 'd':");
		d = leia.nextInt();
		
		System.out.println("Informe o valor de 'e':");
		e = leia.nextInt();
		
		System.out.println("Informe o valor de 'f':");
		f = leia.nextInt();
		
		x = ((c * e) - (b * f)) / ((a * e) - (b * d));
		y = ((a * f) - (c * d)) / ((a * e) - (b * d));
		
		System.out.println("\nx = " + x + "\ny = " + y);
		
	}

}
