/*3) Desenvolva um sistema em que:
•Leia 4 (quatro) números;
•Calcule o quadrado de cada um;
•Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
•Caso contrário, imprima os valores lidos e seus respectivos quadrados.
*/



programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		real num1 = 0.0
		real num2 = 0.0
		real num3 = 0.0
		real num4 = 0.0

		escreva("Informe o primeiro número: ")
		leia(num1)

		escreva("Informe o primeiro número: ")
		leia(num2)

		escreva("Informe o primeiro número: ")
		leia(num3)

		escreva("Informe o primeiro número: ")
		leia(num4)

		num1 = mat.potencia (num1,2.0)
		num2 = mat.potencia (num2,2.0)
		num3 = mat.potencia (num3,2.0)
		num4 = mat.potencia (num4,2.0)

		se (num2 >= 1000){

			escreva("\n" + (mat.raiz (num3,2.0)) + "² é = " + num3) 
			
		} senao {
			escreva("\n" + (mat.raiz (num1,2.0)) + "² é = " + num1) 
			escreva("\n" + (mat.raiz (num2,2.0)) + "² é = " + num2) 
			escreva("\n" + (mat.raiz (num3,2.0)) + "² é = " + num3) 
			escreva("\n" + (mat.raiz (num4,2.0)) + "² é = " + num4) 
			
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 255; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */