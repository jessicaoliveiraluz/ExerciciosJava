package Veiculo;

public class CarroPasseio extends veiculo {
	
	private String cor;
	private String modelo;
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void entrPass() {
		System.out.println("Entrada de dados " );
		
	}
	public void MostrPass() {
		System.out.println("Mostrar dados " );
		
	}

}
