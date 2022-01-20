programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
	real nota1, nota2, nota3, media
	
	
		escreva("Entre com a nota1: ")
		leia(nota1)

		escreva("Entre com a nota2: ")
		leia(nota2)

		escreva("Entre com a nota3: ")
		leia(nota3)

		media = Matematica.arredondar ((nota1 + nota2 + nota3) / 3,2)

		escreva("\nMédia aritmética do alune foi de: " + media)

		se(media >= 7.0 e media <= 10.0){
			
			escreva("\nAlune aprovade")
			
		} senao se(media >= 5.0 e media < 7.0){
			escreva("\nAlune de exame!!!\n")
			
		} senao se (media >= 0.0 e media < 5.0){
			escreva("\nAlune reprovade!\n")
			
		} senao {
			escreva("\nMédia fora do intervalo aceitável.\n")
		}
		
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 360; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */