package Familia44;

import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int [][] matriz = new int [3][2];
			
		for(int x = 0; x <= 2; x++) {
			for (int y = 0; y <= 1; y++) {
				System.out.println("Digite o valor da linha " + x + ", coluna " + y + ":");
				matriz[x][y] = leia.nextInt();
				
			}
		};
		
		System.out.println("============Resultados=========");
		for(int x = 0; x <= 2; x++) {
			for (int y = 0; y <= 1; y++) {
				System.out.print("[" + matriz[x][y] * 2 + "]");
				
			}
			System.out.println("");
		}
		
	}

}
