package Eletrodomesticos;

public class Main {
	
	public static void main(String[] args) {

		Eletrodomestico geladeira = new Eletrodomestico("geladeira", "preta", 220);
		
		System.out.println(geladeira.todosDados());
	}

}
