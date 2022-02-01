package exerciciosClasseObjeto;

import java.text.NumberFormat;

public class Exercicio5Patinete {

	private float valor;
	private String cor;
	private String material;
	private int numRodas;

	Exercicio5Patinete(int v, String c, String m, int n) {

		this.valor = v;
		this.cor = c;
		this.material = m;
		this.numRodas = n;

	}
	
	public void ImprimirInfo() {
		System.out.println("==============INFORMA��ES DO PATINETE==============");
		System.out.println("\nValor: " + formatarNumero() + "\nCor: " + cor + "\nMaterial: " + material 
							+ "\nN�mero de rodas: " + numRodas);
	}
	
	public String formatarNumero() {
		
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		
		String formatoMoeda = nf.format(valor);
		
		return formatoMoeda;
		
	}
}
