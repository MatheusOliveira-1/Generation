programa
{
	
	funcao inicio()
	{
		inteiro ano, mes, dia, idade

		escreva("Qual é a sua idade em dias?\n")
		leia(idade)

		ano = idade / 365
		mes = (idade % 365) / 30
		dia = (idade % 365) % 30

		
		escreva("Você tem " + ano + " ano(s), " + mes + " mes(es), e " + dia + " dia(s) de idade.\n")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 297; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */