package herancaPolimorfismosCollection;

public class Cavalo extends Animal {

	private String cor;

	Cavalo(String nome, int idade, String som, String deslocamento, String cor) {

		super(nome, idade, som, deslocamento);
		this.cor = cor;

	}

	public void imprimirInfo2() {

		System.out.println("====================CAVALO==================");
		System.out.println("\nNome: " + nome);
		System.out.println("\nIdade: " + idade);
		System.out.println("\nSom que emite: " + som);
		System.out.println("\nTipo de deslocamento: " + deslocamento);
		System.out.println("\nCor: " + cor);

	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

}
