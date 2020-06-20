package JavaCollection2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
	
public class MinhasCollections {
	public static void main(String[] args) {
	List<Integer> minhaLista = new ArrayList<Integer>(); //Cria uma lista do tipo Inteiro.
	minhaLista.add(1); //Adicionando o n�mero 1 para a lista.
	minhaLista.add(2); //Adicionando o n�mero 2 para a lista.
	minhaLista.add(2); //Adicionando o n�mero 2 para a lista.
	
	for (Integer listaElementos : minhaLista) { // � um for each para repeti��o.
	System.out.println(listaElementos); //Ele est� mostrando no Console cada dado da lista.
	}
	Set<Integer> meuSet = new HashSet<Integer>(); //Cria uma lista do tipo Inteiro, sendo que � um outro tipo de lista chamada HashSet.
	meuSet.add(1); //Adicionando o n�mero 1 para a lista.
	meuSet.add(2); //Adicionando o n�mero 2 para a lista.
	meuSet.add(3); //Adicionando o n�mero 3 para a lista.
	meuSet.add(1); //Esse n�mero 1 n�o � adicionado na lista, por que ele n�o consegue repetir valores na lista tipo HashSet.
	Iterator<Integer> iMeuSet = meuSet.iterator(); //Ele est� armazenando a minha lista na vari�vel imeuSet do tipo Interator.
	while(iMeuSet.hasNext()){ //Ele repete a lista at� a condi��o ser falsa, quando chegar no final da lista ele encerra a repeti��o.
	System.out.println(iMeuSet.next()); //Ele est� mostrando no Console cada dado da lista.
	}
	}
}
