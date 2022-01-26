/*2) Elabore um sistema que leia as vari�veis C e N, respectivamente
 *  c�digo e n�mero de horas trabalhadas de um oper�rio. E calcule o
 *   sal�rio sabendo-se que ele ganha R$ 10,00 por hora. Quando o 
 *   n�mero de horas exceder a 50 calcule o excesso de pagamento 
 *   armazenando-o na vari�vel E, caso contr�rio zerar tal vari�vel.
 *    A hora excedente de trabalho vale R$ 20,00. No final do 
 *    processamento imprimir o sal�rio total e o sal�rio excedente.
 */

package lacoCondicional;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int c;
		int n = 0;
		int e = 0;
		int salarioTotal;

		System.out.println("Informe o c�digo do oper�rio:");
		c = leia.nextInt();

		System.out.println("Informe o n�emro de horas trabalhadas:");
		n = leia.nextInt();

		if (n > 50) {
			e = (n - 50) * 20;
			salarioTotal = (n - (n - 50)) * 10 + e;

			System.out.println("Sal�rio total: " + salarioTotal + "\nSalario excedente: " + e);
		} else {
			salarioTotal = n * 10 + e;
			
			System.out.println("Sal�rio total: " + salarioTotal + "\nSalario excedente: " + e);
		}

	}
}
