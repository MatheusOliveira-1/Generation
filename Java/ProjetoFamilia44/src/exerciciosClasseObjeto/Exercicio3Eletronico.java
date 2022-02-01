package exerciciosClasseObjeto;

public class Exercicio3Eletronico {
	
	private String nome;
	private String modelo;
	private String cor;
	private int preco;
	
	Exercicio3Eletronico(String n, String m, String c, int p){
		
		this.nome = n;
		this.modelo = m;
		this.cor = c;
		this.preco = p;
	}
	
	public  void ImprimirInfo() {
		System.out.println("\t\t");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

	

}
