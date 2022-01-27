package Familia44;

public class LacosRepeticao {
	
	public static void main(String[] args) {
		
		int numero = 0;
		int numero2 = 2;
		
		while(numero < 3) {			
			System.out.println("Olá mundo, testando o ENQUANTO");
			numero++;
		}
		
		System.out.println("");
		
		do {
			System.out.println("Testando o meu FAÇA ENQUANTO");
			
		}while (numero2 < 2);
		
		System.out.println("");
		
		/*for(int x = 0; x <= 2; x++) {
			System.out.println("Agora testando condição PARA");*/
		
		for(int num = 0; num <= 10; num++) {
			System.out.println("O número 5 x " + num + " = " + (num * 5));
		}
	}

}
