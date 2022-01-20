programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{

      inteiro a, b, c, d, r, s

      escreva("Entre com o valor de A\n")
      leia(a)

      escreva("Entre com o valor de B\n")
      leia(b)

      escreva("Entre com o valor de C\n")
      leia(c)

      r = mat.potencia ((a+b), 2)
      s = mat.potencia ((b+c), 2)
      d = (r+s)/2

      
      escreva("O valor de 'D' é: " + d)
      
      escreva("\nO valor de 'R' é: " + r)
      
      escreva("\nO valor de 'S' é: \n" + s)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 503; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */