programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		//escreva("Olá Mundo")
		cadeia nome
		inteiro idade, x, y
		real altura, nota1, nota2, nota3, media

		escreva("Entre com o seu nome:")
		leia(nome) //neste momento variável nome obtém conteúdo do nome do usuário
		escreva("Entre com a sua idade:")
		leia(idade)
		escreva("Entre com a sua altura:")
		leia(altura)
		escreva("Entre com a nota1: ")
		leia(nota1)
		escreva("Entre com a nota2: ")
		leia(nota2)
		escreva("Entre com a nota3: ")
		leia(nota3)

		escreva("Entre com o valor de x: ")
		leia (x)
		escreva("Entre com o valor de y: ")
		leia (y)

		media = (nota1+nota2+nota3) / 3

		escreva("\nSeu nome é: " +nome)
		escreva("\nVocê tem " +idade+ " anos de vida")
		escreva("\nVocê mede " +altura+ " de altura")
		escreva("\nSua média aritmética é: "+ mat.arredondar(media,2))

		nota1 = mat.raiz(nota2,2.0)
		nota2 = mat.potencia(nota3, 3.0)

		x = x % y
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 934; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */