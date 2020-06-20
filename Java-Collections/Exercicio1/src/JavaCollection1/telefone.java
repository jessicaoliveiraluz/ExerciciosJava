package JavaCollection1;

import java.util.Scanner;

public class telefone {
	
	String nrTelefone;
	int tipoTelefone;
	
	public void cadastrar(){
		
		Scanner Entrada = new Scanner(System.in);
		System.out.println("Digite o número de telefone: ");
		
		this.nrTelefone= Entrada.next();
		System.out.println("Qual o tipo do telefone: ");
		
		this.tipoTelefone= Entrada.nextInt();
			
	}
}
