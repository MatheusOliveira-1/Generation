/*4) Faça um sistema que leia um número inteiro e mostre uma mensagem indicando 
 * se este número é par ou ímpar, e se é positivo ou negativo.
 */

programa
{
	
	funcao inicio()
	{
	inteiro numero

			escreva("Informe um número inteiro: ")
			leia(numero)

			se (numero % 2 == 0){
				
				escreva("\nEste número é par e ")
					
				} senao {

				escreva("Este número é ímpar e ")				
				
			}
			se (numero >= 0) {
				
				escreva("positivo.\n")
				
			}senao {
				escreva("negativo.\n")
			}
							
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 84; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */