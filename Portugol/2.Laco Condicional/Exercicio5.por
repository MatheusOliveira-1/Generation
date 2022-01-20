/*5) A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3 grupos de indústrias que 
 * são altamente poluentes do meio ambiente. O índice de poluição aceitável varia de 0,05 até 0,25. 
 * Se o índice sobe para 0,3 as indústrias do 1º grupo são intimadas a suspenderem suas atividades, 
 * se o índice crescer para 0,4 as industrias do 1º e 2º grupo são intimadas a suspenderem suas atividades, 
 * se o índice atingir 0,5 todos os grupos devem ser notificados a paralisarem suas atividades. 
 * Faça um sistema que leia o índice de poluição medido e emita a notificação adequada aos diferentes grupos de empresas.
*/

programa
{
	
	funcao inicio()
	{
	real indicePoluicao
	cadeia grupo1 = "Grupo 1"
	cadeia grupo2 = "Grupo 2"
	cadeia grupo3 = "Grupo 3"

	escreva("Informe o índice de poluição: ")
	leia(indicePoluicao)

	se (indicePoluicao < 0.05 ){
		
		escreva("\nEste índice de poluição não possui classificação.\n")
			
	}
	senao se(indicePoluicao >= 0.05 e indicePoluicao <= 0.25){
		
		escreva("\nO índice de poluição é aceitável.\n")
			
	}
	senao se (indicePoluicao > 0.25 e indicePoluicao < 0.3){
		
		escreva("\nO índice de poluição não é aceitável, porém a indústria pode funcionar normalmente.\n")
			
	}
	senao se (indicePoluicao >= 0.3 e indicePoluicao < 0.4){
		
		escreva("\nAs indústrias do " + grupo1 + " devem suspender suas atividades.\n")
			
	}
	senao se (indicePoluicao >= 0.4 e indicePoluicao < 0.5){
		
		escreva("\nAs indústrias de " + grupo1 +" e " + grupo2 + " devem suspender suas atividades.\n")
			
	}
	senao {
		
		escreva("\nAs indústrias do " + grupo1 + ", " + grupo2 + " e " + grupo3 + " devem suspender suas atividades.\n")
			
	}
	
	
	
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 956; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */