package herancaPolimorfismosCollection;

public class Cachorro extends Animal{
		
		private String raca;
		
		Cachorro (String nome, int idade, String som, String deslocamento, String raca){
			
		super(nome, idade, som, deslocamento);
		this.raca = raca;
			
		}
		
		public void imprimirInfo1() {

			System.out.println("====================CACHORRO==================");
			System.out.println("\nNome: " + nome);
			System.out.println("\nIdade: " + idade);
			System.out.println("\nSom que emite: " + som);
			System.out.println("\nTipo de deslocamento: " + deslocamento);
			System.out.println("\nRaça: " + raca);

		}

		public String getRaca() {
			return raca;
		}

		public void setRaca(String raca) {
			this.raca = raca;
		}
		
		
}
