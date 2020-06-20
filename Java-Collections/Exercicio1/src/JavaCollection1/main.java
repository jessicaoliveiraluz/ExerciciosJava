package JavaCollection1;

import java.util.ArrayList;
import java.util.List;


public class main {

	public static void main(String[] args) {
		
		List<telefone> lista = new ArrayList<telefone>();
		
		for(int i = 0; i < 5; i++){
			telefone telefone = new telefone();
			telefone.cadastrar();
			lista.add(telefone);
		}

		for(telefone t: lista) {
			System.out.println("Meu número de telefone é: " + t.nrTelefone + "\nE o tipo de telefone é: " + t.tipoTelefone);
		}
			
	}

}
