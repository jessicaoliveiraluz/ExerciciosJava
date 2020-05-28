package Eletrodomesticos;

public class Eletrodomestico {
	
	private String nome;
	
	private String cor;
	
	private int voltagem;

	public Eletrodomestico(String nome, String cor, int voltagem) {
		this.nome = nome;
		this.cor = cor;
		this.voltagem = voltagem;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}
	
	public String todosDados() {
		return "Um " + this.getNome() + " de cor " + this.getCor() + " tem voltagem " + this.getVoltagem() + "V";
	}

}
