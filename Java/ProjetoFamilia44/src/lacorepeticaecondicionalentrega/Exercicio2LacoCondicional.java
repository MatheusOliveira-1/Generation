/*
 * 2-Faça um programa que entre com três números e coloque em ordem crescente.
 */

package lacorepeticaecondicionalentrega;

import java.util.Scanner;

public class Exercicio2LacoCondicional {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int n;
		int n1;
		int n2;
		int n3;
			
		System.out.println("Digite o primeiro número");
		n1 = leia.nextInt();
		
		System.out.println("Digite o segundo número");
		n2 = leia.nextInt();
		
		System.out.println("Digite o terceiro número");
		n3 = leia.nextInt();
		leia.close();
		
		/*if (n1 <= n2 && n1 <= n3) {  **** FIZ DESSA FORMA PRIMEIRO ANTES DE ****
			pos1 = n1;				   ****	EXCLUIR AS VARIÁVEIS DE POSIÇÃO   ****
			
			if(n2 <= n3) {
				pos2 = n2;
				pos3 = n3;
			} else {
				pos2 = n3;
				pos3 = n2;
			}
		}
		if (n2 <= n1 && n2 <= n3) {
			pos1 = n2;
			
			if(n1 <= n3) {
				pos2 = n1;
				pos3 = n3;
			} else {
				pos2 = n3;
				pos3 = n1;
			}
		}
		if (n3 <= n1 && n3 <= n2) {
			pos1 = n3;
			
			if(n1 < n2) {
				pos2 = n1;
				pos3 = n2;
			} else {
				pos2 = n2;
				pos3 = n1;
			}
		}*/
		
		if (n1 <= n2 && n1 <= n3) {	
			
			if(n2 >= n3) {				
				n = n2;
				n2 = n3;
				n3 = n;
			}
		}
		if (n2 <= n1 && n2 <= n3) {
			n = n1;
			n1 = n2;
			
			if(n <= n3) {
				n2 = n;
				
			} else {
				n2 = n3;
				n3 = n;
			}
		}
		if (n3 <= n1 && n3 <= n2) {
			n = n1;
			n1 = n3;
			
			if(n <= n2) {
				n3 = n2;
				n2 = n;
				
			} else {				
				n3 = n;
			}
		}
		
		System.out.println("Os valores na ordem crescente são: \n" + n1 + "\n" + n2 + "\n" + n3);

	}
}
