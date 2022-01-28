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

		for (int i = 0; i < 2; i++) {

			for (int j = 0; j < 2; j++) {

				System.out.println("Informe um valor para a matriz 1: ");
				matriz1[i][j] = leia.nextFloat();

				System.out.println("Informe um valor para a matriz 2: ");
				matriz2[i][j] = leia.nextFloat();

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
				for (int i = 0; i < 2; i++) {

					for (int j = 0; j < 2; j++) {

						System.out.print("[" + matriz1[i][j] + "]");

						if (j == 1) {
							System.out.print("\t");

							for (j = 0; j < 2; j++) {
								System.out.print("[" + matriz2[i][j] + "]");

								if (j == 1) {

									System.out.print("\t");

									for (j = 0; j < 2; j++) {
										System.out.print("[" + (matriz1[i][j] + matriz2[i][j]) + "]");
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
				for (int i = 0; i < 2; i++) {

					for (int j = 0; j < 2; j++) {

						System.out.print("[" + matriz1[i][j] + "]");

						if (j == 1) {
							System.out.print("\t");

							for (j = 0; j < 2; j++) {
								System.out.print("[" + matriz2[i][j] + "]");

								if (j == 1) {

									System.out.print("\t");

									for (j = 0; j < 2; j++) {
										System.out.print("[" + (matriz2[i][j] - matriz1[i][j]) + "]");
									}
								}

							}
						}
					}
					System.out.println("");
				}
				break;
			case 3:
				int l = 0;
				int c = 0; 
				int constante;
				while (opcao != 1 && opcao != 2) {
					System.out.println("\nInforme o número da matriz em que deseja incluir a constante: Matriz 1 ou Matriz 2");
					opcao = leia.nextInt();

					if (opcao != 1 && opcao != 2) {
						System.out.println("\nA Matriz " + opcao + " não existe, por favor escolha 1 ou 2.");
					}
				}
				
				while (l != 1 && l != 2) {
				System.out.println("\nInforme o número da linha");
				l = leia.nextInt();
				

				if (l != 1 && l != 2) {
					System.out.println("\nA linha " + l + " não existe na Matriz " + opcao);
				}
			}
				while (c != 1 && c != 2) {
					System.out.println("\nInforme o número da coluna");
					c = leia.nextInt();
					

					if (c != 1 && c != 2) {
						System.out.println("\nA coluna " + c + " não existe na Matriz " + opcao);
					}
				}
				System.out.println("\nInforme o valor da constante:");
				constante = leia.nextInt();
				
				switch(opcao) {
					
					case 1:
						matriz1[(l -1)][(c - 1)] = constante;
						break;
						
					case 2:
						matriz2[(l -1)][(c - 1)] = constante;
				}

				break;

			case 4:

				System.out.println("\n   IMPRESSÃO DAS MATRIZES");

				System.out.println("\n Matriz 1\t Matriz 2");
				for (int i = 0; i < 2; i++) {

					for (int j = 0; j < 2; j++) {

						System.out.print("[" + matriz1[i][j] + "]");

						if (j == 1) {
							System.out.print("\t");

							for (j = 0; j < 2; j++) {
								System.out.print("[" + matriz2[i][j] + "]");

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
