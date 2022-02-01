package exerciciosClasseObjeto;

import java.text.NumberFormat;

public class Exercicio6ContaBancaria {
	
	private String proprietario;
	private float saldo;
	private float limite;
	private String banco;
	private int agencia;
	private int numero;
	
	public Exercicio6ContaBancaria (String p, float s, float l, String b, int a, int n) {
		
		proprietario = p;
		saldo = s;
		limite = l;
		banco = b;
		agencia = a;
		numero = n;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void imprimirInfo() {
		
		System.out.println("============INFORMAÇÕES DA CONTA BANCÁRIA==========");
		System.out.println("Proprietário: " + proprietario);
		System.out.println("Banco: " + banco);
		System.out.println("Agencia: " + agencia );
		System.out.println("Número da conta: " + numero);
		System.out.println("Saldo: " + formatarSaldo());
		System.out.println("Limite: " + formatarLimite());
	}
	
	public String formatarSaldo() {
		
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		
		String formataSaldo = nf.format(saldo);
		
		return formataSaldo;
		
	}
	
public String formatarLimite() {
		
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		
		String formataLimite = nf.format(limite);
		
		return formataLimite;
		
	}

}
