package herancaPolimorfismosCollection;

public class CavaloPoli extends Polimorfismo{
	
	public CavaloPoli() {
		
		super("Cavalo");
		
	}
	
	@Override
	public void som(String tipoSom) {
		
		System.out.println("Irrrrirriirrirri");
		
	}
	
	@Override
	public void nome(String especie) {
		
		System.out.println(getEspecie());
		
	}

}