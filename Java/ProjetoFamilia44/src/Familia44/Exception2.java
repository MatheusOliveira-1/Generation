package Familia44;

	import java.util.InputMismatchException;
	import java.util.Scanner;

	public class Exception2 {
		
		public static int quociente(int numerador, int denominador) throws ArithmeticException
		{
			return numerador / denominador;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			//demonstrar o lan�amento de uma exce��o quando ocorre uma divis�o por zero
			// e tamb�m quando meu usu�rio insere um tipo de dado diferente do esperado
			Scanner leia = new Scanner(System.in);
			
//			boolean continueLoop = true;//determina se mais entradas s�o necess�rias
//			
//			do
//			{
				try // ler dois n�meros e calcular o quociente
				{
					System.out.println("\nEntre com o numerador: ");
					int numerador = leia.nextInt();
//					System.out.println("\nEntre com o denominador: ");
//					int denominador = leia.nextInt();
//					
//					int resultado = quociente(numerador,denominador);
//					System.out.printf("\nResultado: %d  /  %d = %d",numerador,denominador,resultado);
//					continueLoop = false;
				}
				
				catch(InputMismatchException inputMismatchException)//exce��o de entrada de dados de tipos diferentes
				{
					System.err.printf("\nException: %s\n",inputMismatchException);
					leia.nextLine();
					System.out.println("\nVoc� deve entrar com um valor do tipo inteiro.\nPor favor tente novamente...");
					
				}
				
				catch(ArithmeticException arithmeticException)
				{
					System.err.printf("\nException: %s \n",arithmeticException);
					System.out.println("\nZero � um denominador inv�lido.\nPor favor, tente novamente...");
					
				}
				
		

	}
	}
	
