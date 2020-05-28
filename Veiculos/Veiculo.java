package Veiculos;

public class Veiculo {
	
	private String nome;
	
	private String cor;
	
	private String tipo;

	private int velocidade;
	
	protected Veiculo(String nome, String cor, String tipo) {
		this.nome = nome;
		this.cor = cor;
		this.tipo = tipo;
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
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public String dadosCompletos() {
		return this.getNome() + " é um(a) " + this.getTipo() + " da cor " + this.getCor();
	}
	
	public void acelerar() {
		this.velocidade = this.getVelocidade() + 10;
	}
	
	public void reduzir() {
		this.velocidade = this.getVelocidade() - 10;
		
		if(this.getVelocidade() < 0)
			this.velocidade = 0;
	}

}
