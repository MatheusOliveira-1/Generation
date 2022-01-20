programa
{
	
	funcao inicio()
	{
		inteiro numero
		inteiro somaPar = 0
		inteiro contImpar = 0

		escreva("Informe um número: ")
		leia(numero)

		limpa()

		faca{

			se(numero % 2 == 0){
				
				somaPar += numero
			
			}
			senao {
				contImpar++
			}

			escreva("Informe um número: ")
			leia(numero)

			limpa()
			
		} enquanto (numero!=0)

		escreva("\nSomatorio dos números pares: " + somaPar + ".\n")
		escreva("\nSomatorio dos números ímpares: " + contImpar + ".\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 160; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */