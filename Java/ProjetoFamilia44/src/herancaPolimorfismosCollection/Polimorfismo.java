package herancaPolimorfismosCollection;

public abstract class Polimorfismo {

	protected String especie;
	
	abstract public void som(String tipoSom);
	abstract public void nome(String tipoSom);
	
	Polimorfismo(String especie){
		
		this.especie = especie;
				
	}
	
	public String getEspecie() {
		
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	
}
