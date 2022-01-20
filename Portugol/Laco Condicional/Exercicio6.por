/*6) Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes categorias:
Infantil A = 5 a 7 anos
Infantil B = 8 a 11 anos
Juvenil A = 12 a 13 anos
Juvenil B = 14 a 17 anos
Adultos = Maiores de 18 anos
*/

programa
{
	
	funcao inicio()
	{
	inteiro idade
	cadeia categoria1 = "Infantil A"
	cadeia categoria2 = "Infantil B"
	cadeia categoria3 = "Juvenil A"
	cadeia categoria4 = "Juvenil B"
	cadeia categoria5 = "Adultos"
	
		escreva("Informe sua idade: ")
		leia(idade)

		se (idade < 5){
			escreva("\nVocê não tem idade suficiente para se classificar em nenhuma categoria de nadador\n")
		}
		senao se (idade >= 5 e idade <= 7){
			escreva("\nVocê se classifica na categoria de nadador "  + categoria1 + ".\n")
		}
		senao se (idade >= 8 e idade <= 11){
			escreva("\nVocê se classifica na categoria de nadador "  + categoria2 + ".\n")
		}
		senao se (idade >= 12 e idade <= 13){
			escreva("\nVocê se classifica na categoria de nadador "  + categoria3 + ".\n")
		}
		senao se (idade >= 14 e idade <= 17){
			escreva("\nVocê se classifica na categoria de nadador "  + categoria4 + ".\n")
		}
		senao {
			escreva("\nVocê se classifica na categoria de nadador "  + categoria5 + ".\n")
		}
	
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1212; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */