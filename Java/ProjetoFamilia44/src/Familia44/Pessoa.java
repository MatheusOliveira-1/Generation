package Familia44;

public class Pessoa {
	
	private String nome;
	private String endereco;
	private String cpf;
	private int telefone;
	private int idade;
	
	public Pessoa(String n, String e, String c, int t, int i) {
		
		super();
		this.nome = n;
		this.endereco = e;
		this.cpf = c;
		this.telefone = t;
		this.idade = i;
		
		
	}
	
	
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getEndereco() {
		return endereco;
	}



	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}



	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public int getTelefone() {
		return telefone;
	}



	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}



	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}



	public void validarCpf() {
		
		if(getCpf().length()!=11) {
			
			System.out.println("\nCPF Inválido!");
		
		} else {
			
			System.out.println("\nCPF Válido.");
		}
	}
	
}
