/*
 * 5) A Secretaria de Meio Ambiente que controla o �ndice de polui��o
 * mant�m 3 grupos de ind�strias que s�o altamente poluentes do meio
 * ambiente. O �ndice de polui��o aceit�vel varia de 0,05 at� 0,25.
 * Se o �ndice sobe para 0,3 as ind�strias do 1� grupo s�o intimadas
 * a suspenderem suas atividades, se o �ndice crescer para 0,4 as 
 * industrias do 1� e 2� grupo s�o intimadas a suspenderem suas atividades,
 * se o �ndice atingir 0,5 todos os grupos devem ser notificados a paralisarem 
 * suas atividades. Fa�a um sistema que leia o �ndice de polui��o medido e emita
 * a notifica��o adequada aos diferentes grupos de empresas.
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
		
		System.out.println("Informe o �ndice de polui��o medido");
		indice = leia.nextFloat();
		
		if(indice < 0.05) {
			System.out.println("�ndice de polui��o baixo, n�o � necess�rio tomar nenhuma medida.");
			
		} else if(indice >= 0.05 && indice <= 0.25) {
			System.out.println("�ndice de polui��o aceit�vel, n�o � necess�rio tomar nenhuma medida.");
			
		} else if(indice > 0.25 && indice < 0.3) {
			System.out.println("�ndice de polui��o alto, por�m ainda n�o � necess�rio tomar nenhuma medida.");
			
		} else if(indice > 0.3 && indice < 0.4) {
			System.out.println("�ndice de polui��o alto, as ind�strias do grupo " + g1 + " devem suspender suas atividades.");
			
		} else if(indice > 0.4 && indice < 0.5) {
			System.out.println("�ndice de polui��o alto, as ind�strias dos grupos " + g1 + " e " + g2 + " devem suspender suas atividades.");
			
		} else {
			System.out.println("�ndice de polui��o alto, as ind�strias dos grupos " + g1 + ", " + g2 + " e " + g3 + " devem suspender suas atividades.");
			
		}
	}

}
