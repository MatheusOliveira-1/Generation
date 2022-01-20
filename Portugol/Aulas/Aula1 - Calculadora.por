programa
{
	
	funcao inicio()
	{
		inteiro opcao
		real num1,num2,resultado = 0.0

		escreva("Entre com o primeiro número: ")
		leia(num1)

		
		escreva("Entre com o segundo número: ")
		leia(num2)

		limpa()

		escreva("\n\t\t CALCULADORA")
		escreva("\n1-Soma")
		escreva("\n2-Diferença")
		escreva("\n3-Multiplicação")
		escreva("\n4-Divisão")

		escreva("\nDigite sua opção: ")
		leia(opcao)

		escolha(opcao) {
			caso 1:
			resultado = num1 + num2
			pare

			caso 2:
			resultado = num1 - num2
			pare

			caso 3:
			resultado = num1 * num2
			pare

			caso 4:
			se (num2==0){

			escreva("\nNão é possível fazer divisão por 0 \n")
			
			} senao {
			resultado = num1 / num2 }
			pare

			caso contrario:
			escreva("\nOpção inválida!!!")
		}

		escreva("\n\t\t RESULTADO: " + resultado + "\n")

		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 268; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */