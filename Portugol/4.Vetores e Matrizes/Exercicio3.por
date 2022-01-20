/*4.	Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e em seguida, 
 * exiba a soma dos valores dela e a soma dos valores da primeira diagonal, ou seja, diagonal principal.
 */

programa
{
	
	funcao inicio()
	{
		inteiro N1 [4][6]
		inteiro N2 [4][6]
		inteiro M1 [4][6]
		inteiro M2 [4][6]

		para(inteiro linha = 0; linha < 4; linha++)
		{
			
			para(inteiro coluna = 0; coluna < 6; coluna++)
			{
				escreva("\nDigite um valor: "	)
				leia(N1[linha][coluna])
				M1[linha][coluna] = N1[linha][coluna]
				M2[linha][coluna] = N1[linha][coluna]

				limpa()
			}
		}
		para(inteiro linha = 0; linha < 4; linha++)
		{
			
			para(inteiro coluna = 0; coluna < 6; coluna++)
			{
				escreva("\nDigite um valor: "	)
				leia(N2[linha][coluna])
				M1[linha][coluna] += N2[linha][coluna]
				M2[linha][coluna] -= N2[linha][coluna]

				limpa()
			}
		}
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 865; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {N1, 10, 10, 2}-{N2, 11, 10, 2}-{M1, 12, 10, 2}-{M2, 13, 10, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */