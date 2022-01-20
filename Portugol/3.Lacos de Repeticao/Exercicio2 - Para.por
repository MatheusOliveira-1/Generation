/*
 * 2- Desenvolver um sistema que efetue a soma de todos os números ímpares que são  
 * múltiplos de três e que se encontram no conjunto dos números de 1 até 500
 */

programa
{
	
	funcao inicio()
	{
		inteiro numero  
		inteiro soma = 0

		para(numero = 1; numero <= 500; numero = numero + 1){
			
			
			se (numero % 2 != 0 e  numero % 3 == 0){
				
				soma += numero
			}
		}

		escreva("\nA soma dos números ímpares multiplos de 3 de 1 a 500 é: " + soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 378; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */