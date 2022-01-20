programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{

	real x1, x2, y1, y2, distancia 
	
	
		escreva("Entre com o valor do ponto x1: ")
		leia(x1)

		escreva("Entre com o valor do ponto y2: ")
		leia(y1)

		escreva("Entre com o valor do ponto x2: ")
		leia(x2)

		escreva("Entre com o valor do ponto y2: ")
		leia(y2)

		distancia = mat.arredondar (mat.raiz (mat.potencia(x2-x1,2.0) - mat.potencia(y2-y1,2.0),2.0),2)

		escreva("O distância entre os dois pontos é: " + distancia)

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 435; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */