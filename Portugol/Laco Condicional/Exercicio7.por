/*7) Receber valores de base e altura de um triângulo e verificar se são valores 
 * válidos (positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.
 */

programa
{
	
	funcao inicio()
	{
	real base
	real altura
	
		escreva("Informe a medida da base do triangulo: ")
		leia(base)

		escreva("Informe a medida da altura do triangulo: ")
		leia(altura)

		se (base > 0 e altura > 0){

			escreva("\nA área do triângulo é: " + altura * base / 2 + ".\n")
			
		} senao {
			escreva("\nAs medidas de altura e base do triângulo devem ser maiores do que '0'.\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 580; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */