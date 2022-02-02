package herancaPolimorfismosCollection;

public class CachorroPoli extends Polimorfismo{
	
	public CachorroPoli() {
		
		super("Cachorro");
		
	}
	
	@Override
	public void som(String tipoSom) {
		
		System.out.println("Au au au");
		
	}
	
	@Override
	public void nome(String especie) {
		
		System.out.println("\n" + getEspecie());
		
		
	}
}
