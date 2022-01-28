/*
 * 4- Faça um programa que leia duas matrizes 2 x 2 com valores reais.
 *  Ofereça ao usuário um menu de opções:
 * (1) somar as duas matrizes 
 * (2) subtrair a primeira matriz da segunda 
 * (3) adicionar uma constante as duas matrizes
 * (4) imprimir as matrizes 
 * Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada.
 * Na terceira opção o valor da constante deve ser lido e o resultado da
 * adição da constante deve ser armazenado na própria matriz.
 */

package arrays;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		float[][] matriz1 = new float[2][2];
		float[][] matriz2 = new float[2][2];
		int opcao;
		int l = 0;
		int c = 0;

		for (l = 0; l < 2; l++) {

			for (c = 0; c < 2; c++) {

				System.out.println("Informe um valor para a matriz 1: ");
				matriz1[l][c] = leia.nextFloat();

				System.out.println("Informe um valor para a matriz 2: ");
				matriz2[l][c] = leia.nextFloat();

			}
		}

		do {
			System.out.println("\n\t\tESCOLHA UMA DAS OPÇÕES ABAIXO:");
			System.out.println("(1) Somar as duas matrizes");
			System.out.println("(2) Subtrair a primeira matriz da segunda");
			System.out.println("(3) Adicionar uma constante as duas matrizes");
			System.out.println("(4) Imprimir as matrizes ");
			System.out.println("(0) SAIR ");

			opcao = leia.nextInt();

			switch (opcao) {

			case 1:

				System.out.println("\n\t    SOMA DAS MATRIZES");

				System.out.println("\n Matriz 1\t Matriz 2\t RESULTADO");
				for (l = 0; l < 2; l++) {

					for (c = 0; c < 2; c++) {

						System.out.print("[" + matriz1[l][c] + "]");

						if (c == 1) {
							System.out.print("\t");

							for (c = 0; c < 2; c++) {
								System.out.print("[" + matriz2[l][c] + "]");

								if (c == 1) {

									System.out.print("\t");

									for (c = 0; c < 2; c++) {
										System.out.print("[" + (matriz1[l][c] + matriz2[l][c]) + "]");
									}
								}

							}
						}
					}
					System.out.println("");
				}
				break;
			case 2:

				System.out.println("\n\t  SUBTRAÇÃO DAS MATRIZES");

				System.out.println("\n Matriz 1\t Matriz 2\tRESULTADO");
				for (l = 0; l < 2; l++) {

					for (c = 0; c < 2; c++) {

						System.out.print("[" + matriz1[l][c] + "]");

						if (c == 1) {
							System.out.print("\t");

							for (c = 0; c < 2; c++) {
								System.out.print("[" + matriz2[l][c] + "]");

								if (c == 1) {

									System.out.print("\t");

									for (c = 0; c < 2; c++) {
										System.out.print("[" + (matriz2[l][c] - matriz1[l][c]) + "]");
									}
								}

							}
						}
					}
					System.out.println("");
				}
				break;
			case 3:

				System.out.println("\nInforme o valor da constante que será inserido nas matrizes:");
				final int constante = leia.nextInt();

				while (l != 1 && l != 2) {
					System.out.println("\nInforme o número da linha:");
					l = leia.nextInt();

					if (l != 1 && l != 2) {
						System.out.println("\nA linha " + l + " não existe!");
					}
				}
				while (c != 1 && c != 2) {
					System.out.println("\nInforme o número da coluna:");
					c = leia.nextInt();

					if (c != 1 && c != 2) {
						System.out.println("\nA coluna " + c + " não existe!");
					}
				}
				matriz1[(l - 1)][(c - 1)] = constante;
				matriz2[(l - 1)][(c - 1)] = constante;

				break;

			case 4:

				System.out.println("\n   IMPRESSÃO DAS MATRIZES");

				System.out.println("\n Matriz 1\t Matriz 2");
				for (l = 0; l < 2; l++) {

					for (c = 0; c < 2; c++) {

						System.out.print("[" + matriz1[l][c] + "]");

						if (c == 1) {
							System.out.print("\t");

							for (c = 0; c < 2; c++) {
								System.out.print("[" + matriz2[l][c] + "]");

							}
						}
					}
					System.out.println("");
				}
				break;

			default:
				if ((opcao != 0))
					System.out.println("Opcão inválida!");
				break;
			}
		} while (opcao != 0);
		leia.close();

	}
}
