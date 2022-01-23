/*4.	Crie um programa que receba valores do usuário para preencher uma matriz 3X3, 
 * e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira diagonal, 
 * ou seja, diagonal principal.
 */

programa
{
	
	funcao inicio()
	{
		inteiro matriz[3][3]
		inteiro somaTotal = 0
		inteiro somaDiagonal = 0

		para(inteiro linha = 0; linha < 3; linha++)
		{
			para(inteiro coluna = 0; coluna < 3; coluna++)
			{
				escreva("Digite um número: ")
				leia(matriz[linha][coluna])
				
				somaTotal += matriz[linha][coluna]

					se(linha == coluna)
					{
						somaDiagonal += matriz[linha][coluna]
					}
				limpa()
			}
		}
		escreva("\n" + matriz[0][0] + " | " + matriz[0][1] + " | " + matriz[0][2] + 
		        "\n" + matriz[1][0] + " | " + matriz[1][1] + " | " + matriz[1][2] + 
			   "\n" + matriz[2][0] + " | " + matriz[2][1] + " | " + matriz[2][2] + "\n") 
			
		escreva("\nA soma de todos os valores da matriz é: " + somaTotal + "\n.")
		escreva("\nA soma dos valores da diagonal principal é: " + somaDiagonal + "\n.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 804; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */