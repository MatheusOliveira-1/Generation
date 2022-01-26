/*
 * 5) A Secretaria de Meio Ambiente que controla o índice de poluição
 * mantém 3 grupos de indústrias que são altamente poluentes do meio
 * ambiente. O índice de poluição aceitável varia de 0,05 até 0,25.
 * Se o índice sobe para 0,3 as indústrias do 1º grupo são intimadas
 * a suspenderem suas atividades, se o índice crescer para 0,4 as 
 * industrias do 1º e 2º grupo são intimadas a suspenderem suas atividades,
 * se o índice atingir 0,5 todos os grupos devem ser notificados a paralisarem 
 * suas atividades. Faça um sistema que leia o índice de poluição medido e emita
 * a notificação adequada aos diferentes grupos de empresas.
 */

package lacoCondicional;

import java.util.Scanner;

public class Exercicio5 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		String g1 = "1";
		String g2 = "2";
		String g3 = "3";
		float indice;
		
		System.out.println("Informe o índice de poluição medido");
		indice = leia.nextFloat();
		
		if(indice < 0.05) {
			System.out.println("Índice de poluição baixo, não é necessário tomar nenhuma medida.");
			
		} else if(indice >= 0.05 && indice <= 0.25) {
			System.out.println("Índice de poluição aceitável, não é necessário tomar nenhuma medida.");
			
		} else if(indice > 0.25 && indice < 0.3) {
			System.out.println("Índice de poluição alto, porém ainda não é necessário tomar nenhuma medida.");
			
		} else if(indice > 0.3 && indice < 0.4) {
			System.out.println("Índice de poluição alto, as indústrias do grupo " + g1 + " devem suspender suas atividades.");
			
		} else if(indice > 0.4 && indice < 0.5) {
			System.out.println("Índice de poluição alto, as indústrias dos grupos " + g1 + " e " + g2 + " devem suspender suas atividades.");
			
		} else {
			System.out.println("Índice de poluição alto, as indústrias dos grupos " + g1 + ", " + g2 + " e " + g3 + " devem suspender suas atividades.");
			
		}
	}

}
