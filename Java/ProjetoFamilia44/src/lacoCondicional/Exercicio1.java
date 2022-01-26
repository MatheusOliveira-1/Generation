/*1) João, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho.
 *  Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do estado de São
 *   Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo excedente. João precisa que você faça 
 *   um sistema que leia a variável P (peso de tomates) e verifique se há excesso. Se houver, gravar na
 *    variável E (Excesso) e na variável M o valor da multa que João deverá pagar. Caso contrário mostrar
 *     tais variáveis com o conteúdo ZERO.
 */

package lacoCondicional;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		float p;
		float e;
		float m;

		System.out.println("Informe o peso do tomate: ");
		p = leia.nextFloat();

		if (p > 50) {
			e = (p - 50);
			m = e * 4;
			System.out.println("Você excedeu o peso em " + e + "Kg(s), deve pagar multa de R$" + m + ".");
		} else {
			e = 0;
			m = 0;
			System.out.println("Peso excedido: " + e + "\nMulta: " + m);
		}
	}

}
