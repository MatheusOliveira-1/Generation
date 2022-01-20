programa
{
	
	funcao inicio()
	{
		real nota1
		real nota2
		real nota3
		real media[4]
		real somaMedia = 0.0
		real mediaGeral

		para(inteiro x = 0; x < 4; x++){

			escreva("\nInforme a primeira nota: ")
			leia(nota1)

			escreva("\nInforme a segunda nota: ")
			leia(nota2)

			escreva("\nInforme a terceira nota: ")
			leia(nota3)

			media[x] = (nota1+nota2+nota3) / 3
			escreva("\nMédia Aritmética: " + media[x])
			somaMedia += media[x]

			limpa()
			
		}

		mediaGeral = somaMedia / 3
		escreva("\nMédia geral: " + mediaGeral)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 464; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */