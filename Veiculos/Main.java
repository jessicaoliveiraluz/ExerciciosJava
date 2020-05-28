package Veiculos;

public class Main {
	
	public static void main(String[] args) {
		Carro fuscaAzul = new Carro("Fusca", "Azul", 2);
		Moto bizBranca = new Moto("Biz", "Branca");
		
		System.out.println(fuscaAzul.dadosCompletos());
		System.out.println(bizBranca.dadosCompletos());
		
		
	}

}
