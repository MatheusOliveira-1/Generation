/*
 * 1.	Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade 
 *        e o escreva em seguida. Encontre após a maior pontuação e a apresente. 
 */

programa
{
	
	funcao inicio()
	{	
		inteiro vetor [5]
		inteiro maiorPontuacao = 0
		
		para(inteiro x = 0 ; x < 5 ; x++)
		{

		escreva("\nDigite a " + (x + 1) + "ª pontuação: ")
		leia(vetor[x])

		
			se (vetor[x] > maiorPontuacao)
			{
				maiorPontuacao = vetor[x]
			} 
		
			limpa ()
			
		}		
	escreva("\nAs pontuações são: " + vetor[0] + ", " + vetor[1] + ", " + vetor[2] + ", " + vetor[3] + " e " +
	vetor[4] + ".\n")

	escreva("\nA maior pontuação é: " + maiorPontuacao + ".\n")
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 273; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {vetor, 11, 10, 5}-{maiorPontuacao, 12, 10, 14}-{x, 14, 15, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */