package JavaCollection2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
	
public class MinhasCollections {
	public static void main(String[] args) {
	List<Integer> minhaLista = new ArrayList<Integer>(); //Cria uma lista do tipo Inteiro.
	minhaLista.add(1); //Adicionando o número 1 para a lista.
	minhaLista.add(2); //Adicionando o número 2 para a lista.
	minhaLista.add(2); //Adicionando o número 2 para a lista.
	
	for (Integer listaElementos : minhaLista) { // É um for each para repetição.
	System.out.println(listaElementos); //Ele está mostrando no Console cada dado da lista.
	}
	Set<Integer> meuSet = new HashSet<Integer>(); //Cria uma lista do tipo Inteiro, sendo que é um outro tipo de lista chamada HashSet.
	meuSet.add(1); //Adicionando o número 1 para a lista.
	meuSet.add(2); //Adicionando o número 2 para a lista.
	meuSet.add(3); //Adicionando o número 3 para a lista.
	meuSet.add(1); //Esse número 1 não é adicionado na lista, por que ele não consegue repetir valores na lista tipo HashSet.
	Iterator<Integer> iMeuSet = meuSet.iterator(); //Ele está armazenando a minha lista na variável imeuSet do tipo Interator.
	while(iMeuSet.hasNext()){ //Ele repete a lista até a condição ser falsa, quando chegar no final da lista ele encerra a repetição.
	System.out.println(iMeuSet.next()); //Ele está mostrando no Console cada dado da lista.
	}
	}
}
