package Model;

public class Cavalo extends Animal {
	
	
	public void correr() {
		System.out.println("O cavalo " + this.getNome() + " esta correndo");
	}
	
	public void emitirSom() {
		System.out.println("O cavalo " + this.getNome() + " esta relinchando");
	}

}
