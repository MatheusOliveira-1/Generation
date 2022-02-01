/*
 * 1) Crie uma classe cliente e apresente os atributos e métodos 
 * referentes esta classe, em seguida crie um objeto cliente, defina 
 * as instancias deste objeto e apresente as informações deste objeto no console.
 */

package exerciciosClasseObjeto;

public class Exercicio1Cliente {
	
	private String nome;
	private String endereco;
	private String telefone;
	private int idade;
	private String cpf;
	
	public Exercicio1Cliente (String nome, String endereco, String telefone, int idade, String cpf) {
		
		
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.idade = idade;
		this.cpf = cpf;
	}
	
	public void ImprimirInfo() {
		
		System.out.println("\t\tDADOS DO CLIENTE");
		System.out.println("\nNome: " + nome + "\nEndereço: " + endereco + "\nTelefone: " + telefone
				+ "\nIdade: " + idade + "\nCPF: "+ cpf);
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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
	

}
