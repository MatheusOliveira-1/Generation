/*
 * 2.	Um dado é lançado 10 vezes e o valor correspondente é anotado. 
 * Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
 * A seguir determine e imprima a média aritmética dos lançamentos, contabilize e 
 * apresente também quantas foram as ocorrências da maior pontuação.
 * 
 */

programa
{
	
	funcao inicio()
	{
		inteiro vetor[10]
		inteiro ocorrencias = 0
		inteiro mediaPontuacao
		inteiro maiorPontuacao = 0
		inteiro somaPontuacao = 0
		
		para(inteiro x = 0; x < 10; x++)
			{
			escreva("\nDigite o valor correspondente ao " + (x +1) + "º lançamento: ")
			leia(vetor[x])

			se(vetor[x] < 1 ou vetor[x]> 6)
				{
				x--
				escreva("\nEste dado tem apenas 6 lados, por favor digite um número entre 1 e 6.\n")						
				}
			senao 
				{
				se(vetor[x] > maiorPontuacao)
					{
					maiorPontuacao = vetor[x]			
					}
				se(vetor[x] == maiorPontuacao)
					{
					ocorrencias++
					}
				somaPontuacao += vetor[x]

				limpa()
				}
			}
			
		mediaPontuacao = somaPontuacao / 10
		
		escreva("\nA média de pontuação é: " + mediaPontuacao + ".\n")
		escreva("\nO maior númeor foi " + maiorPontuacao + ", este número apareceu " + ocorrencias + " vezes.\n")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 749; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */