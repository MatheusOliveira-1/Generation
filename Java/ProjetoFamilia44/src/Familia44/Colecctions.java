
package Familia44;

import java.util.ArrayList;
import java.util.Scanner;

public class Collections2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int op;
		Scanner leia = new Scanner(System.in);
		
		ArrayList <String> estoque = new ArrayList();
		
		do
		{
			System.out.println("\n-----------------------------------------------------");
			System.out.println("\n(1) Deseja adicionar um produto no estoque?");
			System.out.println("\n(2) Deseja remover um produto do estoque?");
			System.out.println("\n(3) Deseja atualizar um produto no estoque?");
			System.out.println("\n(4) Deseja mostrar todos os produtos do estoque");
			System.out.println("\n(0) Deseja encerrar o programa?");
			System.out.println("\n-----------------------------------------------------");
			System.out.println("\nDigite sua op��o: ");
			op = leia.nextInt();
			
			switch(op)
			{
			case 1:
				leia.nextLine();
				System.out.println("\nDigite o produto para adicionar ao estoque: ");
				String produto = leia.nextLine();//verifica se o usu�rio entrou com um conte�do do tipo String
				estoque.add(produto);//adiciono o produto para dentro do meu ArrayList
				break;
				
			case 2:
				leia.nextLine();
				System.out.println("\nDigite o produto para remover do estoque: ");
				String produtor = leia.nextLine();
				if(estoque.contains(produtor))
				{
					estoque.remove(produtor);
				}
				else
				{
					System.out.println("\nProduto n�o existe!!!");
				}
				System.out.println(estoque);
				break;
				
			case 3: 
				leia.nextLine();
				System.out.println("\nDigite o produto que deseja atualizar: ");
				String verifica = leia.nextLine();
				System.out.println("\nDigite o produto que entrar� no lugar do(a) "+verifica+ " : ");
				String novo = leia.nextLine();
				
				if(estoque.contains(verifica))//V
				{
					estoque.remove(verifica);
					estoque.add(novo);
				}
				else
				{
					System.out.println("\nProduto n�o existe!!!");
				}
				System.out.println(estoque);
				break;
				
			case 4:
				System.out.println("\nOs produtos que temos no estoque s�o: ");
				System.out.println(estoque);
				break;
				
			default:
					if(op==0)
					{
						System.out.println("\nMuito obrigado por utilizar o nosso sistema...");
					}
					else
					{
						System.out.println("\nOp��o inexistente, por favor digite a op��o correta...");
					}
			}
			
		}
		while(op!=0);
	}

