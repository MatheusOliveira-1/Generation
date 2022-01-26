/*1) Jo�o, homem de bem, comprou um microcomputador para controlar o rendimento di�rio de seu trabalho.
 *  Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do estado de S�o
 *   Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo excedente. Jo�o precisa que voc� fa�a 
 *   um sistema que leia a vari�vel P (peso de tomates) e verifique se h� excesso. Se houver, gravar na
 *    vari�vel E (Excesso) e na vari�vel M o valor da multa que Jo�o dever� pagar. Caso contr�rio mostrar
 *     tais vari�veis com o conte�do ZERO.
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
			System.out.println("Voc� excedeu o peso em " + e + "Kg(s), deve pagar multa de R$" + m + ".");
		} else {
			e = 0;
			m = 0;
			System.out.println("Peso excedido: " + e + "\nMulta: " + m);
		}
	}

}
