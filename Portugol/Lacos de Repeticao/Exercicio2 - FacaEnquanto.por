/*2- Faça um programa que pegue um número do teclado e calcule a soma de todos os 
 * números  de 1 até ele. Ex.: o usuário entra 7, o programa vai mostrar 28, pois  1+2+3+4+5+6+7=28.
  */

programa
{
	
	funcao inicio()
	{
		inteiro numero
		inteiro cont = 0
		inteiro soma = 0

		escreva("Digite um número: ")
		leia(numero)

		se(numero > 0){
		faca{
			cont++
			soma += cont
			
		} enquanto (cont < numero)

		escreva("\nA soma dos números de 1 a " + numero + " é: " + soma + "\n")
		
		} senao {
		  faca{
			cont--
			soma += cont

		} enquanto (cont > numero)
		
			escreva("\nA soma dos números de 0 a " + numero + " é = " + soma + "\n")
		}
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