package JavaCollection3;

import java.util.List;
import java.util.ArrayList;

public class TestandoListas {

	public static void main(String[] args) {
		
		String aula1 ="Modelando a classe Aula"; //Instanciando uma variável do tipo String;
		String aula2 = "Conhecendo mais de listas"; //Instanciando uma variável do tipo String;
		String aula3 = "Trabalhando com Cursos e Sets"; //Instanciando uma variável do tipo String;
		
		ArrayList<String> aulas = new ArrayList<>(); //Criando uma lista do tipo ArrayList;
		aulas.add(aula1); //Está add a variável aula1 na lista aulas;
		aulas.add(aula2); //Está add a variável aula2 na lista aulas;
		aulas.add(aula3); //Está add a variável aula3 na lista aulas;
		
		System.out.println(aulas); //Printando no console a lista em forma de vetor;
		System.out.println(aulas.size()); //Printando no console a quantidade de informações add na lista;
		
		// cuidado! <= faz sentido aqui? // O que estava dando errado era que quando chegava na condição de 3<=3 ele contuniava executando, sendo que não existe esse dado na lista.
		for (int i = 0; i <= aulas.size() -1; i++) { //Condição de repetição, onde o erro estava condição imposta, poderiamos tirar somente o igual ou adicionar -1.
		System.out.println("Aula: " + aulas.get(i)); //Printando no console o dado na posição i da lista;
		}
		}
}
