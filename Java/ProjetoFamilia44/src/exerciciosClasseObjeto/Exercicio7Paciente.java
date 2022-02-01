/*
 * 7) Crie uma classe paciente e apresente os atributos e métodos 
 * referentes esta classe, em seguida crie um objeto paciente, defina 
 * as instancias deste objeto e apresente as informações deste objeto no console.
 */



package exerciciosClasseObjeto;

import java.util.Scanner;

public class Exercicio7Paciente {

	
	
	private String nome;
	private String cpf;
	private int idade;
	private String situacao;

	public Exercicio7Paciente(String nome, String cpf, int idade, String situacao) {

		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.situacao = situacao;

	}

	public String getNome() {
		
		return nome;
	}

	public void setNome(String nome) {
		
		
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	
	public void imprimirInfo() {
		
		System.out.println("==========INFORMAÇÕES DO PACIENTE============");
		System.out.println("\nNome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("CPF: " + cpf);
		System.out.println("Situação: " + situacao + "\n\n\n");
	}
	
	public void cadastrarPaciente() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do paciente");
		nome = sc.next();
		System.out.println("Digite a idade do paciente");
		cpf = sc.next();
		System.out.println("Digite o CPF do paciente");
		idade = sc.nextInt();
		System.out.println("Digite a situação do paciente");
		situacao = sc.next();
	}
}
