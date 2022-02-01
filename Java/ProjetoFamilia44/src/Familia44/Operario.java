package Familia44;

public class Operario extends Pessoa{
	
	private double valorProducao;
	private double comissao;
	
	public Operario(String nome, String endereco, String cpf, int telefone, int idade,
			double valorProducao, double comissao) {
		
		super(nome, endereco, cpf, telefone, idade);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
		
	}

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
public void imprimirInfo() {
		
		System.out.println("Nome do empregado: " + getNome() + "\nCPF: " + getCpf() +
				"\nIdade: " + getIdade() + "\nTelefone: " + getTelefone() + 
				"\nEndereco: " + getEndereco() + "\nValor monetário total dos"
				+ "artigos produzidos por " + getNome() + ": " + valorProducao + 
				"Porcentagem da comissao deste artigo: " + comissao + "%");
		
	}

	public void calcularValorArtigo() {
		
		double valorTotal = valorProducao + (valorProducao * (comissao / 100)); 
		System.out.println("O valor total a ser recebbido pelo operário " + getNome() +
				" será de " + valorTotal);
	}

}
