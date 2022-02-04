package Familia44;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <Integer> lista = new ArrayList<Integer>(); // criando um list do tipo ArrayList instanciado com um objeto chamado lista
		
		lista.add(2);// adicionando elementos para o meu ArrayList
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(1);
		lista.add(2);
		lista.add(5);
		
		for(Integer listaElementos:lista) // estou criando um la�o de repeti��o para percorrer o meu ArrayList
		{
			System.out.println(listaElementos);//vai imprimir todos os elementos do meu ArrayList
		}
		
		System.out.println("\nRemovendo um elemento da lista...");
		
		System.out.println();
		
		lista.remove(0);//remover um elemento do meu ArrayList
		
		for(Integer listaElementos:lista)
		{
			System.out.println(listaElementos);
		}
		
		int primeiroElemento = lista.get(0);//pegar um elemento a partir da posi��o do meu AraayList
		System.out.println("\nO primeiro elemento �: "+primeiroElemento);
		System.out.println();
		
		for(int i=0;i<lista.size();i++)//m�todo size: verifica o tamanho do ArrayList
		{
			System.out.println("\nElemento: "+lista.get(i));
		}
		
		Collections.sort(lista);//ordena os elementos do meu ArrayList
		
		System.out.println("\nDepois de ordenado...");
		System.out.println(lista);
		
		Set <Integer> meuSet = new HashSet<Integer>();//cria��o da minha interface Set do tipo HashSet
		
		meuSet.add(3);
		meuSet.add(1);
		meuSet.add(6);
		meuSet.add(1);
		meuSet.add(2);
		meuSet.add(7);
		
		//meuSet.addAll(lista);
		
		Iterator <Integer> iMeuSet = meuSet.iterator();//API para modificar o hashSet criado
		
		while(iMeuSet.hasNext()) //percorre todos os elementos do iMeuSet at� encontrar uma posi��o vazia, com isso, ele sai do la�o de repeti��o
		{
			System.out.println(iMeuSet.next());//imprime sempre o pr�ximo elemento
		}
		
		
		
		
	}

}
