/*5. Faça um sistema que leia as 3 notas de um aluno e calcule
 *  a média final deste aluno. 
 *  Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente. 
 */

package programacaoSequencial;
import java.util.Scanner;

public class Exercicio5 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float nota1;
		float nota2;
		float nota3;
		float media;
		
		
		System.out.println("Informe o valor da primeira nota:");
		nota1 = leia.nextFloat();
		
		System.out.println("Informe o valor da segunda nota:");
		nota2 = leia.nextFloat();
		
		System.out.println("Informe o valor da terceira nota:");
		nota3 = leia.nextFloat();
		
		media = ((nota1 * 2) + (nota2*3) + (nota3 * 5)) / 10;
		
		System.out.println("Sua média ponderada é: " + media);
		
		
	}
	

}
