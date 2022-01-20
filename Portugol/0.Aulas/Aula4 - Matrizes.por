programa
{
	
	funcao inicio()
	{
		inteiro numeros[3][3]
		inteiro somaNumeros = 0
		inteiro somaDiagonal = 0
		

		para(inteiro linha = 0; linha < 3; linha++)
		{

			para(inteiro coluna = 0; coluna < 3; coluna++)
			{
				escreva("Entre com um valor: ")
				leia(numeros[linha][coluna])
				somaNumeros += numeros[linha][coluna]

				se(linha == coluna)
				{
					somaDiagonal += numeros[linha][coluna]
				}
			}
		}
		escreva("\nSomatorio dos valores da matriz: " + somaNumeros)
		escreva("\nSomatorio da diagonal: " + somaDiagonal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 181; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */