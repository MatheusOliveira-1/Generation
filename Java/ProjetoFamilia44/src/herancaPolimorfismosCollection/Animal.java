/*
 * 1-	Crie uma hierarquia de classes conforme abaixo com os seguintes
 *  	atributos e comportamentos (observe a tabela), utilize os seus conhecimentos
 *   	e distribua as características de forma que tudo o que for comum a todos os 
 *  	animais fique na classe Animal: 
 */

package herancaPolimorfismosCollection;

public class Animal {
		
	protected String nome;
	protected int idade;
	protected String som;
	protected String deslocamento;
	
	public Animal (String nome, int idade, String som, String deslocamento) {
		
		this.nome = nome;
		this.idade = idade;
		this.som = som;
		this.deslocamento = deslocamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	public String getDeslocamento() {
		return deslocamento;
	}

	public void setDeslocamento(String deslocamento) {
		this.deslocamento = deslocamento;
	}
	
	
	
	
}
