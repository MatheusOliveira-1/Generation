package Familia44;

public class Publico extends Telefone {

	public Publico() {

		super("Telefone P�blico");
	}

	@Override
	public void toca(int numToque) {

		for (int i = 0; i < numToque; i++) {

			System.out.println("\nTrinininin...trinininin");
		}
	}
	
	@Override
	public void disca(String numero) {
		
		if(numero.charAt(0) == '9' || numero.charAt(0) == '8') {
			
			System.out.println("Este telefone n�o liga para celular...");
		
		} else {
			System.out.println("Discando " + numero);
		}
		
	}
}
