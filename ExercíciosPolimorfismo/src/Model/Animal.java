package Model;

public class Animal {
	
	private String nome;
	private int idade;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int geIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void correr() {
		System.out.println("O cachorro " + this.nome + " esta correndo");
	}
	
	public void emitirSom() {
		System.out.println("O cachorro " + this.nome + " esta emitindo som");
	}

}
