package central;

public class Compra {
	
	protected double valorDaCompra;
	
	public Compra (double valorCompra) {
		this.valorDaCompra = valorCompra;
	}
	
	public double total() {
		return valorDaCompra;
	}

}
