package herancaPolimorfismosCollection;

public class Preguica extends Animal {
		
		private String habitat;
		
		Preguica (String nome, int idade, String som, String deslocamento, String habitat){
			
		super(nome, idade, som, deslocamento);
		this.habitat = habitat;
			
		}
		
		public void imprimirInfo(){
			
			System.out.println("====================PREGUIÇA==================");
			System.out.println("\nNome: " + nome);
			System.out.println("\nIdade: " + idade);
			System.out.println("\nSom que emite: " + som);
			System.out.println("\nTipo de deslocamento: " + deslocamento);
			System.out.println("\nHabitat: " + habitat);
				
		}

		public String getCor() {
			return habitat;
		}

		public void setHabitat(String habitat) {
			this.habitat = habitat;
		}
		
}
		