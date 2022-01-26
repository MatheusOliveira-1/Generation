/*2) Elabore um sistema que leia as variáveis C e N, respectivamente
 *  código e número de horas trabalhadas de um operário. E calcule o
 *   salário sabendo-se que ele ganha R$ 10,00 por hora. Quando o 
 *   número de horas exceder a 50 calcule o excesso de pagamento 
 *   armazenando-o na variável E, caso contrário zerar tal variável.
 *    A hora excedente de trabalho vale R$ 20,00. No final do 
 *    processamento imprimir o salário total e o salário excedente.
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

		System.out.println("Informe o código do operário:");
		c = leia.nextInt();

		System.out.println("Informe o núemro de horas trabalhadas:");
		n = leia.nextInt();

		if (n > 50) {
			e = (n - 50) * 20;
			salarioTotal = (n - (n - 50)) * 10 + e;

			System.out.println("Salário total: " + salarioTotal + "\nSalario excedente: " + e);
		} else {
			salarioTotal = n * 10 + e;
			
			System.out.println("Salário total: " + salarioTotal + "\nSalario excedente: " + e);
		}

	}
}
