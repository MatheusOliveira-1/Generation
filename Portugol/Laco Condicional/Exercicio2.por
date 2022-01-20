/* 2) Elabore um sistema que leia as variáveis C e N, respectivamente código e número de horas trabalhadas de um operário. 
 E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. Quando o número de horas exceder a 50 calcule o excesso
 de pagamento armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de trabalho vale R$ 20,00. 
 No final do processamento imprimir o salário total e o salário excedente.
 */

programa
{
	
	funcao inicio()
	{
		inteiro C = 0
		real N = 0.0
		real E = 0.0
		real salario = 0.0
		
	escreva("Informe o código de identificação do operário: ")
	leia(C)

	escreva("Informe o número de horas trabalhadas: ")
	leia(N)

	E = (N - 50) * 20
	salario = N * 10

	se (N > 50){
		
		escreva("\nO salário excedente do operário de código " + C + " é de: R$" + E + ", e o salário total é de: R$" + (salario + E) + ".\n")
		
	} senao {

		 E = 0

		escreva("\nO salário excedente do operário de código " + C + " é de: R$" + E + ", e o salário total é de: R$" + (salario + E) + ".\n")
		 
	}
	
		
	}
}



/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 443; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */