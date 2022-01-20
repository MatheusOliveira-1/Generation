programa
{
	
	funcao inicio()
	{
		inteiro ano, mes, dia, idade

		escreva("Responda às questões abaixo para calcular sua idade em dias \n")

		escreva("Você tem quantos anos?\n")
		leia(ano)

	     escreva("Você tem " + ano + " ano(s) e quantos meses?\n")
		leia(mes)

		escreva("São " + mes + " mes(es) e quantos dias?\n")
		leia(dia)

		idade = (ano * 365) + (mes * 30) + (dia)

		escreva("Sua idade é de: "  + idade + " dia(s) de vida\n")
		
	}
}



/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 380; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */