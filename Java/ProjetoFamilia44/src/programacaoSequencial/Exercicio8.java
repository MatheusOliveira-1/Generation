/*8. O custo ao consumidor de um carro novo � a soma do custo de f�brica
 * com a percentagem do distribuidor e dos impostos (aplicados ao custo
 * de f�brica). Supondo que a percentagem do distribuidor seja de 28% e
 * os impostos de 45%, escrever um sistema que leia o custo de f�brica 
 * de um carro e escreva o custo ao consumidor. 
 */

package programacaoSequencial;

import java.util.Scanner;

public class Exercicio8 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float custoFabrica;
		float porcentagemDistribuidor = 0.28f;
		float impostos = 0.45f;
		float custoConsumidor;
		
		System.out.println("Informe o valor do custo de f�brica:");
		custoFabrica = leia.nextFloat();
		
		custoConsumidor = custoFabrica + (custoFabrica * porcentagemDistribuidor) + (custoFabrica * impostos);
		
		System.out.println("O custo ao consumidor � de R$" + custoConsumidor);
		
	}

}
