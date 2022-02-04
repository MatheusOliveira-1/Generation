package Familia44;

public class Exception {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			String frase = null;
			String novaFrase = null;
			
			try // faz uma tentativa de execução para verificar o erro
			{
				novaFrase = frase.toUpperCase();//tenta colocar uma String para maiuscula
			}
			catch(NullPointerException e)//ela faz a correção de um valor null para um conteúdo qualquer
			{
				//tratamento da exceção
				System.out.println("\nA frase inicial está nula, para selecionar tal problema, "
						+ "foi lhe atribuído um valor default...");
				frase = "Frase vazia";
				novaFrase = frase.toUpperCase();
			}
			System.out.println("\nFrase antiga: "+frase);
			System.out.println("\nFrase nova: "+novaFrase);
		}

	}



	
	

}
