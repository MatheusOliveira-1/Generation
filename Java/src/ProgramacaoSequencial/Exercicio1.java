package ProgramacaoSequencial;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		int dia = 0;
		int mes = 0;
		int ano = 0;
		int idade = 0;
		
		System.out.println("\nResoponda �s quest�es abaixo para calcular sua idade em dias");
		
		System.out.print("\nQuantos anos voc� tem?\n");
		Scanner entrada1 = new Scanner(System.in);
		ano = entrada1.nextInt ();
		
		System.out.println("Voc� tem " + ano + " ano(s) e quantos meses?");
		Scanner entrada2 = new Scanner(System.in);
		mes = entrada2.nextInt ();
		
		System.out.println("S�o " + mes + " mes(es) e quantos dias?");
		Scanner entrada3 = new Scanner(System.in);
		dia = entrada3.nextInt ();
		
		idade = (ano * 365) + (mes * 30) + dia;
		
		System.out.println("\nSua idade � de: " + idade + " dia(s) de vida.");
		
	}
	
}
