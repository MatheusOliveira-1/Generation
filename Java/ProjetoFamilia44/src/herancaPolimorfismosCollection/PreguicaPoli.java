package herancaPolimorfismosCollection;

public class PreguicaPoli extends Polimorfismo{
	
	public PreguicaPoli() {
		
		super("Pregui�a");
		
	}
	
	@Override
	public void som(String tipoSom) {
		
		System.out.println("Aaaah Aaaaah");
		
	}
	
	@Override
	public void nome(String especie) {
		
		System.out.println("\n" + getEspecie());
		
	}

}