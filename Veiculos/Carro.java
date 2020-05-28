package Veiculos;

public class Carro extends Veiculo {

	private int quantidadeDePortas;
	
	protected Carro(String nome, String cor, int quantidadeDePortas) {
		super(nome, cor, "Carro");
		
		this.quantidadeDePortas = quantidadeDePortas;
	}

	public int getQuantidadeDePortas() {
		return quantidadeDePortas;
	}

	public void setQuantidadeDePortas(int quantidadeDePortas) {
		this.quantidadeDePortas = quantidadeDePortas;
	}
}
