package Familia44;

public class Exception {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			String frase = null;
			String novaFrase = null;
			
			try // faz uma tentativa de execu��o para verificar o erro
			{
				novaFrase = frase.toUpperCase();//tenta colocar uma String para maiuscula
			}
			catch(NullPointerException e)//ela faz a corre��o de um valor null para um conte�do qualquer
			{
				//tratamento da exce��o
				System.out.println("\nA frase inicial est� nula, para selecionar tal problema, "
						+ "foi lhe atribu�do um valor default...");
				frase = "Frase vazia";
				novaFrase = frase.toUpperCase();
			}
			System.out.println("\nFrase antiga: "+frase);
			System.out.println("\nFrase nova: "+novaFrase);
		}

	}



	
	

}
