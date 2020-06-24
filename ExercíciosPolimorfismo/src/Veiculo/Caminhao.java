package Veiculo;

public class Caminhao extends veiculo{
	
	private Double toneladas;
	private int alturaMax;
	private int comprimento;
	
	public Double getToneladas() {
		return toneladas;
	}
	
	public void setToneladas(Double toneladas) {
		this.toneladas = toneladas;
	}
	
	public int getAlturaMax() {
		return alturaMax;
	}
	public void setAlturaMax(int alturaMax) {
		this.alturaMax = alturaMax;
	}
	
	public int getComprimento() {
		return comprimento;
	}
	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}
	
	public void entrCam() {
		System.out.println("Entrada de dados " );
		
	}
	public void MostrCam() {
		System.out.println("Mostrar dados " );
		
	}

}
