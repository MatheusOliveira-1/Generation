package exerciciosClasseObjeto;

import java.text.NumberFormat;

public class Exercicio4Funcionario {
	
	private String nome;
	private String cargo;
	private int salario;
	private int idade;
	private String setor;
	
	public Exercicio4Funcionario (String n, String c, int sal, int i, String setor) {
		
		this.nome = n;
		this.cargo = c;
		this.salario = sal;
		this.idade = i;
		this.setor = setor;
	}

	public void ImprimirInfo() {
		
		System.out.println("==============INFORMAÇÕES DO FUNCIONÁRIO==============");
		System.out.println("\nNome: " + nome + "\nCargo: " + cargo + "\nSalário: " 
		+ this.formatarMoeda() + "\nIdade: " + idade + "\nSetor: " + setor);
		
	}
	
	public String formatarMoeda() {
		
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		
		String formatoMoeda = nf.format(salario);
		
		return formatoMoeda;
	}
	
}
