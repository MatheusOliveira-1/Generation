/*
6) Elabore um sistema que dada a idade de um nadador classifique-o em uma
das seguintes categorias:
Infantil A = 5 a 7 anos
Infantil B = 8 a 11 anos
Juvenil A = 12 a 13 anos
Juvenil B = 14 a 17 anos
Adultos = Maiores de 18 anos

 */

package lacoCondicional;
import java.util.Scanner;

public class Exercicio6 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade;
		String categoria = "";
		
		System.out.println("Informe a sua idade:");
		idade = leia.nextInt();
		
		if(idade > 18) {
			categoria = "Adultos";
			
		} else if (idade >= 5 && idade <= 7) {
			categoria = "Infantil A";
			
		} else if (idade >= 8 && idade <= 11) {
			categoria = "Infantil B";
			
		} else if (idade >= 12 && idade <= 13) {
			categoria = "Juvenil A";
			
		} else if (idade >= 14 && idade <= 17) {
			categoria = "Juvenil B";
		} else {
			System.out.println("Você não tem idade suficiente para ser classificado em alguma categoria de nadador");
		}
		if (!(idade < 5))
		System.out.println("Você se classifica na categoria: " + categoria + ".");
		
	}
	
}
