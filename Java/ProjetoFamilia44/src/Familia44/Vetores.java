package Familia44;

import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		int[] numero = new int [3];
		
	  /*numero[0] = 200;
		numero[1] = 201;
		numero[2] = 202;*/
				
		for(int x = 0; x <= 2; x++) {
			
			System.out.println("Digite o primeiro valor de números");
			numero[x] = leia.nextInt();
			
			//System.out.println("O valor do índice é: " + x + " com valor " + numero[x]);
		}
		for(int y = 0; y <= 2; y++) {
			System.out.println("\nResultados");
			System.out.println(numero[y]*6);
		}

	}

}
