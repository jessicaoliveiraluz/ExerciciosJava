package JavaCollection3;

import java.util.List;
import java.util.ArrayList;

public class TestandoListas {

	public static void main(String[] args) {
		
		String aula1 ="Modelando a classe Aula"; //Instanciando uma vari�vel do tipo String;
		String aula2 = "Conhecendo mais de listas"; //Instanciando uma vari�vel do tipo String;
		String aula3 = "Trabalhando com Cursos e Sets"; //Instanciando uma vari�vel do tipo String;
		
		ArrayList<String> aulas = new ArrayList<>(); //Criando uma lista do tipo ArrayList;
		aulas.add(aula1); //Est� add a vari�vel aula1 na lista aulas;
		aulas.add(aula2); //Est� add a vari�vel aula2 na lista aulas;
		aulas.add(aula3); //Est� add a vari�vel aula3 na lista aulas;
		
		System.out.println(aulas); //Printando no console a lista em forma de vetor;
		System.out.println(aulas.size()); //Printando no console a quantidade de informa��es add na lista;
		
		// cuidado! <= faz sentido aqui? // O que estava dando errado era que quando chegava na condi��o de 3<=3 ele contuniava executando, sendo que n�o existe esse dado na lista.
		for (int i = 0; i <= aulas.size() -1; i++) { //Condi��o de repeti��o, onde o erro estava condi��o imposta, poderiamos tirar somente o igual ou adicionar -1.
		System.out.println("Aula: " + aulas.get(i)); //Printando no console o dado na posi��o i da lista;
		}
		}
}
