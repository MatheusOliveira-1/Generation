/*
 * 1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e 
 * apresente no final o total do somatório, a média e o total de valores lidos. 
 * O programa deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores positivos. 
 * Ou seja, o programa deve parar quando o usuário fornecer um valor negativo.
 */

programa
{
	
	funcao inicio()
	{
		real numero = 0.0
		real somatorio = 0.0
		real contador = 0.0
		real media

		escreva("Informe um número: ")
		leia(numero)
		
		enquanto(numero >= 0)
		{
			contador++
			somatorio += numero
			
			escreva("Informe um número: ")
			leia(numero)
						
		}
		media = somatorio / contador
		
          escreva("\nTotal de números informados: " + contador + ".")
          escreva("\nTotal do somatório: " + somatorio + ".")
         se(media >= 0){
          escreva("\nA média de valores positivos lidos: " + media + ".\n")
         
         } senao {
         	 escreva("\nA média de valores positivos lidos: 0.0.\n")
         	
         }
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1007; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */