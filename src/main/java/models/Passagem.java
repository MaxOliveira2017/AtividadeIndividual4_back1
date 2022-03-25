package models;

public class Passagem {
	private int id;
	private String embarque;
	private String desembarque;
	private double preco;
	private Cliente cliente;
	

	public void setId(int id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getId() {
		return id;
	}
	
	public String getEmbarque() {
		return embarque;
	}
	public void setEmbarque(String embarque) {
		this.embarque = embarque;
	}
	
	public String getDesembarque() {
		return desembarque;
	}
	public void setDesembarque(String desembarque) {
		this.desembarque = desembarque;
	}
	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}

}
