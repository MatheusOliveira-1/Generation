/*1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre 
 * o salário e número de filhos. A prefeitura deseja saber:   
a) média do salário da população; 
b) média do número de filhos; 
c) maior salário; 
d) percentual de pessoas com salário até R$100,00.  
*/

programa
{
	
	funcao inicio()
	{
	real salario = 0.0
	real salarioTotal = 0.0
	real salarioMedia = 0.0
	real salarioMaior = 0.0
	real salarioAteCem = 0.0
	real percentual = 0.0
	inteiro numeroHab = 4 //variável não obrigatória criada para testar com diferentes números de habitantes
	inteiro filhos = 0
	inteiro totalFilhos = 0
	inteiro mediaFilhos = 0
	inteiro contHabitantes = 1
	inteiro contFilhos = 1

	para(contHabitantes = 1; contHabitantes <= numeroHab; contHabitantes++){
		
		
	escreva("\nInforme o seu salario: ")
	leia(salario)

	escreva("\nQuantos filhos você tem: ")
	leia(filhos)

	salarioTotal += salario

	totalFilhos += filhos

	limpa()

	se(salario > salarioMaior){

		salarioMaior = salario
		
	}
	se (salario <= 100){
		
		salarioAteCem++
	}
	
	}

	salarioMedia = salarioTotal / numeroHab

	percentual = (salarioAteCem * 100 ) / numeroHab

	salarioMedia = totalFilhos / numeroHab

	escreva("A média salarial é de: " + salarioMedia + ".\n")

	escreva("A média de filhos da população é de: " + totalFilhos + ".\n")

	escreva("O maior salário é: " + salarioMaior + ".\n")

	escreva("O percentual de habitantes com salario até R$100,00 é de: " + percentual + "%.\n")
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1046; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */