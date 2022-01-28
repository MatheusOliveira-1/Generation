/*
 * 3- Leia uma matriz 3 x 3, conte e escreva quantos
 *    valores maiores que 10 ela possui.
 */

package arrays;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		int[][] matriz = new int[3][3];
		int maiorDez = 0;

		for (int x = 0; x < 3; x++) {

			for (int y = 0; y < 3; y++) {
				System.out.println("Informe um valor: ");
				matriz[x][y] = leia.nextInt();

				if (matriz[x][y] > 10) {
					maiorDez++;
				}
			}
		}

		System.out.println("");

		for (int x = 0; x < 3; x++) {

			for (int y = 0; y < 3; y++) {

				if (matriz[x][y] < 10) {
					System.out.print("[0" + matriz[x][y] + "]");
				} else {
					System.out.printf("[" + matriz[x][y] + "]");
				}

			}
			System.out.println("");
		}

		System.out.println("\nA matriz possui " + maiorDez + " valore(s) maior(es) que 10.");
	}

}
