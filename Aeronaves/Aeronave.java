package Aeronaves;

public class Aeronave {
	
	private String nome;
	
	private String modelo;
	
	public Aeronave(String nome, String modelo) {
		this.nome = nome;
		this.modelo = modelo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String todosDados() {
		return "Aeronave " + this.getNome() + " de modelo " + this.getModelo();
 	}

}
