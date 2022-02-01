package exerciciosClasseObjeto;

import java.util.Scanner;

public class Exercicio7TestaPaciente {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int op;

		Exercicio7Paciente paciente1 = new Exercicio7Paciente("", "", 0, "");

		do {
			System.out.println("\n------------ESCOLHA UMA DAS OP��ES-------------");
			System.out.println("[1]\tCadastrar Paciente");
			System.out.println("[2]\tImprimir informa��es do paciente");
			System.out.println("[0]\tSair");
			op = leia.nextInt();

			switch (op) {

			case 0:
				System.out.println("Opera��o finalizada...");
				break;

			case 1:
				paciente1.cadastrarPaciente();
				break;

			case 2:
				paciente1.imprimirInfo();
				break;

			default:
				if (op != 0) {
					System.out.println("Op��o inv�lida!\n\n");
				}
			}
		} while (op != 0);
	}

}
