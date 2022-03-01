package central;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

	class TestCompraParcelada {

		CompraParcelada cp;
	
	@Test
	public void testaTotalDaCompraParcelada1Parcela() {
		
		cp = new CompraParcelada(100, 1, 10);
		assertEquals(110.00, cp.total(), 0.01);
		
	}
	
	@Test
	public void testaTotalDaCompraParcelada2Parcelas() {
		
		cp = new CompraParcelada(100, 2, 10);
		assertEquals(121.00, cp.total(), 0.01);
		
		
	}
	
	@Test
	public void testaTotalDaCompraParcelada5Parcelas() {
		
		
		cp = new CompraParcelada(100, 5, 10);
		assertEquals(161.05, cp.total(), 0.01);
		
		
	}
	
	@Test
	public void testaTotalDaCompraParcelada10Parcelas() {
		

		
		cp = new CompraParcelada(100, 10, 10);
		assertEquals(259.37, cp.total(), 0.01);		
		
	}

}
