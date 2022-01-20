programa
{
	
	funcao inicio()
	{
		inteiro hora, minuto, segundo, totalSegundo

		escreva("Escreva quonto tempo durou o evento em segundo(s)\n")
        	leia(totalSegundo)

        	hora = totalSegundo / 3600
        	minuto = (totalSegundo % 3600) / 60
        	segundo = (totalSegundo % 3600) % 60
		

		escreva(" \nO evento teve o tempo de: " + hora + " hora(s), " + minuto + " minuto(s) e " + segundo + " segundo(s).\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 428; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */