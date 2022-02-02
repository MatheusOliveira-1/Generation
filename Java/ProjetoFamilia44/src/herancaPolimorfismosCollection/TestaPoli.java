package herancaPolimorfismosCollection;

import java.util.Scanner;

public class TestaPoli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		CachorroPoli cachorro = new CachorroPoli();
		PreguicaPoli preguica = new PreguicaPoli();
		CavaloPoli cavalo = new CavaloPoli();

		Polimorfismo polimorfismo = null;
		
		int n;
		
		System.out.println("Escolha um animal. [0] Cachorro [1] Preguiça [2] Cavalo"); 
		n = sc.nextInt();
		
		switch (n) {

		case 0:
			polimorfismo = cachorro;
			break;

		case 1:
			polimorfismo = preguica;
			break;

		case 2:
			polimorfismo = cavalo;
			break;

		default:
			System.out.println("\nErro inesperado...");
		}
		
		if(polimorfismo != null) {
			
			polimorfismo.nome("");
			polimorfismo.som("");
			
		
		}

	}

}
