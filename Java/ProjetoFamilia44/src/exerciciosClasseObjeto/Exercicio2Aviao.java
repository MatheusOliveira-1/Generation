package exerciciosClasseObjeto;

public class Exercicio2Aviao {
	
	private String modelo;
	private String companhia;
	private int capacidade;
	private int velocidadeMax;
	
	Exercicio2Aviao (String m, String comp, int cap, int v){
		
		this.modelo = m;
		this.companhia = comp;
		this.capacidade = cap;
		this.velocidadeMax = v;
	}	
		public void ImprimirInfo() {
			
			System.out.println("\t\tFICHA TÉCNICA DA AERONAVE");
			System.out.println("Modelo: " + modelo + "\nCompanhia: " + companhia
					 + "\nCapacidade de passageiros: " + capacidade + "\nVelocidade máxima: " + velocidadeMax + " Km/h");
			
		}
		public String getModelo() {
			return modelo;
		}
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		public String getCompanhia() {
			return companhia;
		}
		public void setCompanhia(String companhia) {
			this.companhia = companhia;
		}
		public int getCapacidade() {
			return capacidade;
		}
		public void setCapacidade(int capacidade) {
			this.capacidade = capacidade;
		}
		public int getVelocidadeMax() {
			return velocidadeMax;
		}
		public void setVelocidadeMax(int velocidadeMax) {
			this.velocidadeMax = velocidadeMax;
		}
		
	
	
}
