package Familia44;

public class Celular extends Telefone {

	public Celular() {

		super("Telefone Celular");

	}
	
	@Override
	public void toca(int codigoToque) {
		
		switch(codigoToque) {
		
		case 1:
			System.out.println("\nT�n�n� t�n�n�");
			break;
			
		case 2:
			System.out.println("\nP�n�n�");
			break;
			
		default:
			System.out.println("\nTin�n�");
			
		}
	}
	
	@Override
	public void disca(String numero) {
		
		System.out.println("\nO n�mero " + numero + " � um celular");
	}

}
