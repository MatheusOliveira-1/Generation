/*3. Fa�a um sistema que leia o tempo de dura��o de um evento
 *  em uma f�brica expressa em segundos e mostre-o expresso em horas, minutos e segundos. 
 */

package programacaoSequencial;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int hora;
		int minuto;
		int segundo;
		
		System.out.println("Informe a dura��o do evento em segundos: ");
		segundo = leia.nextInt();
		
		hora = segundo / 3600;
		minuto = (segundo % 3600) / 60;
		segundo = (segundo % 3600) % 60;
		
		System.out.printf("O evento durou:\n" + hora + " hora(s)"
				+ "\n" + minuto + " minuto(s)\n" + segundo + " segundo(s)");
				
	}
		

}


