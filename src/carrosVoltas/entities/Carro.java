package carrosVoltas.entities;

public class Carro {
	private String nome;
	private String model;
	private int tempoPorVolta;
	
	public Carro() {
		
	}
	
	public Carro(String nome, String model, int tempoPorVolta) {
		this.nome = nome;
		this.model = model;
		this.tempoPorVolta = tempoPorVolta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getTempoPorVolta() {
		return tempoPorVolta;
	}

	public void setTempoPorVolta(int tempoPorVolta) {
		this.tempoPorVolta = tempoPorVolta;
	}
	
	
	

}
