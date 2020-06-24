package Model;

public class Veterinario extends Animal {
	
	public void examinar() {
		System.out.println("O veterinario examina " + this.getNome() );
	    this.emitirSom();
	}
}
