programa
{
	
	funcao inicio()
	{
		real nota1
		real nota2
		real nota3
		real media
		real somaMedia = 0.0
		real mediaGeral
		inteiro repeticao

		para(repeticao = 1; repeticao <= 5; repeticao++){

			escreva("\nInforme a primeira nota: ")
			leia(nota1)

			 escreva("\nInforme a segunda nota: ")
			leia(nota2)

			escreva("\nInforme a terceira nota: ")
			leia(nota3)

			media = (nota1 + nota2 + nota3) / 3

			escreva("\nA média do Alune " + repeticao + " foi de: " + media) 

			se(media >= 7.0 e media <= 10.0){
			
				escreva("\nAlune aprovade")
			
			} senao se(media >= 5.0 e media < 7.0){
				escreva("\nAlune de exame!!!\n")
			
			} senao se (media >= 0.0 e media < 5.0){
				escreva("\nAlune reprovade!\n")
			
			} senao {
				escreva("\nMédia fora do intervalo aceitável.\n")
				
				   }
			//somaMedia = somaMedia + media
			somaMedia += media
						
		}

		limpa()

		mediaGeral = somaMedia / 5	

		escreva("\nA media geral da turma foi de: " + mediaGeral + ".\n")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 984; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */