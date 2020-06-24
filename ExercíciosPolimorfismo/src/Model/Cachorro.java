package Model;

public class Cachorro extends Animal{
	
	
	
	public void correrCachorro() {
		System.out.println("O cachorro " + this.getNome() + " esta correndo");
	}
	
	public void emitirSomCachorro() {
		System.out.println("O cachorro " + this.getNome() + " esta emitindo som au au au");
	}

}
