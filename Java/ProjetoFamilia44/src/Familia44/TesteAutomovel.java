package Familia44;

public class TesteAutomovel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instanciando um objeto da classe Automovel
		
		Automovel auto1 = new Automovel("Pedro","Fiat 147", "VDRO191", 1965);
		
		auto1.imprimirInfo();
		
		System.out.println("\nTransferência de Proprietário");
		auto1.setNomeProprietario("Denise Silva");
		
		auto1.setPlaca("CXX4007");
		
		System.out.println("\n=============================");
		
		auto1.imprimirInfo();
		
		
				
	}

}
