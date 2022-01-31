package Familia44;

import java.text.NumberFormat;

public class Empregado {
	
	private String nome;
	private double salario;
	
	public Empregado (String nome, double salario) {
		
		this.setNome(nome);
		this.setSalario(salario);
		
		// this.nome = nome;
		// this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void aumentarSalario(double percentual) {
		
		salario *= 1 + percentual/100;
	}
	
	public String formatarMoeda() {
		
		NumberFormat nf = NumberFormat.getCurrencyInstance(); // pega a moeda corrente do país
		nf.setMinimumFractionDigits(2); // numero depois da vírgula
		
		
		String formatoMoeda = nf.format(salario); // formata o atributo como monetário
		
		return formatoMoeda;
		
	}
	 public void imprimir() {
		 
		 System.out.println(nome + "\t\tSalário" + this.formatarMoeda());
		 
	 }
}
