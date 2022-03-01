package central;

public class CompraParcelada extends Compra {
	
	private int quantParcelas;
	private double jurosMensais;
	
	public CompraParcelada (double valorCompra, int quantParcelas, double jurosMensais) {
		
		super(valorCompra);
		this.quantParcelas = quantParcelas;
		this.jurosMensais = jurosMensais;
	}
	
	@Override
	public double total() {
		
		return valorDaCompra * Math.pow((1 + jurosMensais/100), quantParcelas);
		
	}
	
}

