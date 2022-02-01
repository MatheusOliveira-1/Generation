package herancaPolimorfismosCollection;

import java.util.Scanner;

public class PrincipalAnimal {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cachorro cao1 = new Cachorro ("Scooby", 2, "Latido", "Corre", "Vira-lata");
		Cavalo cav1 = new Cavalo ("Bolt", 15, "Relincha", "Corre", "Preto");
		Preguica preg1 = new Preguica ("Maria", 50, "Balido", "Sobe em �rvores", "Florestas tropicais");
		
		int op;
		
		do {
		System.out.println("\n\n===========ESCOLHA UMA DAS OP��ES=============");
		System.out.println("[1] Cachorro");
		System.out.println("[2] Cavalo");
		System.out.println("[3] Pregui�a");
		System.out.println("[0] Sair");
		op = sc.nextInt();
		
		switch (op) {
		
		case 0:
			System.out.println("\nOpera��o finalizada");
			break;
		
		case 1:
			cao1.imprimirInfo1();
			break;
			
		case 2:
			cav1.imprimirInfo2();
			break;
			
		case 3:
			preg1.imprimirInfo();
			break;
			
		default:
			if(op != 0)
				System.out.println("Op��o inv�lida!");
		}
		}while(op != 0);
		
		
	}
		
}
